package typings
package gitlabLib.distTemplatesResourceNotesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceNotes
  extends gitlabLib.distInfrastructureMod.BaseService {
  var resource2Type: java.lang.String = js.native
  def all(resourceId: gitlabLib.ResourceId, resource2Id: gitlabLib.ResourceId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    options: gitlabLib.PaginatedRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def create(resourceId: gitlabLib.ResourceId, resource2Id: gitlabLib.ResourceId, body: java.lang.String): js.Promise[js.Object] = js.native
  def create(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    body: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    noteId: gitlabLib.NoteId,
    body: java.lang.String
  ): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    noteId: gitlabLib.NoteId,
    body: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(resourceId: gitlabLib.ResourceId, resource2Id: gitlabLib.ResourceId, noteId: gitlabLib.NoteId): js.Promise[js.Object] = js.native
  def remove(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    noteId: gitlabLib.NoteId,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.ResourceId, resource2Id: gitlabLib.ResourceId, noteId: gitlabLib.NoteId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(
    resourceId: gitlabLib.ResourceId,
    resource2Id: gitlabLib.ResourceId,
    noteId: gitlabLib.NoteId,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

