package typings
package gitlabLib.distTemplatesResourceIssueBoardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIssueBoards
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(resourceId: gitlabLib.distServicesMod.ResourceId, name: java.lang.String): js.Promise[js.Object] = js.native
  def create(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    name: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def createList(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    labelId: gitlabLib.distServicesMod.LabelId
  ): js.Promise[js.Object] = js.native
  def createList(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    labelId: gitlabLib.distServicesMod.LabelId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def edit(resourceId: gitlabLib.distServicesMod.ResourceId, boardId: scala.Double): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def editList(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    listId: scala.Double,
    position: scala.Double
  ): js.Promise[js.Object] = js.native
  def editList(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    listId: scala.Double,
    position: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def lists(resourceId: gitlabLib.distServicesMod.ResourceId, boardId: scala.Double): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def lists(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(resourceId: gitlabLib.distServicesMod.ResourceId, boardId: scala.Double): js.Promise[js.Object] = js.native
  def remove(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def removeList(resourceId: gitlabLib.distServicesMod.ResourceId, boardId: scala.Double, listId: scala.Double): js.Promise[js.Object] = js.native
  def removeList(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    listId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.distServicesMod.ResourceId, boardId: scala.Double): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showList(resourceId: gitlabLib.distServicesMod.ResourceId, boardId: scala.Double, listId: scala.Double): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showList(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    boardId: scala.Double,
    listId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

