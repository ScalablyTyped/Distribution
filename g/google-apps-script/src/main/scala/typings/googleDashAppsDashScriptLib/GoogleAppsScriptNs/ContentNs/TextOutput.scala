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

