package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesLabelsMod.Labels
import typings.gitlab.distServicesMod.LabelId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Labels", JSImport.Namespace)
@js.native
object distServicesLabelsMod extends js.Object {
  @js.native
  trait Labels extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId, labelName: String, color: String): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, labelName: String, color: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, labelName: String): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, labelName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, labelName: String): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, labelName: String, options: Sudo): js.Promise[js.Object] = js.native
    def subscribe(projectId: ProjectId, labelId: LabelId): js.Promise[js.Object] = js.native
    def subscribe(projectId: ProjectId, labelId: LabelId, options: Sudo): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: ProjectId, labelId: LabelId): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: ProjectId, labelId: LabelId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Labels
  
}

