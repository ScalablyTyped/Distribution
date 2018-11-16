package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.native
  var modem: js.Any = js.native
  def inspect(): stdLib.Promise[_] = js.native
  def inspect(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(): stdLib.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): stdLib.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def update(options: js.Object): stdLib.Promise[_] = js.native
  def update(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

