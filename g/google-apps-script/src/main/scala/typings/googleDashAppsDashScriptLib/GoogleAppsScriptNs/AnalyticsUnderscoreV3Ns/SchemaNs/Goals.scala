package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Goals extends js.Object {
  var items: js.UndefOr[js.Array[Goal]] = js.undefined
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  var previousLink: js.UndefOr[java.lang.String] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var totalResults: js.UndefOr[scala.Double] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Goals {
  @scala.inline
  def apply(
    items: js.Array[Goal] = null,
    itemsPerPage: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    nextLink: java.lang.String = null,
    previousLink: java.lang.String = null,
    startIndex: scala.Int | scala.Double = null,
    totalResults: scala.Int | scala.Double = null,
    username: java.lang.String = null
  ): Goals = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Goals]
  }
}

