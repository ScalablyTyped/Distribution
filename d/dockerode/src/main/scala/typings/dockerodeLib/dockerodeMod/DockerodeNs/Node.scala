package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var id: java.lang.String = js.native
  var modem: js.Any = js.native
  def inspect(): js.Promise[_] = js.native
  def inspect(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def update(): js.Promise[_] = js.native
  def update(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def update(options: js.Object): js.Promise[_] = js.native
  def update(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

