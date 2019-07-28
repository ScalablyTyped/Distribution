package typings.gitlab.distTemplatesResourceIssueBoardsMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.LabelId
import typings.gitlab.distServicesMod.ResourceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIssueBoards extends BaseService {
  def all(resourceId: ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(resourceId: ResourceId, name: String): js.Promise[js.Object] = js.native
  def create(resourceId: ResourceId, name: String, options: Sudo): js.Promise[js.Object] = js.native
  def createList(resourceId: ResourceId, boardId: Double, labelId: LabelId): js.Promise[js.Object] = js.native
  def createList(resourceId: ResourceId, boardId: Double, labelId: LabelId, options: Sudo): js.Promise[js.Object] = js.native
  def edit(resourceId: ResourceId, boardId: Double): js.Promise[js.Object] = js.native
  def edit(resourceId: ResourceId, boardId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def editList(resourceId: ResourceId, boardId: Double, listId: Double, position: Double): js.Promise[js.Object] = js.native
  def editList(resourceId: ResourceId, boardId: Double, listId: Double, position: Double, options: Sudo): js.Promise[js.Object] = js.native
  def lists(resourceId: ResourceId, boardId: Double): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def lists(resourceId: ResourceId, boardId: Double, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(resourceId: ResourceId, boardId: Double): js.Promise[js.Object] = js.native
  def remove(resourceId: ResourceId, boardId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def removeList(resourceId: ResourceId, boardId: Double, listId: Double): js.Promise[js.Object] = js.native
  def removeList(resourceId: ResourceId, boardId: Double, listId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def show(resourceId: ResourceId, boardId: Double): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(resourceId: ResourceId, boardId: Double, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showList(resourceId: ResourceId, boardId: Double, listId: Double): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showList(resourceId: ResourceId, boardId: Double, listId: Double, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

