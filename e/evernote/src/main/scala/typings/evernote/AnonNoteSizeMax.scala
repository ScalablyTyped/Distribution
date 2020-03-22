package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoteSizeMax extends js.Object {
  var noteResourceCountMax: js.UndefOr[Double] = js.undefined
  var noteSizeMax: js.UndefOr[Double] = js.undefined
  var resourceSizeMax: js.UndefOr[Double] = js.undefined
  var uploadLimit: js.UndefOr[Double] = js.undefined
  var uploaded: js.UndefOr[Double] = js.undefined
}

object AnonNoteSizeMax {
  @scala.inline
  def apply(
    noteResourceCountMax: Int | Double = null,
    noteSizeMax: Int | Double = null,
    resourceSizeMax: Int | Double = null,
    uploadLimit: Int | Double = null,
    uploaded: Int | Double = null
  ): AnonNoteSizeMax = {
    val __obj = js.Dynamic.literal()
    if (noteResourceCountMax != null) __obj.updateDynamic("noteResourceCountMax")(noteResourceCountMax.asInstanceOf[js.Any])
    if (noteSizeMax != null) __obj.updateDynamic("noteSizeMax")(noteSizeMax.asInstanceOf[js.Any])
    if (resourceSizeMax != null) __obj.updateDynamic("resourceSizeMax")(resourceSizeMax.asInstanceOf[js.Any])
    if (uploadLimit != null) __obj.updateDynamic("uploadLimit")(uploadLimit.asInstanceOf[js.Any])
    if (uploaded != null) __obj.updateDynamic("uploaded")(uploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoteSizeMax]
  }
}

