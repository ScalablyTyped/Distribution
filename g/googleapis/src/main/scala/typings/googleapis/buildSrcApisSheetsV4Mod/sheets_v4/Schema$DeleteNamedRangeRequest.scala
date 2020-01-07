package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes the named range with the given ID from the spreadsheet.
  */
@js.native
trait Schema$DeleteNamedRangeRequest extends js.Object {
  /**
    * The ID of the named range to delete.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}

object Schema$DeleteNamedRangeRequest {
  @scala.inline
  def apply(namedRangeId: String = null): Schema$DeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteNamedRangeRequest]
  }
}

