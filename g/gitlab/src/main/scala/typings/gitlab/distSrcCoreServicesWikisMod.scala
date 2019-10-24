package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesWikisMod.Wikis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Wikis", JSImport.Namespace)
@js.native
object distSrcCoreServicesWikisMod extends js.Object {
  @js.native
  trait Wikis extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, slug: String): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, slug: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, slug: String): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, slug: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, slug: String): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, slug: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Wikis
  
}

