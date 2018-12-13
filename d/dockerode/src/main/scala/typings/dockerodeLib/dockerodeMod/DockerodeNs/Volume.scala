package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume extends js.Object {
  var modem: js.Any = js.native
  var name: java.lang.String = js.native
  def inspect(): js.Promise[_] = js.native
  def inspect(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(): js.Promise[_] = js.native
  def remove(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
  def remove(options: js.Object): js.Promise[_] = js.native
  def remove(options: js.Object, callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

