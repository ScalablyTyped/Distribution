package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerode", "Volume")
@js.native
class Volume protected () extends js.Object {
  def this(modem: js.Any, name: java.lang.String) = this()
  var modem: js.Any = js.native
  var name: java.lang.String = js.native
  def inspect(): js.Promise[VolumeInspectInfo] = js.native
  def inspect(callback: dockerodeLib.Callback[VolumeInspectInfo]): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

