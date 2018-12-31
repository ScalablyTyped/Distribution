package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxresultsFilters extends js.Object {
  /** List of real time dimensions. */
  var dimensions: js.UndefOr[java.lang.String] = js.undefined
  /** Comma-separated list of dimension or metric filters. */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /** Unique table ID. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum results per page. */
  var `max-results`: js.UndefOr[scala.Double] = js.undefined
  /** List of real time metrics. */
  var metrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of dimensions or metrics based on which real time data is sorted. */
  var sort: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

