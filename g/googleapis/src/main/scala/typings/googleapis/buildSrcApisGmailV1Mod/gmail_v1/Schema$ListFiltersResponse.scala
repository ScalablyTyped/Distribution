package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListFilters method.
  */
@js.native
trait Schema$ListFiltersResponse extends js.Object {
  /**
    * List of a user&#39;s filters.
    */
  var filter: js.UndefOr[js.Array[Schema$Filter]] = js.native
}

object Schema$ListFiltersResponse {
  @scala.inline
  def apply(filter: js.Array[Schema$Filter] = null): Schema$ListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFiltersResponse]
  }
}

