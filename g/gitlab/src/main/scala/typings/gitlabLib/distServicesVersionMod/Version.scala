package typings
package gitlabLib.distServicesVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version
  extends gitlabLib.distInfrastructureMod.BaseService {
  def show(): js.Promise[gitlabLib.GetResponse] = js.native
  def show(options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

