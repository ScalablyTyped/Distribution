package typings
package gitlabLib.distTemplatesResourceDiscussionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDiscussions
  extends gitlabLib.distInfrastructureMod.BaseService {
  var resource2Type: java.lang.String = js.native
  def addNote(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    discussionId: gitlabLib.distServicesMod.DiscussionId,
    noteId: gitlabLib.distServicesMod.NoteId,
    content: java.lang.String
  ): js.Promise[js.Object] = js.native
  def addNote(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    discussionId: gitlabLib.distServicesMod.DiscussionId,
    noteId: gitlabLib.distServicesMod.NoteId,
    content: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    content: java.lang.String
  ): js.Promise[js.Object] = js.native
  def create(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    content: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def editNote(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    discussionId: gitlabLib.distServicesMod.DiscussionId,
    noteId: gitlabLib.distServicesMod.NoteId
  ): js.Promise[js.Object] = js.native
  def editNote(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    discussionId: gitlabLib.distServicesMod.DiscussionId,
    noteId: gitlabLib.distServicesMod.NoteId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def removeNote(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    discussionId: gitlabLib.distServicesMod.DiscussionId,
    noteId: gitlabLib.distServicesMod.NoteId
  ): js.Promise[js.Object] = js.native
  def removeNote(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    discussionId: gitlabLib.distServicesMod.DiscussionId,
    noteId: gitlabLib.distServicesMod.NoteId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    discussionId: gitlabLib.distServicesMod.DiscussionId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    resource2Id: gitlabLib.distServicesMod.ResourceId,
    discussionId: gitlabLib.distServicesMod.DiscussionId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

