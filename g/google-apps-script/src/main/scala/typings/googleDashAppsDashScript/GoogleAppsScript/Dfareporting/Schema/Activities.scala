package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activities extends js.Object {
  var filters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
}

object Activities {
  @scala.inline
  def apply(
    filters: js.Array[DimensionValue] = null,
    kind: String = null,
    metricNames: js.Array[String] = null
  ): Activities = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activities]
  }
}

