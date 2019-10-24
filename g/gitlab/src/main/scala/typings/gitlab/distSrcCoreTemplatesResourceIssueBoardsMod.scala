package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.LabelId
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceIssueBoardsMod.ResourceIssueBoards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceIssueBoards", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceIssueBoardsMod extends js.Object {
  @js.native
  trait ResourceIssueBoards extends BaseService {
    def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(resourceId: ResourceId, name: String): js.Promise[js.Object] = js.native
    def create(resourceId: ResourceId, name: String, options: Sudo): js.Promise[js.Object] = js.native
    def createList(resourceId: ResourceId, boardId: Double, labelId: LabelId): js.Promise[js.Object] = js.native
    def createList(resourceId: ResourceId, boardId: Double, labelId: LabelId, options: Sudo): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, boardId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, boardId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def editList(resourceId: ResourceId, boardId: Double, listId: Double, position: Double): js.Promise[js.Object] = js.native
    def editList(resourceId: ResourceId, boardId: Double, listId: Double, position: Double, options: Sudo): js.Promise[js.Object] = js.native
    def lists(resourceId: ResourceId, boardId: Double): js.Promise[GetResponse] = js.native
    def lists(resourceId: ResourceId, boardId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def remove(resourceId: ResourceId, boardId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, boardId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeList(resourceId: ResourceId, boardId: Double, listId: Double): js.Promise[js.Object] = js.native
    def removeList(resourceId: ResourceId, boardId: Double, listId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: ResourceId, boardId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId, boardId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def showList(resourceId: ResourceId, boardId: Double, listId: Double): js.Promise[GetResponse] = js.native
    def showList(resourceId: ResourceId, boardId: Double, listId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default protected () extends ResourceIssueBoards {
    def this(resourceType: String, options: js.Any) = this()
  }
  
}

