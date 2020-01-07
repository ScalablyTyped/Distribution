package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a particular filter view.
  */
@js.native
trait Schema$DeleteFilterViewRequest extends js.Object {
  /**
    * The ID of the filter to delete.
    */
  var filterId: js.UndefOr[Double] = js.native
}

object Schema$DeleteFilterViewRequest {
  @scala.inline
  def apply(filterId: Int | Double = null): Schema$DeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteFilterViewRequest]
  }
}

