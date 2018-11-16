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

