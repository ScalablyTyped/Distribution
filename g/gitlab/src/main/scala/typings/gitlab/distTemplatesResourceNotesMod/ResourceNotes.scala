package typings.gitlab.distTemplatesResourceNotesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.NoteId
import typings.gitlab.distServicesMod.ResourceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceNotes extends BaseService {
  var resource2Type: String = js.native
  def all(resourceId: ResourceId, resource2Id: ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(resourceId: ResourceId, resource2Id: ResourceId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
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
  def show(resourceId: ResourceId, resource2Id: ResourceId, noteId: NoteId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(resourceId: ResourceId, resource2Id: ResourceId, noteId: NoteId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

