package typings
package gitlabLib.distServicesKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keys
  extends gitlabLib.distInfrastructureMod.BaseService {
  def show(keyId: gitlabLib.KeyId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(keyId: gitlabLib.KeyId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

