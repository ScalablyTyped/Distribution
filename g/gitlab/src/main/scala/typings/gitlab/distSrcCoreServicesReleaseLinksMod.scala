package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesReleaseLinksMod.ReleaseLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/ReleaseLinks", JSImport.Namespace)
@js.native
object distSrcCoreServicesReleaseLinksMod extends js.Object {
  @js.native
  trait ReleaseLinks extends BaseService {
    def all(projectId: ProjectId, tagName: String): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, tagName: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId, tagName: String, name: String, url: String): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, tagName: String, name: String, url: String, options: Sudo): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, tagName: String, linkId: Double, options: Sudo with (Anon_Name | Anon_Url)): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, tagName: String, linkId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, tagName: String, linkId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, tagName: String, linkId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends ReleaseLinks
  
}

