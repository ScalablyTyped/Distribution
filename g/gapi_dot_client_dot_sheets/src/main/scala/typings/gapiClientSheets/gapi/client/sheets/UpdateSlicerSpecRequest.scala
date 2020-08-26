package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSlicerSpecRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `SlicerSpec` is implied and should not be specified. A single "&#42;"`
    * can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /** The id of the slicer to update. */
  var slicerId: js.UndefOr[Double] = js.native
  /** The specification to apply to the slicer. */
  var spec: js.UndefOr[SlicerSpec] = js.native
}

object UpdateSlicerSpecRequest {
  @scala.inline
  def apply(): UpdateSlicerSpecRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSlicerSpecRequest]
  }
  @scala.inline
  implicit class UpdateSlicerSpecRequestOps[Self <: UpdateSlicerSpecRequest] (val x: Self) extends AnyVal {
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
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

