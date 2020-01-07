package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of the filter view.
  */
@js.native
trait Schema$UpdateFilterViewRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `filter` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The new properties of the filter view.
    */
  var filter: js.UndefOr[Schema$FilterView] = js.native
}

object Schema$UpdateFilterViewRequest {
  @scala.inline
  def apply(fields: String = null, filter: Schema$FilterView = null): Schema$UpdateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateFilterViewRequest]
  }
}

