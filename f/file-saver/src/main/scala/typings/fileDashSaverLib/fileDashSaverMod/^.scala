package typings
package fileDashSaverLib.fileDashSaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-saver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def saveAs(data: java.lang.String): scala.Unit = js.native
  def saveAs(data: java.lang.String, filename: java.lang.String): scala.Unit = js.native
  def saveAs(data: java.lang.String, filename: java.lang.String, disableAutoBOM: scala.Boolean): scala.Unit = js.native
  /**
    * FileSaver.js implements the saveAs() FileSaver interface in browsers that do not natively support it.
    * @param data - The actual file data blob or URL.
    * @param filename - The optional name of the file to be downloaded. If omitted, the name used in the file data will be used. If none is provided "download" will be used.
    * @param disableAutoBOM - Optional & defaults to `false`. Set to `true` if you want FileSaver.js to automatically provide Unicode text encoding hints
    */
  def saveAs(data: stdLib.Blob): scala.Unit = js.native
  def saveAs(data: stdLib.Blob, filename: java.lang.String): scala.Unit = js.native
  def saveAs(data: stdLib.Blob, filename: java.lang.String, disableAutoBOM: scala.Boolean): scala.Unit = js.native
}

