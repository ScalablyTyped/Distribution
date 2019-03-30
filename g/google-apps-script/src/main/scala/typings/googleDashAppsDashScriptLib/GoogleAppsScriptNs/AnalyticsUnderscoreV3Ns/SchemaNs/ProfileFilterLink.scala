package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileFilterLink extends js.Object {
  var filterRef: js.UndefOr[FilterRef] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var profileRef: js.UndefOr[ProfileRef] = js.undefined
  var rank: js.UndefOr[scala.Double] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object ProfileFilterLink {
  @scala.inline
  def apply(
    filterRef: FilterRef = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    profileRef: ProfileRef = null,
    rank: scala.Int | scala.Double = null,
    selfLink: java.lang.String = null
  ): ProfileFilterLink = {
    val __obj = js.Dynamic.literal()
    if (filterRef != null) __obj.updateDynamic("filterRef")(filterRef)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef)
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ProfileFilterLink]
  }
}

