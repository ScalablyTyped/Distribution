package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates an existing protected range with the specified protectedRangeId.
  */
@js.native
trait Schema$UpdateProtectedRangeRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `protectedRange` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The protected range to update with the new properties.
    */
  var protectedRange: js.UndefOr[Schema$ProtectedRange] = js.native
}

object Schema$UpdateProtectedRangeRequest {
  @scala.inline
  def apply(fields: String = null, protectedRange: Schema$ProtectedRange = null): Schema$UpdateProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateProtectedRangeRequest]
  }
}

