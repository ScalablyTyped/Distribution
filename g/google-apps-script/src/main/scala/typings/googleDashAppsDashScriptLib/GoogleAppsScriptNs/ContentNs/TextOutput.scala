package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOutput extends js.Object {
  def append(addedContent: java.lang.String): TextOutput
  def clear(): TextOutput
  def downloadAsFile(filename: java.lang.String): TextOutput
  def getContent(): java.lang.String
  def getFileName(): java.lang.String
  def getMimeType(): MimeType
  def setContent(content: java.lang.String): TextOutput
  def setMimeType(mimeType: MimeType): TextOutput
}

object TextOutput {
  @scala.inline
  def apply(
    append: java.lang.String => TextOutput,
    clear: () => TextOutput,
    downloadAsFile: java.lang.String => TextOutput,
    getContent: () => java.lang.String,
    getFileName: () => java.lang.String,
    getMimeType: () => MimeType,
    setContent: java.lang.String => TextOutput,
    setMimeType: MimeType => TextOutput
  ): TextOutput = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), clear = js.Any.fromFunction0(clear), downloadAsFile = js.Any.fromFunction1(downloadAsFile), getContent = js.Any.fromFunction0(getContent), getFileName = js.Any.fromFunction0(getFileName), getMimeType = js.Any.fromFunction0(getMimeType), setContent = js.Any.fromFunction1(setContent), setMimeType = js.Any.fromFunction1(setMimeType))
  
    __obj.asInstanceOf[TextOutput]
  }
}

