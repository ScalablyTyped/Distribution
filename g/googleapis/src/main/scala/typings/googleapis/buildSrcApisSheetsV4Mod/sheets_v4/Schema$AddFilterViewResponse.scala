package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a filter view.
  */
@js.native
trait Schema$AddFilterViewResponse extends js.Object {
  /**
    * The newly added filter view.
    */
  var filter: js.UndefOr[Schema$FilterView] = js.native
}

object Schema$AddFilterViewResponse {
  @scala.inline
  def apply(filter: Schema$FilterView = null): Schema$AddFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddFilterViewResponse]
  }
}

