package typings.googleDashAppsDashScript.GoogleAppsScript.Content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

