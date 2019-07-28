package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Volume")
@js.native
class Volume protected () extends js.Object {
  def this(modem: js.Any, name: String) = this()
  var modem: js.Any = js.native
  var name: String = js.native
  def inspect(): js.Promise[VolumeInspectInfo] = js.native
  def inspect(callback: Callback[VolumeInspectInfo]): Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: Callback[_]): Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: Callback[_]): Unit = js.native
}

