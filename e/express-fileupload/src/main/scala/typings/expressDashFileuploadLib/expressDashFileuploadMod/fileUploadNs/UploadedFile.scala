package typings
package expressDashFileuploadLib.expressDashFileuploadMod.fileUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadedFile extends js.Object {
  var data: nodeLib.Buffer = js.native
  var encoding: java.lang.String = js.native
  var mimetype: java.lang.String = js.native
  var name: java.lang.String = js.native
  var truncated: scala.Boolean = js.native
  def mv(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mv(path: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

