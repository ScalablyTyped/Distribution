package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Node")
@js.native
class Node protected () extends js.Object {
  def this(modem: js.Any, id: String) = this()
  var id: String = js.native
  var modem: js.Any = js.native
  def inspect(): js.Promise[_] = js.native
  def inspect(callback: Callback[_]): Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[_]): Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[_]): Unit = js.native
  def update(): js.Promise[_] = js.native
  def update(callback: Callback[_]): Unit = js.native
  def update(options: js.Object): js.Promise[_] = js.native
  def update(options: js.Object, callback: Callback[_]): Unit = js.native
}

