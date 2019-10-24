package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesProtectedTagsMod.ProtectedTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/ProtectedTags", JSImport.Namespace)
@js.native
object distSrcCoreServicesProtectedTagsMod extends js.Object {
  @js.native
  trait ProtectedTags extends BaseService {
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def protect(projectId: ProjectId, tagName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def unprotect(projectId: ProjectId, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends ProtectedTags
  
}

