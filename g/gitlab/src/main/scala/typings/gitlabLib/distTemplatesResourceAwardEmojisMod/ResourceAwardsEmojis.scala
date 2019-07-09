package typings
package gitlabLib.distTemplatesResourceAwardEmojisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAwardsEmojis
  extends gitlabLib.distInfrastructureMod.BaseService {
  var resourceType: java.lang.String = js.native
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    resourceId: gitlabLib.distServicesMod.ResourceId,
    noteId: gitlabLib.distServicesMod.NoteId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    resourceId: gitlabLib.distServicesMod.ResourceId,
    noteId: gitlabLib.distServicesMod.NoteId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def award(
    projectId: gitlabLib.distServicesMod.ProjectId,
    resourceId: gitlabLib.distServicesMod.ResourceId,
    name: java.lang.String,
    noteId: gitlabLib.distServicesMod.NoteId
  ): js.Promise[js.Object] = js.native
  def award(
    projectId: gitlabLib.distServicesMod.ProjectId,
    resourceId: gitlabLib.distServicesMod.ResourceId,
    name: java.lang.String,
    noteId: gitlabLib.distServicesMod.NoteId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    resourceId: gitlabLib.distServicesMod.ResourceId,
    awardId: gitlabLib.distServicesMod.AwardId,
    noteId: gitlabLib.distServicesMod.NoteId
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    resourceId: gitlabLib.distServicesMod.ResourceId,
    awardId: gitlabLib.distServicesMod.AwardId,
    noteId: gitlabLib.distServicesMod.NoteId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    resourceId: gitlabLib.distServicesMod.ResourceId,
    awardId: gitlabLib.distServicesMod.AwardId,
    noteId: gitlabLib.distServicesMod.NoteId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    resourceId: gitlabLib.distServicesMod.ResourceId,
    awardId: gitlabLib.distServicesMod.AwardId,
    noteId: gitlabLib.distServicesMod.NoteId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

