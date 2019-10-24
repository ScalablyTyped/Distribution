package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.NoteId
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceNotesMod.ResourceNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceNotes", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceNotesMod extends js.Object {
  @js.native
  trait ResourceNotes extends BaseService {
    var resource2Type: String = js.native
    def all(resourceId: ResourceId, resource2Id: ResourceId): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, resource2Id: ResourceId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(resourceId: ResourceId, resource2Id: ResourceId, body: String): js.Promise[js.Object] = js.native
    def create(resourceId: ResourceId, resource2Id: ResourceId, body: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, resource2Id: ResourceId, noteId: NoteId, body: String): js.Promise[js.Object] = js.native
    def edit(
      resourceId: ResourceId,
      resource2Id: ResourceId,
      noteId: NoteId,
      body: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, resource2Id: ResourceId, noteId: NoteId): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, resource2Id: ResourceId, noteId: NoteId, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: ResourceId, resource2Id: ResourceId, noteId: NoteId): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId, resource2Id: ResourceId, noteId: NoteId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default protected () extends ResourceNotes {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
  }
  
}

