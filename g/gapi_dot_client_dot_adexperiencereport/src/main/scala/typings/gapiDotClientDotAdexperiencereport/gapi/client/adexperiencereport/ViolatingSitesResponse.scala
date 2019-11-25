package typings.gapiDotClientDotAdexperiencereport.gapi.client.adexperiencereport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViolatingSitesResponse extends js.Object {
  /** A list of summaries of violating sites. */
  var violatingSites: js.UndefOr[js.Array[SiteSummaryResponse]] = js.undefined
}

object ViolatingSitesResponse {
  @scala.inline
  def apply(violatingSites: js.Array[SiteSummaryResponse] = null): ViolatingSitesResponse = {
    val __obj = js.Dynamic.literal()
    if (violatingSites != null) __obj.updateDynamic("violatingSites")(violatingSites.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolatingSitesResponse]
  }
}

