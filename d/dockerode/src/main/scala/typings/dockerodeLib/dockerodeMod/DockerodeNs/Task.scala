package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  var id: java.lang.String = js.native
  var modem: js.Any = js.native
  def inspect(): js.Promise[_] = js.native
  def inspect(callback: dockerodeLib.Callback[_]): scala.Unit = js.native
}

