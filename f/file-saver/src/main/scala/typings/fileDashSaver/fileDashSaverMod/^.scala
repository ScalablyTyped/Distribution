package typings.fileDashSaver.fileDashSaverMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-saver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def saveAs(data: String): Unit = js.native
  def saveAs(data: String, filename: String): Unit = js.native
  def saveAs(data: String, filename: String, disableAutoBOM: Boolean): Unit = js.native
  def saveAs(data: String, filename: String, options: FileSaverOptions): Unit = js.native
  /**
    * FileSaver.js implements the saveAs() FileSaver interface in browsers that do not natively support it.
    * @param data - The actual file data blob or URL.
    * @param filename - The optional name of the file to be downloaded. If omitted, the name used in the file data will be used. If none is provided "download" will be used.
    * @param options - Optional FileSaver.js config
    */
  /**
    * FileSaver.js implements the saveAs() FileSaver interface in browsers that do not natively support it.
    * @param data - The actual file data blob or URL.
    * @param filename - The optional name of the file to be downloaded. If omitted, the name used in the file data will be used. If none is provided "download" will be used.
    * @param disableAutoBOM - Optional & defaults to `false`. Set to `true` if you want FileSaver.js to automatically provide Unicode text encoding hints
    * @deprecated use `{ autoBom: false }` as the third argument
    */
  // tslint:disable-next-line:unified-signatures
  def saveAs(data: Blob): Unit = js.native
  def saveAs(data: Blob, filename: String): Unit = js.native
  def saveAs(data: Blob, filename: String, disableAutoBOM: Boolean): Unit = js.native
  def saveAs(data: Blob, filename: String, options: FileSaverOptions): Unit = js.native
}

