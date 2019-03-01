package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotValueRegion extends js.Object {
  /** The values of the metrics in each of the pivot regions. */
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PivotValueRegion {
  @scala.inline
  def apply(values: js.Array[java.lang.String] = null): PivotValueRegion = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[PivotValueRegion]
  }
}

