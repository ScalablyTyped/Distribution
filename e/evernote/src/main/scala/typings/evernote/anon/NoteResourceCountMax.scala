package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoteResourceCountMax extends js.Object {
  var noteResourceCountMax: js.UndefOr[Double] = js.undefined
  var noteSizeMax: js.UndefOr[Double] = js.undefined
  var noteTagCountMax: js.UndefOr[Double] = js.undefined
  var resourceSizeMax: js.UndefOr[Double] = js.undefined
  var uploadLimit: js.UndefOr[Double] = js.undefined
  var userLinkedNotebookMax: js.UndefOr[Double] = js.undefined
  var userMailLimitDaily: js.UndefOr[Double] = js.undefined
  var userNoteCountMax: js.UndefOr[Double] = js.undefined
  var userNotebookCountMax: js.UndefOr[Double] = js.undefined
  var userSavedSearchesMax: js.UndefOr[Double] = js.undefined
  var userTagCountMax: js.UndefOr[Double] = js.undefined
}

object NoteResourceCountMax {
  @scala.inline
  def apply(
    noteResourceCountMax: js.UndefOr[Double] = js.undefined,
    noteSizeMax: js.UndefOr[Double] = js.undefined,
    noteTagCountMax: js.UndefOr[Double] = js.undefined,
    resourceSizeMax: js.UndefOr[Double] = js.undefined,
    uploadLimit: js.UndefOr[Double] = js.undefined,
    userLinkedNotebookMax: js.UndefOr[Double] = js.undefined,
    userMailLimitDaily: js.UndefOr[Double] = js.undefined,
    userNoteCountMax: js.UndefOr[Double] = js.undefined,
    userNotebookCountMax: js.UndefOr[Double] = js.undefined,
    userSavedSearchesMax: js.UndefOr[Double] = js.undefined,
    userTagCountMax: js.UndefOr[Double] = js.undefined
  ): NoteResourceCountMax = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noteResourceCountMax)) __obj.updateDynamic("noteResourceCountMax")(noteResourceCountMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noteSizeMax)) __obj.updateDynamic("noteSizeMax")(noteSizeMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noteTagCountMax)) __obj.updateDynamic("noteTagCountMax")(noteTagCountMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceSizeMax)) __obj.updateDynamic("resourceSizeMax")(resourceSizeMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadLimit)) __obj.updateDynamic("uploadLimit")(uploadLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userLinkedNotebookMax)) __obj.updateDynamic("userLinkedNotebookMax")(userLinkedNotebookMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userMailLimitDaily)) __obj.updateDynamic("userMailLimitDaily")(userMailLimitDaily.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userNoteCountMax)) __obj.updateDynamic("userNoteCountMax")(userNoteCountMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userNotebookCountMax)) __obj.updateDynamic("userNotebookCountMax")(userNotebookCountMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userSavedSearchesMax)) __obj.updateDynamic("userSavedSearchesMax")(userSavedSearchesMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userTagCountMax)) __obj.updateDynamic("userTagCountMax")(userTagCountMax.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteResourceCountMax]
  }
}

