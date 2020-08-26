package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoteResourceCountMax extends js.Object {
  var noteResourceCountMax: js.UndefOr[Double] = js.native
  var noteSizeMax: js.UndefOr[Double] = js.native
  var noteTagCountMax: js.UndefOr[Double] = js.native
  var resourceSizeMax: js.UndefOr[Double] = js.native
  var uploadLimit: js.UndefOr[Double] = js.native
  var userLinkedNotebookMax: js.UndefOr[Double] = js.native
  var userMailLimitDaily: js.UndefOr[Double] = js.native
  var userNoteCountMax: js.UndefOr[Double] = js.native
  var userNotebookCountMax: js.UndefOr[Double] = js.native
  var userSavedSearchesMax: js.UndefOr[Double] = js.native
  var userTagCountMax: js.UndefOr[Double] = js.native
}

object NoteResourceCountMax {
  @scala.inline
  def apply(): NoteResourceCountMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteResourceCountMax]
  }
  @scala.inline
  implicit class NoteResourceCountMaxOps[Self <: NoteResourceCountMax] (val x: Self) extends AnyVal {
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
    def setNoteResourceCountMax(value: Double): Self = this.set("noteResourceCountMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteResourceCountMax: Self = this.set("noteResourceCountMax", js.undefined)
    @scala.inline
    def setNoteSizeMax(value: Double): Self = this.set("noteSizeMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteSizeMax: Self = this.set("noteSizeMax", js.undefined)
    @scala.inline
    def setNoteTagCountMax(value: Double): Self = this.set("noteTagCountMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteTagCountMax: Self = this.set("noteTagCountMax", js.undefined)
    @scala.inline
    def setResourceSizeMax(value: Double): Self = this.set("resourceSizeMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceSizeMax: Self = this.set("resourceSizeMax", js.undefined)
    @scala.inline
    def setUploadLimit(value: Double): Self = this.set("uploadLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadLimit: Self = this.set("uploadLimit", js.undefined)
    @scala.inline
    def setUserLinkedNotebookMax(value: Double): Self = this.set("userLinkedNotebookMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserLinkedNotebookMax: Self = this.set("userLinkedNotebookMax", js.undefined)
    @scala.inline
    def setUserMailLimitDaily(value: Double): Self = this.set("userMailLimitDaily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMailLimitDaily: Self = this.set("userMailLimitDaily", js.undefined)
    @scala.inline
    def setUserNoteCountMax(value: Double): Self = this.set("userNoteCountMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserNoteCountMax: Self = this.set("userNoteCountMax", js.undefined)
    @scala.inline
    def setUserNotebookCountMax(value: Double): Self = this.set("userNotebookCountMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserNotebookCountMax: Self = this.set("userNotebookCountMax", js.undefined)
    @scala.inline
    def setUserSavedSearchesMax(value: Double): Self = this.set("userSavedSearchesMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserSavedSearchesMax: Self = this.set("userSavedSearchesMax", js.undefined)
    @scala.inline
    def setUserTagCountMax(value: Double): Self = this.set("userTagCountMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserTagCountMax: Self = this.set("userTagCountMax", js.undefined)
  }
  
}

