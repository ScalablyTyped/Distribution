package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesTagsMod.Tags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Tags", JSImport.Namespace)
@js.native
object distSrcCoreServicesTagsMod extends js.Object {
  @js.native
  trait Tags extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, tagName: String): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, tagName: String): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Tags
  
}

