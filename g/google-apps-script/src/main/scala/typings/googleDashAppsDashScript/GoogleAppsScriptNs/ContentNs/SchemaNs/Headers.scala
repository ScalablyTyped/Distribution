package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var locations: js.UndefOr[js.Array[LocationIdSet]] = js.undefined
  var numberOfItems: js.UndefOr[js.Array[String]] = js.undefined
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.undefined
  var prices: js.UndefOr[js.Array[Price]] = js.undefined
  var weights: js.UndefOr[js.Array[Weight]] = js.undefined
}

object Headers {
  @scala.inline
  def apply(
    locations: js.Array[LocationIdSet] = null,
    numberOfItems: js.Array[String] = null,
    postalCodeGroupNames: js.Array[String] = null,
    prices: js.Array[Price] = null,
    weights: js.Array[Weight] = null
  ): Headers = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (numberOfItems != null) __obj.updateDynamic("numberOfItems")(numberOfItems)
    if (postalCodeGroupNames != null) __obj.updateDynamic("postalCodeGroupNames")(postalCodeGroupNames)
    if (prices != null) __obj.updateDynamic("prices")(prices)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[Headers]
  }
}

