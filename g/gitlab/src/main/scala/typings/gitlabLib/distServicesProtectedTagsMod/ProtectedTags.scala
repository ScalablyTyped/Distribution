package typings
package gitlabLib.distServicesProtectedTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectedTags
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def protect(
    projectId: gitlabLib.distServicesMod.ProjectId,
    tagName: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    tagName: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def unprotect(
    projectId: gitlabLib.distServicesMod.ProjectId,
    tagName: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
}

