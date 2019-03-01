package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricFilterClause extends js.Object {
  /**
    * The repeated set of filters. They are logically combined based on the
    * operator specified.
    */
  var filters: js.UndefOr[js.Array[MetricFilter]] = js.undefined
  /**
    * The operator for combining multiple metric filters. If unspecified, it is
    * treated as an `OR`.
    */
  var operator: js.UndefOr[java.lang.String] = js.undefined
}

object MetricFilterClause {
  @scala.inline
  def apply(filters: js.Array[MetricFilter] = null, operator: java.lang.String = null): MetricFilterClause = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[MetricFilterClause]
  }
}

