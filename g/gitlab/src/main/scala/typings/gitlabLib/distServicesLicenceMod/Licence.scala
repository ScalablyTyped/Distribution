package typings
package gitlabLib.distServicesLicenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Licence
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
}

