package typings.googleAppsScript.GoogleAppsScript.Content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextOutput object that can be served from a script.
  *
  * Due to security considerations, scripts cannot directly return text content to a browser.
  * Instead, the browser is redirected to googleusercontent.com, which will display it without any
  * further sanitization or manipulation.
  *
  * You can return text content like this:
  *
  *     function doGet() {
  *       return ContentService.createTextOutput("hello world!");
  *     }
  *
  * ContentService
  */
trait TextOutput extends js.Object {
  def append(addedContent: String): TextOutput
  def clear(): TextOutput
  def downloadAsFile(filename: String): TextOutput
  def getContent(): String
  def getFileName(): String
  def getMimeType(): MimeType
  def setContent(content: String): TextOutput
  def setMimeType(mimeType: MimeType): TextOutput
}

object TextOutput {
  @scala.inline
  def apply(
    append: String => TextOutput,
    clear: () => TextOutput,
    downloadAsFile: String => TextOutput,
    getContent: () => String,
    getFileName: () => String,
    getMimeType: () => MimeType,
    setContent: String => TextOutput,
    setMimeType: MimeType => TextOutput
  ): TextOutput = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), clear = js.Any.fromFunction0(clear), downloadAsFile = js.Any.fromFunction1(downloadAsFile), getContent = js.Any.fromFunction0(getContent), getFileName = js.Any.fromFunction0(getFileName), getMimeType = js.Any.fromFunction0(getMimeType), setContent = js.Any.fromFunction1(setContent), setMimeType = js.Any.fromFunction1(setMimeType))
  
    __obj.asInstanceOf[TextOutput]
  }
}

