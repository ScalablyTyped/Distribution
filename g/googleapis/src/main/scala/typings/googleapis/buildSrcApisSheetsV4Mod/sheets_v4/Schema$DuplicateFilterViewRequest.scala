package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Duplicates a particular filter view.
  */
@js.native
trait Schema$DuplicateFilterViewRequest extends js.Object {
  /**
    * The ID of the filter being duplicated.
    */
  var filterId: js.UndefOr[Double] = js.native
}

object Schema$DuplicateFilterViewRequest {
  @scala.inline
  def apply(filterId: Int | Double = null): Schema$DuplicateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DuplicateFilterViewRequest]
  }
}

