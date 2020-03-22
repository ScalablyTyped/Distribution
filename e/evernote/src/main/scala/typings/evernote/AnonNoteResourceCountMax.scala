package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoteResourceCountMax extends js.Object {
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

object AnonNoteResourceCountMax {
  @scala.inline
  def apply(
    noteResourceCountMax: Int | Double = null,
    noteSizeMax: Int | Double = null,
    noteTagCountMax: Int | Double = null,
    resourceSizeMax: Int | Double = null,
    uploadLimit: Int | Double = null,
    userLinkedNotebookMax: Int | Double = null,
    userMailLimitDaily: Int | Double = null,
    userNoteCountMax: Int | Double = null,
    userNotebookCountMax: Int | Double = null,
    userSavedSearchesMax: Int | Double = null,
    userTagCountMax: Int | Double = null
  ): AnonNoteResourceCountMax = {
    val __obj = js.Dynamic.literal()
    if (noteResourceCountMax != null) __obj.updateDynamic("noteResourceCountMax")(noteResourceCountMax.asInstanceOf[js.Any])
    if (noteSizeMax != null) __obj.updateDynamic("noteSizeMax")(noteSizeMax.asInstanceOf[js.Any])
    if (noteTagCountMax != null) __obj.updateDynamic("noteTagCountMax")(noteTagCountMax.asInstanceOf[js.Any])
    if (resourceSizeMax != null) __obj.updateDynamic("resourceSizeMax")(resourceSizeMax.asInstanceOf[js.Any])
    if (uploadLimit != null) __obj.updateDynamic("uploadLimit")(uploadLimit.asInstanceOf[js.Any])
    if (userLinkedNotebookMax != null) __obj.updateDynamic("userLinkedNotebookMax")(userLinkedNotebookMax.asInstanceOf[js.Any])
    if (userMailLimitDaily != null) __obj.updateDynamic("userMailLimitDaily")(userMailLimitDaily.asInstanceOf[js.Any])
    if (userNoteCountMax != null) __obj.updateDynamic("userNoteCountMax")(userNoteCountMax.asInstanceOf[js.Any])
    if (userNotebookCountMax != null) __obj.updateDynamic("userNotebookCountMax")(userNotebookCountMax.asInstanceOf[js.Any])
    if (userSavedSearchesMax != null) __obj.updateDynamic("userSavedSearchesMax")(userSavedSearchesMax.asInstanceOf[js.Any])
    if (userTagCountMax != null) __obj.updateDynamic("userTagCountMax")(userTagCountMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoteResourceCountMax]
  }
}

