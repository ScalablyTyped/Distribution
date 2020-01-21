package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropHintsAnnotation extends js.Object {
  /** Crop hint results. */
  var cropHints: js.UndefOr[js.Array[CropHint]] = js.undefined
}

object CropHintsAnnotation {
  @scala.inline
  def apply(cropHints: js.Array[CropHint] = null): CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    if (cropHints != null) __obj.updateDynamic("cropHints")(cropHints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropHintsAnnotation]
  }
}

