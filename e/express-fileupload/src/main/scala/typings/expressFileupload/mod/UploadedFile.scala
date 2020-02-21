package typings.expressFileupload.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadedFile extends js.Object {
  /** A buffer representation of your file, returns empty buffer in case useTempFiles option was set to true. */
  var data: Buffer = js.native
  /** Encoding type of the file */
  var encoding: String = js.native
  /** MD5 checksum of the uploaded file */
  var md5: String = js.native
  /** The mimetype of your file */
  var mimetype: String = js.native
  /** file name */
  var name: String = js.native
  /** Uploaded size in bytes */
  var size: Double = js.native
  /** A path to the temporary file in case useTempFiles option was set to true. */
  var tempFilePath: String = js.native
  /** A boolean that represents if the file is over the size limit */
  var truncated: Boolean = js.native
  def mv(path: String): js.Promise[Unit] = js.native
  /** A function to move the file elsewhere on your server */
  def mv(path: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

