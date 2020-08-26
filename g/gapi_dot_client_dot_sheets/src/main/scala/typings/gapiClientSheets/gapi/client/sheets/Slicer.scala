package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slicer extends js.Object {
  /**
    * The position of the slicer. Note that slicer can be positioned only on
    * existing sheet. Also, width and height of slicer can be automatically
    * adjusted to keep it within permitted limits.
    */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.native
  /** The ID of the slicer. */
  var slicerId: js.UndefOr[Double] = js.native
  /** The specification of the slicer. */
  var spec: js.UndefOr[SlicerSpec] = js.native
}

object Slicer {
  @scala.inline
  def apply(): Slicer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slicer]
  }
  @scala.inline
  implicit class SlicerOps[Self <: Slicer] (val x: Self) extends AnyVal {
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
    def setPosition(value: EmbeddedObjectPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSlicerId(value: Double): Self = this.set("slicerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlicerId: Self = this.set("slicerId", js.undefined)
    @scala.inline
    def setSpec(value: SlicerSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
  
}

