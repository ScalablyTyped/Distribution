package typings.googleapis.buildSrcApisAdexperiencereportV1Mod.adexperiencereport_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListViolatingSites.
  */
@js.native
trait Schema$ViolatingSitesResponse extends js.Object {
  /**
    * A list of summaries of violating sites.
    */
  var violatingSites: js.UndefOr[js.Array[Schema$SiteSummaryResponse]] = js.native
}

object Schema$ViolatingSitesResponse {
  @scala.inline
  def apply(violatingSites: js.Array[Schema$SiteSummaryResponse] = null): Schema$ViolatingSitesResponse = {
    val __obj = js.Dynamic.literal()
    if (violatingSites != null) __obj.updateDynamic("violatingSites")(violatingSites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ViolatingSitesResponse]
  }
}

