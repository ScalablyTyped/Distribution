package typings.evernote.anon

import typings.evernote.mod.Types.NoteAttributes
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var attributes: js.UndefOr[NoteAttributes] = js.native
  var contentLength: js.UndefOr[Double] = js.native
  var created: js.UndefOr[Timestamp] = js.native
  var deleted: js.UndefOr[Timestamp] = js.native
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  var largestResourceMime: js.UndefOr[String] = js.native
  var largestResourceSize: js.UndefOr[Double] = js.native
  var notebookGuid: js.UndefOr[String] = js.native
  var tagGuids: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.native
  var title: js.UndefOr[String] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
}

object Attributes {
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
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
    def setAttributes(value: NoteAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setContentLength(value: Double): Self = this.set("contentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLength: Self = this.set("contentLength", js.undefined)
    @scala.inline
    def setCreated(value: Timestamp): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDeleted(value: Timestamp): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setLargestResourceMime(value: String): Self = this.set("largestResourceMime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargestResourceMime: Self = this.set("largestResourceMime", js.undefined)
    @scala.inline
    def setLargestResourceSize(value: Double): Self = this.set("largestResourceSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargestResourceSize: Self = this.set("largestResourceSize", js.undefined)
    @scala.inline
    def setNotebookGuid(value: String): Self = this.set("notebookGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebookGuid: Self = this.set("notebookGuid", js.undefined)
    @scala.inline
    def setTagGuidsVarargs(value: typings.evernote.mod.Types.Guid*): Self = this.set("tagGuids", js.Array(value :_*))
    @scala.inline
    def setTagGuids(value: js.Array[typings.evernote.mod.Types.Guid]): Self = this.set("tagGuids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagGuids: Self = this.set("tagGuids", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = this.set("updateSequenceNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSequenceNum: Self = this.set("updateSequenceNum", js.undefined)
    @scala.inline
    def setUpdated(value: Timestamp): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

