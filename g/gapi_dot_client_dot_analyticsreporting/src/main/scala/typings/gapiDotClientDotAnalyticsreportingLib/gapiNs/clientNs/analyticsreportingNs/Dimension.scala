package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Dimension extends js.Object {
  /**
               * If non-empty, we place dimension values into buckets after string to
               * int64. Dimension values that are not the string representation of an
               * integral value will be converted to zero.  The bucket values have to be in
               * increasing order.  Each bucket is closed on the lower end, and open on the
               * upper end. The "first" bucket includes all values less than the first
               * boundary, the "last" bucket includes all values up to infinity. Dimension
               * values that fall in a bucket get transformed to a new dimension value. For
               * example, if one gives a list of "0, 1, 3, 4, 7", then we return the
               * following buckets:
               *
               * - bucket #1: values < 0, dimension value "<0"
               * - bucket #2: values in [0,1), dimension value "0"
               * - bucket #3: values in [1,3), dimension value "1-2"
               * - bucket #4: values in [3,4), dimension value "3"
               * - bucket #5: values in [4,7), dimension value "4-6"
               * - bucket #6: values >= 7, dimension value "7+"
               *
               * NOTE: If you are applying histogram mutation on any dimension, and using
               * that dimension in sort, you will want to use the sort type
               * `HISTOGRAM_BUCKET` for that purpose. Without that the dimension values
               * will be sorted according to dictionary
               * (lexicographic) order. For example the ascending dictionary order is:
               *
               * "<50", "1001+", "121-1000", "50-120"
               *
               * And the ascending `HISTOGRAM_BUCKET` order is:
               *
               * "<50", "50-120", "121-1000", "1001+"
               *
               * The client has to explicitly request `"orderType": "HISTOGRAM_BUCKET"`
               * for a histogram-mutated dimension.
               */
  var histogramBuckets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Name of the dimension to fetch, for example `ga:browser`. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

