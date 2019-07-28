package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

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
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames)
    __obj.asInstanceOf[Activities]
  }
}

