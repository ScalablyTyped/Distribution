package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFiltersResponse extends js.Object {
  /** List of a user's filters. */
  var filter: js.UndefOr[js.Array[Filter]] = js.undefined
}

object ListFiltersResponse {
  @scala.inline
  def apply(filter: js.Array[Filter] = null): ListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFiltersResponse]
  }
}

