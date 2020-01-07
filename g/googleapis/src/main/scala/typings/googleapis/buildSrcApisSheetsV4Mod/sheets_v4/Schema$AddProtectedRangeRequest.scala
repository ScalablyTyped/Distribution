package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a new protected range.
  */
@js.native
trait Schema$AddProtectedRangeRequest extends js.Object {
  /**
    * The protected range to be added. The protectedRangeId field is optional;
    * if one is not set, an id will be randomly generated. (It is an error to
    * specify the ID of a range that already exists.)
    */
  var protectedRange: js.UndefOr[Schema$ProtectedRange] = js.native
}

object Schema$AddProtectedRangeRequest {
  @scala.inline
  def apply(protectedRange: Schema$ProtectedRange = null): Schema$AddProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddProtectedRangeRequest]
  }
}

