package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropHintsAnnotation extends js.Object {
  /** Crop hint results. */
  var cropHints: js.UndefOr[js.Array[CropHint]] = js.native
}

object CropHintsAnnotation {
  @scala.inline
  def apply(): CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropHintsAnnotation]
  }
  @scala.inline
  implicit class CropHintsAnnotationOps[Self <: CropHintsAnnotation] (val x: Self) extends AnyVal {
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
    def setCropHintsVarargs(value: CropHint*): Self = this.set("cropHints", js.Array(value :_*))
    @scala.inline
    def setCropHints(value: js.Array[CropHint]): Self = this.set("cropHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropHints: Self = this.set("cropHints", js.undefined)
  }
  
}

