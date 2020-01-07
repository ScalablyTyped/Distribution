package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes the protected range with the given ID.
  */
@js.native
trait Schema$DeleteProtectedRangeRequest extends js.Object {
  /**
    * The ID of the protected range to delete.
    */
  var protectedRangeId: js.UndefOr[Double] = js.native
}

object Schema$DeleteProtectedRangeRequest {
  @scala.inline
  def apply(protectedRangeId: Int | Double = null): Schema$DeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (protectedRangeId != null) __obj.updateDynamic("protectedRangeId")(protectedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteProtectedRangeRequest]
  }
}

