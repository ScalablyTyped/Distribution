package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  var Type: java.lang.String = js.native
  var id: java.lang.String = js.native
  var modem: js.Any = js.native
  def connect(): js.Promise[_] = js.native
  def connect(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def connect(options: js.Object): js.Promise[_] = js.native
  def connect(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def disconnect(): js.Promise[_] = js.native
  def disconnect(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def disconnect(options: js.Object): js.Promise[_] = js.native
  def disconnect(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def inspect(): js.Promise[_] = js.native
  def inspect(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

