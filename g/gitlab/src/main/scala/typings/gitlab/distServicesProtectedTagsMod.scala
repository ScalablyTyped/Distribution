package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesProtectedTagsMod.ProtectedTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProtectedTags", JSImport.Namespace)
@js.native
object distServicesProtectedTagsMod extends js.Object {
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

