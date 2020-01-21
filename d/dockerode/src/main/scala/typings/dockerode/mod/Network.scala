package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Network")
@js.native
class Network protected () extends js.Object {
  def this(modem: js.Any, id: String) = this()
  var Type: String = js.native
  var id: String = js.native
  var modem: js.Any = js.native
  def connect(): js.Promise[_] = js.native
  def connect(callback: Callback[_]): Unit = js.native
  def connect(options: js.Object): js.Promise[_] = js.native
  def connect(options: js.Object, callback: Callback[_]): Unit = js.native
  def disconnect(): js.Promise[_] = js.native
  def disconnect(callback: Callback[_]): Unit = js.native
  def disconnect(options: js.Object): js.Promise[_] = js.native
  def disconnect(options: js.Object, callback: Callback[_]): Unit = js.native
  def inspect(): js.Promise[_] = js.native
  def inspect(callback: Callback[_]): Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[_]): Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[_]): Unit = js.native
}

