package typings
package gitlabLib.distServicesApplicationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSettings
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(): js.Promise[js.Object] = js.native
  def edit(options: gitlabLib.distInfrastructureMod.BaseRequestOptions): js.Promise[js.Object] = js.native
}

