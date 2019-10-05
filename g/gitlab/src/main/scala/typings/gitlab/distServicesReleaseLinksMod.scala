package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesReleaseLinksMod.ReleaseLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ReleaseLinks", JSImport.Namespace)
@js.native
object distServicesReleaseLinksMod extends js.Object {
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

