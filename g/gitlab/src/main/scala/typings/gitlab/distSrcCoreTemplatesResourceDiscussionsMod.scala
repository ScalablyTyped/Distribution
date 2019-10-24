package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.DiscussionId
import typings.gitlab.distSrcCoreServicesMod.NoteId
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceDiscussionsMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceDiscussions", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceDiscussionsMod extends js.Object {
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
    def all(resourceId: ResourceId, resource2Id: ResourceId): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, resource2Id: ResourceId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
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
    def show(resourceId: ResourceId, resource2Id: ResourceId, discussionId: DiscussionId): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId, resource2Id: ResourceId, discussionId: DiscussionId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default protected () extends ResourceDiscussions {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
  }
  
}

