package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentVariations extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
  var won: js.UndefOr[Boolean] = js.undefined
}

object ExperimentVariations {
  @scala.inline
  def apply(
    name: String = null,
    status: String = null,
    url: String = null,
    weight: Int | Double = null,
    won: js.UndefOr[Boolean] = js.undefined
  ): ExperimentVariations = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (!js.isUndefined(won)) __obj.updateDynamic("won")(won.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentVariations]
  }
}

