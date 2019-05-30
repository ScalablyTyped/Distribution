package typings
package gitlabLib.distTemplatesResourceIssueBoardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIssueBoards
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(resourceId: gitlabLib.ResourceId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(resourceId: gitlabLib.ResourceId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(resourceId: gitlabLib.ResourceId, name: java.lang.String): js.Promise[js.Object] = js.native
  def create(resourceId: gitlabLib.ResourceId, name: java.lang.String, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def createList(resourceId: gitlabLib.ResourceId, boardId: scala.Double, labelId: gitlabLib.LabelId): js.Promise[js.Object] = js.native
  def createList(
    resourceId: gitlabLib.ResourceId,
    boardId: scala.Double,
    labelId: gitlabLib.LabelId,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def edit(resourceId: gitlabLib.ResourceId, boardId: scala.Double): js.Promise[js.Object] = js.native
  def edit(resourceId: gitlabLib.ResourceId, boardId: scala.Double, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def editList(
    resourceId: gitlabLib.ResourceId,
    boardId: scala.Double,
    listId: scala.Double,
    position: scala.Double
  ): js.Promise[js.Object] = js.native
  def editList(
    resourceId: gitlabLib.ResourceId,
    boardId: scala.Double,
    listId: scala.Double,
    position: scala.Double,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def lists(resourceId: gitlabLib.ResourceId, boardId: scala.Double): js.Promise[gitlabLib.GetResponse] = js.native
  def lists(resourceId: gitlabLib.ResourceId, boardId: scala.Double, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def remove(resourceId: gitlabLib.ResourceId, boardId: scala.Double): js.Promise[js.Object] = js.native
  def remove(resourceId: gitlabLib.ResourceId, boardId: scala.Double, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def removeList(resourceId: gitlabLib.ResourceId, boardId: scala.Double, listId: scala.Double): js.Promise[js.Object] = js.native
  def removeList(
    resourceId: gitlabLib.ResourceId,
    boardId: scala.Double,
    listId: scala.Double,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.ResourceId, boardId: scala.Double): js.Promise[gitlabLib.GetResponse] = js.native
  def show(resourceId: gitlabLib.ResourceId, boardId: scala.Double, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def showList(resourceId: gitlabLib.ResourceId, boardId: scala.Double, listId: scala.Double): js.Promise[gitlabLib.GetResponse] = js.native
  def showList(
    resourceId: gitlabLib.ResourceId,
    boardId: scala.Double,
    listId: scala.Double,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

