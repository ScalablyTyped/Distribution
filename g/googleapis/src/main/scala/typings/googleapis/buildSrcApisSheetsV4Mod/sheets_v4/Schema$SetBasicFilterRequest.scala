package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the basic filter associated with a sheet.
  */
@js.native
trait Schema$SetBasicFilterRequest extends js.Object {
  /**
    * The filter to set.
    */
  var filter: js.UndefOr[Schema$BasicFilter] = js.native
}

object Schema$SetBasicFilterRequest {
  @scala.inline
  def apply(filter: Schema$BasicFilter = null): Schema$SetBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetBasicFilterRequest]
  }
}

