package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoteSizeMax extends js.Object {
  var noteResourceCountMax: js.UndefOr[Double] = js.undefined
  var noteSizeMax: js.UndefOr[Double] = js.undefined
  var resourceSizeMax: js.UndefOr[Double] = js.undefined
  var uploadLimit: js.UndefOr[Double] = js.undefined
  var uploaded: js.UndefOr[Double] = js.undefined
}

object NoteSizeMax {
  @scala.inline
  def apply(
    noteResourceCountMax: js.UndefOr[Double] = js.undefined,
    noteSizeMax: js.UndefOr[Double] = js.undefined,
    resourceSizeMax: js.UndefOr[Double] = js.undefined,
    uploadLimit: js.UndefOr[Double] = js.undefined,
    uploaded: js.UndefOr[Double] = js.undefined
  ): NoteSizeMax = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noteResourceCountMax)) __obj.updateDynamic("noteResourceCountMax")(noteResourceCountMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noteSizeMax)) __obj.updateDynamic("noteSizeMax")(noteSizeMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceSizeMax)) __obj.updateDynamic("resourceSizeMax")(resourceSizeMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadLimit)) __obj.updateDynamic("uploadLimit")(uploadLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploaded)) __obj.updateDynamic("uploaded")(uploaded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteSizeMax]
  }
}

