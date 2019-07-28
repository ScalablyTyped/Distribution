package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Exec")
@js.native
class Exec protected () extends js.Object {
  def this(modem: js.Any, id: String) = this()
  var id: String = js.native
  var modem: js.Any = js.native
  def inspect(): js.Promise[_] = js.native
  def inspect(callback: Callback[_]): Unit = js.native
  def resize(options: js.Object): js.Promise[_] = js.native
  def resize(options: js.Object, callback: Callback[_]): Unit = js.native
  def start(options: js.Object): js.Promise[_] = js.native
  def start(options: js.Object, callback: Callback[_]): Unit = js.native
}

