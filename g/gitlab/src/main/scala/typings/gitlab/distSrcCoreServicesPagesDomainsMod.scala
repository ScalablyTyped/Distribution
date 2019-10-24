package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesPagesDomainsMod.PagesDomains
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/PagesDomains", JSImport.Namespace)
@js.native
object distSrcCoreServicesPagesDomainsMod extends js.Object {
  @js.native
  trait PagesDomains extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(hasProjectIdOptions: Anon_ProjectId with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId, domain: String): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, domain: String): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, domain: String): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, domain: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, domain: String): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, domain: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends PagesDomains
  
}

