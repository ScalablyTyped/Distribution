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
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    discussionId: gitlabLib.DiscussionId,
    noteId: gitlabLib.NoteId,
    content: java.lang.String
  ): js.Promise[js.Object] = js.native
  def addNote(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    discussionId: gitlabLib.DiscussionId,
    noteId: gitlabLib.NoteId,
    content: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(resourceId: gitlabLib.ResourceId, resource2Id: gitlabLib.ResourceId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    options: gitlabLib.PaginatedRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def create(resourceId: gitlabLib.ResourceId, resource2Id: gitlabLib.ResourceId, content: java.lang.String): js.Promise[js.Object] = js.native
  def create(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    content: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def editNote(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    discussionId: gitlabLib.DiscussionId,
    noteId: gitlabLib.NoteId
  ): js.Promise[js.Object] = js.native
  def editNote(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    discussionId: gitlabLib.DiscussionId,
    noteId: gitlabLib.NoteId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def removeNote(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    discussionId: gitlabLib.DiscussionId,
    noteId: gitlabLib.NoteId
  ): js.Promise[js.Object] = js.native
  def removeNote(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    discussionId: gitlabLib.DiscussionId,
    noteId: gitlabLib.NoteId,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def show(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    discussionId: gitlabLib.DiscussionId
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def show(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    discussionId: gitlabLib.DiscussionId,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

