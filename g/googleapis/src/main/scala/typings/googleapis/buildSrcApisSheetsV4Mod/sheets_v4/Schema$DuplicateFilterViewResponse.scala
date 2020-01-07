package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a filter view being duplicated.
  */
@js.native
trait Schema$DuplicateFilterViewResponse extends js.Object {
  /**
    * The newly created filter.
    */
  var filter: js.UndefOr[Schema$FilterView] = js.native
}

object Schema$DuplicateFilterViewResponse {
  @scala.inline
  def apply(filter: Schema$FilterView = null): Schema$DuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DuplicateFilterViewResponse]
  }
}

