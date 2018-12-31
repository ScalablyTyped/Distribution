package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1NumericalStatsResult extends js.Object {
  /** Maximum value appearing in the column. */
  var maxValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
  /** Minimum value appearing in the column. */
  var minValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
  /**
    * List of 99 values that partition the set of field values into 100 equal
    * sized buckets.
    */
  var quantileValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.undefined
}

