package typings.fileSaver.mod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-saver", "saveAs")
@js.native
object saveAs extends js.Object {
  def apply(data: String): Unit = js.native
  def apply(data: String, filename: js.UndefOr[scala.Nothing], disableAutoBOM: Boolean): Unit = js.native
  def apply(data: String, filename: js.UndefOr[scala.Nothing], options: FileSaverOptions): Unit = js.native
  def apply(data: String, filename: String): Unit = js.native
  def apply(data: String, filename: String, disableAutoBOM: Boolean): Unit = js.native
  def apply(data: String, filename: String, options: FileSaverOptions): Unit = js.native
  /**
    * FileSaver.js implements the saveAs() FileSaver interface in browsers that do not natively support it.
    * @param data - The actual file data blob or URL.
    * @param filename - The optional name of the file to be downloaded. If omitted, the name used in the file data will be used. If none is provided "download" will be used.
    * @param options - Optional FileSaver.js config
    */
  def apply(data: Blob): Unit = js.native
  def apply(data: Blob, filename: js.UndefOr[scala.Nothing], disableAutoBOM: Boolean): Unit = js.native
  def apply(data: Blob, filename: js.UndefOr[scala.Nothing], options: FileSaverOptions): Unit = js.native
  def apply(data: Blob, filename: String): Unit = js.native
  def apply(data: Blob, filename: String, disableAutoBOM: Boolean): Unit = js.native
  def apply(data: Blob, filename: String, options: FileSaverOptions): Unit = js.native
}

