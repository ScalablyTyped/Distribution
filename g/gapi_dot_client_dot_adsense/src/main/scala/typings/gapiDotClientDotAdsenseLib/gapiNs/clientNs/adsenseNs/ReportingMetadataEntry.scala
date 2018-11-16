package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReportingMetadataEntry extends js.Object {
  /**
               * For metrics this is a list of dimension IDs which the metric is compatible with, for dimensions it is a list of compatibility groups the dimension
               * belongs to.
               */
  var compatibleDimensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The names of the metrics the dimension or metric this reporting metadata entry describes is compatible with. */
  var compatibleMetrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Unique identifier of this reporting metadata entry, corresponding to the name of the appropriate dimension or metric. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adsense#reportingMetadataEntry. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The names of the dimensions which the dimension or metric this reporting metadata entry describes requires to also be present in order for the report
               * to be valid. Omitting these will not cause an error or warning, but may result in data which cannot be correctly interpreted.
               */
  var requiredDimensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * The names of the metrics which the dimension or metric this reporting metadata entry describes requires to also be present in order for the report to
               * be valid. Omitting these will not cause an error or warning, but may result in data which cannot be correctly interpreted.
               */
  var requiredMetrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The codes of the projects supported by the dimension or metric this reporting metadata entry describes. */
  var supportedProducts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

