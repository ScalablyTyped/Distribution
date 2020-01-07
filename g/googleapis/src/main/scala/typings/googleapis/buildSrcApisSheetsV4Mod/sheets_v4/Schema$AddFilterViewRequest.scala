package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a filter view.
  */
@js.native
trait Schema$AddFilterViewRequest extends js.Object {
  /**
    * The filter to add. The filterViewId field is optional; if one is not set,
    * an id will be randomly generated. (It is an error to specify the ID of a
    * filter that already exists.)
    */
  var filter: js.UndefOr[Schema$FilterView] = js.native
}

object Schema$AddFilterViewRequest {
  @scala.inline
  def apply(filter: Schema$FilterView = null): Schema$AddFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddFilterViewRequest]
  }
}

