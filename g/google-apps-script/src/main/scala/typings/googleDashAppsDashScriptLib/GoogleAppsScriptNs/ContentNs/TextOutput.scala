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
    append: js.Function1[java.lang.String, TextOutput],
    clear: js.Function0[TextOutput],
    downloadAsFile: js.Function1[java.lang.String, TextOutput],
    getContent: js.Function0[java.lang.String],
    getFileName: js.Function0[java.lang.String],
    getMimeType: js.Function0[MimeType],
    setContent: js.Function1[java.lang.String, TextOutput],
    setMimeType: js.Function1[MimeType, TextOutput]
  ): TextOutput = {
    val __obj = js.Dynamic.literal(append = append, clear = clear, downloadAsFile = downloadAsFile, getContent = getContent, getFileName = getFileName, getMimeType = getMimeType, setContent = setContent, setMimeType = setMimeType)
  
    __obj.asInstanceOf[TextOutput]
  }
}

