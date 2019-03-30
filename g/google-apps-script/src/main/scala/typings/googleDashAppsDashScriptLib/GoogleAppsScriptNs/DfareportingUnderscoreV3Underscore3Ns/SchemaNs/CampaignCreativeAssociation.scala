package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignCreativeAssociation extends js.Object {
  var creativeId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object CampaignCreativeAssociation {
  @scala.inline
  def apply(creativeId: java.lang.String = null, kind: java.lang.String = null): CampaignCreativeAssociation = {
    val __obj = js.Dynamic.literal()
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CampaignCreativeAssociation]
  }
}

