package typings
package gitlabLib.distServicesApplicationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSettings
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def edit(): js.Promise[js.Object] = js.native
  def edit(options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
}

