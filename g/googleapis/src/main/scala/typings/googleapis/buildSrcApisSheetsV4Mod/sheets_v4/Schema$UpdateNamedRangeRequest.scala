package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of the named range with the specified namedRangeId.
  */
@js.native
trait Schema$UpdateNamedRangeRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `namedRange` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The named range to update with the new properties.
    */
  var namedRange: js.UndefOr[Schema$NamedRange] = js.native
}

object Schema$UpdateNamedRangeRequest {
  @scala.inline
  def apply(fields: String = null, namedRange: Schema$NamedRange = null): Schema$UpdateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (namedRange != null) __obj.updateDynamic("namedRange")(namedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateNamedRangeRequest]
  }
}

