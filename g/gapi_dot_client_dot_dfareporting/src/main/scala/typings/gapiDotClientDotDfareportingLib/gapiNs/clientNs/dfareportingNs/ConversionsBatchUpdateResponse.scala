package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionsBatchUpdateResponse extends js.Object {
  /** Indicates that some or all conversions failed to update. */
  var hasFailures: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchUpdateResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The update status of each conversion. Statuses are returned in the same order that conversions are updated. */
  var status: js.UndefOr[js.Array[ConversionStatus]] = js.undefined
}

