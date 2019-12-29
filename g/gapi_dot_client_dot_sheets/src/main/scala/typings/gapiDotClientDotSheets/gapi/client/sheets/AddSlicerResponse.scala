package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSlicerResponse extends js.Object {
  /** The newly added slicer. */
  var slicer: js.UndefOr[Slicer] = js.undefined
}

object AddSlicerResponse {
  @scala.inline
  def apply(slicer: Slicer = null): AddSlicerResponse = {
    val __obj = js.Dynamic.literal()
    if (slicer != null) __obj.updateDynamic("slicer")(slicer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSlicerResponse]
  }
}

