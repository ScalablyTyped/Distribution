package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var histogramBuckets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(histogramBuckets: js.Array[java.lang.String] = null, name: java.lang.String = null): Dimension = {
    val __obj = js.Dynamic.literal()
    if (histogramBuckets != null) __obj.updateDynamic("histogramBuckets")(histogramBuckets)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Dimension]
  }
}

