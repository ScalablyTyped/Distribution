package typings
package gitlabLib.distTemplatesResourceAwardEmojisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAwardsEmojis
  extends gitlabLib.distInfrastructureMod.BaseService {
  var resourceType: java.lang.String = js.native
  def all(projectId: gitlabLib.ProjectId, resourceId: gitlabLib.ResourceId, noteId: gitlabLib.NoteId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(
    projectId: gitlabLib.ProjectId,
    resourceId: gitlabLib.ResourceId,
    noteId: gitlabLib.NoteId,
    options: gitlabLib.PaginatedRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def award(
    projectId: gitlabLib.ProjectId,
    resourceId: gitlabLib.ResourceId,
    name: java.lang.String,
    noteId: gitlabLib.NoteId
  ): js.Promise[js.Object] = js.native
  def award(
    projectId: gitlabLib.ProjectId,
    resourceId: gitlabLib.ResourceId,
    name: java.lang.String,
    noteId: gitlabLib.NoteId,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.ProjectId,
    resourceId: gitlabLib.ResourceId,
    awardId: gitlabLib.AwardId,
    noteId: gitlabLib.NoteId
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.ProjectId,
    resourceId: gitlabLib.ResourceId,
    awardId: gitlabLib.AwardId,
    noteId: gitlabLib.NoteId,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def show(
    projectId: gitlabLib.ProjectId,
    resourceId: gitlabLib.ResourceId,
    awardId: gitlabLib.AwardId,
    noteId: gitlabLib.NoteId
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def show(
    projectId: gitlabLib.ProjectId,
    resourceId: gitlabLib.ResourceId,
    awardId: gitlabLib.AwardId,
    noteId: gitlabLib.NoteId,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

