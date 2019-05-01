package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Secret")
@js.native
class Secret protected () extends js.Object {
  def this(modem: js.Any, id: java.lang.String) = this()
  var id: java.lang.String = js.native
  var modem: js.Any = js.native
  def inspect(): js.Promise[SecretInfo] = js.native
  def inspect(callback: Callback[SecretInfo]): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[_]): scala.Unit = js.native
  def update(): js.Promise[_] = js.native
  def update(callback: Callback[_]): scala.Unit = js.native
  def update(options: js.Object): js.Promise[_] = js.native
  def update(options: js.Object, callback: Callback[_]): scala.Unit = js.native
}

