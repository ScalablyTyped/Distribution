package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSlicerRequest extends js.Object {
  /**
    * The slicer that should be added to the spreadsheet, including
    * the position where it should be placed. The slicerId field is optional; if one is not set, an id
    * will be randomly generated. (It is an error to specify the ID
    * of a slicer that already exists.)
    */
  var slicer: js.UndefOr[Slicer] = js.undefined
}

object AddSlicerRequest {
  @scala.inline
  def apply(slicer: Slicer = null): AddSlicerRequest = {
    val __obj = js.Dynamic.literal()
    if (slicer != null) __obj.updateDynamic("slicer")(slicer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSlicerRequest]
  }
}

