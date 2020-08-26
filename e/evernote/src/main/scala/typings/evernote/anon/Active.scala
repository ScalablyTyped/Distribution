package typings.evernote.anon

import typings.evernote.mod.Types.NoteAttributes
import typings.evernote.mod.Types.NoteLimits
import typings.evernote.mod.Types.NoteRestrictions
import typings.evernote.mod.Types.Resource
import typings.evernote.mod.Types.SharedNote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Active extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var attributes: js.UndefOr[NoteAttributes] = js.native
  var content: js.UndefOr[String] = js.native
  var contentHash: js.UndefOr[String] = js.native
  var contentLength: js.UndefOr[Double] = js.native
  var created: js.UndefOr[Double] = js.native
  var deleted: js.UndefOr[Double] = js.native
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  var limits: js.UndefOr[NoteLimits] = js.native
  var notebookGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  var restrictions: js.UndefOr[NoteRestrictions] = js.native
  var sharedNotes: js.UndefOr[js.Array[SharedNote]] = js.native
  var tagGuids: js.UndefOr[js.Array[String]] = js.native
  var tagNames: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[Double] = js.native
}

object Active {
  @scala.inline
  def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAttributes(value: NoteAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentHash(value: String): Self = this.set("contentHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHash: Self = this.set("contentHash", js.undefined)
    @scala.inline
    def setContentLength(value: Double): Self = this.set("contentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLength: Self = this.set("contentLength", js.undefined)
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDeleted(value: Double): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setLimits(value: NoteLimits): Self = this.set("limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    @scala.inline
    def setNotebookGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("notebookGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebookGuid: Self = this.set("notebookGuid", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[Resource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setRestrictions(value: NoteRestrictions): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
    @scala.inline
    def setSharedNotesVarargs(value: SharedNote*): Self = this.set("sharedNotes", js.Array(value :_*))
    @scala.inline
    def setSharedNotes(value: js.Array[SharedNote]): Self = this.set("sharedNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedNotes: Self = this.set("sharedNotes", js.undefined)
    @scala.inline
    def setTagGuidsVarargs(value: String*): Self = this.set("tagGuids", js.Array(value :_*))
    @scala.inline
    def setTagGuids(value: js.Array[String]): Self = this.set("tagGuids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagGuids: Self = this.set("tagGuids", js.undefined)
    @scala.inline
    def setTagNamesVarargs(value: String*): Self = this.set("tagNames", js.Array(value :_*))
    @scala.inline
    def setTagNames(value: js.Array[String]): Self = this.set("tagNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagNames: Self = this.set("tagNames", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = this.set("updateSequenceNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSequenceNum: Self = this.set("updateSequenceNum", js.undefined)
    @scala.inline
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

