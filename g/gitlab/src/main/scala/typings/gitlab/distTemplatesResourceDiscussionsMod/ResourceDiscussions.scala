package typings.gitlab.distTemplatesResourceDiscussionsMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.DiscussionId
import typings.gitlab.distServicesMod.NoteId
import typings.gitlab.distServicesMod.ResourceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDiscussions extends BaseService {
  var resource2Type: String = js.native
  def addNote(
    resourceId: ResourceId,
    resource2Id: ResourceId,
    discussionId: DiscussionId,
    noteId: NoteId,
    content: String
  ): js.Promise[js.Object] = js.native
  def addNote(
    resourceId: ResourceId,
    resource2Id: ResourceId,
    discussionId: DiscussionId,
    noteId: NoteId,
    content: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(resourceId: ResourceId, resource2Id: ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(resourceId: ResourceId, resource2Id: ResourceId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(resourceId: ResourceId, resource2Id: ResourceId, content: String): js.Promise[js.Object] = js.native
  def create(resourceId: ResourceId, resource2Id: ResourceId, content: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def editNote(resourceId: ResourceId, resource2Id: ResourceId, discussionId: DiscussionId, noteId: NoteId): js.Promise[js.Object] = js.native
  def editNote(
    resourceId: ResourceId,
    resource2Id: ResourceId,
    discussionId: DiscussionId,
    noteId: NoteId,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def removeNote(resourceId: ResourceId, resource2Id: ResourceId, discussionId: DiscussionId, noteId: NoteId): js.Promise[js.Object] = js.native
  def removeNote(
    resourceId: ResourceId,
    resource2Id: ResourceId,
    discussionId: DiscussionId,
    noteId: NoteId,
    options: Sudo
  ): js.Promise[js.Object] = js.native
  def show(resourceId: ResourceId, resource2Id: ResourceId, discussionId: DiscussionId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(resourceId: ResourceId, resource2Id: ResourceId, discussionId: DiscussionId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

