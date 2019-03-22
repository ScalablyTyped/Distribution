package typings
package gitlabLib.distLatestTemplatesResourceIssueBoardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIssueBoards
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def create(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    name: java.lang.String
  ): js.Promise[_] = js.native
  def createList(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    boardId: BoardId,
    labelId: LabelId
  ): js.Promise[_] = js.native
  def edit(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    boardId: BoardId,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def editList(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    boardId: BoardId,
    listId: ListId,
    position: Position
  ): js.Promise[_] = js.native
  def lists(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    boardId: BoardId
  ): js.Promise[_] = js.native
  def remove(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    boardId: BoardId
  ): js.Promise[_] = js.native
  def removeList(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    boardId: BoardId,
    listId: ListId
  ): js.Promise[_] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    boardId: BoardId
  ): js.Promise[_] = js.native
  def showList(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    boardId: BoardId,
    listId: ListId
  ): js.Promise[_] = js.native
}

