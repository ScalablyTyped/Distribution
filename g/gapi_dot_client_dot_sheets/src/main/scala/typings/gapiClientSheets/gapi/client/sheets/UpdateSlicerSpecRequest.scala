package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSlicerSpecRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `SlicerSpec` is implied and should not be specified. A single "&#42;"`
    * can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  /** The id of the slicer to update. */
  var slicerId: js.UndefOr[Double] = js.undefined
  /** The specification to apply to the slicer. */
  var spec: js.UndefOr[SlicerSpec] = js.undefined
}

object UpdateSlicerSpecRequest {
  @scala.inline
  def apply(fields: String = null, slicerId: Int | Double = null, spec: SlicerSpec = null): UpdateSlicerSpecRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (slicerId != null) __obj.updateDynamic("slicerId")(slicerId.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSlicerSpecRequest]
  }
}

