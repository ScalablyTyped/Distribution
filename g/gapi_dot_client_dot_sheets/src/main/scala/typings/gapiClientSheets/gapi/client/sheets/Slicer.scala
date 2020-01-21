package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slicer extends js.Object {
  /**
    * The position of the slicer. Note that slicer can be positioned only on
    * existing sheet. Also, width and height of slicer can be automatically
    * adjusted to keep it within permitted limits.
    */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.undefined
  /** The ID of the slicer. */
  var slicerId: js.UndefOr[Double] = js.undefined
  /** The specification of the slicer. */
  var spec: js.UndefOr[SlicerSpec] = js.undefined
}

object Slicer {
  @scala.inline
  def apply(position: EmbeddedObjectPosition = null, slicerId: Int | Double = null, spec: SlicerSpec = null): Slicer = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (slicerId != null) __obj.updateDynamic("slicerId")(slicerId.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slicer]
  }
}

