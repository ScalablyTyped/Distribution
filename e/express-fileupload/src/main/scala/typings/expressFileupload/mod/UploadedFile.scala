package typings.expressFileupload.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadedFile extends js.Object {
  var data: Buffer = js.native
  var encoding: String = js.native
  var md5: String = js.native
  var mimetype: String = js.native
  var name: String = js.native
  var size: Double = js.native
  var tempFilePath: String = js.native
  var truncated: Boolean = js.native
  def mv(path: String): js.Promise[Unit] = js.native
  def mv(path: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

