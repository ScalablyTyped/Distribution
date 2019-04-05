package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentVariations extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[stdLib.Number] = js.undefined
  var won: js.UndefOr[scala.Boolean] = js.undefined
}

object ExperimentVariations {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    status: java.lang.String = null,
    url: java.lang.String = null,
    weight: stdLib.Number = null,
    won: js.UndefOr[scala.Boolean] = js.undefined
  ): ExperimentVariations = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status)
    if (url != null) __obj.updateDynamic("url")(url)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    if (!js.isUndefined(won)) __obj.updateDynamic("won")(won)
    __obj.asInstanceOf[ExperimentVariations]
  }
}

