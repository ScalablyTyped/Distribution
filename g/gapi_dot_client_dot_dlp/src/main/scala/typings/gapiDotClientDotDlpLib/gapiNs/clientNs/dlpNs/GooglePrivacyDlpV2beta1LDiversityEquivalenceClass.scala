package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1LDiversityEquivalenceClass extends js.Object {
  /** Size of the k-anonymity equivalence class. */
  var equivalenceClassSize: js.UndefOr[java.lang.String] = js.undefined
  /** Number of distinct sensitive values in this equivalence class. */
  var numDistinctSensitiveValues: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Quasi-identifier values defining the k-anonymity equivalence
    * class. The order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.undefined
  /** Estimated frequencies of top sensitive values. */
  var topSensitiveValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ValueFrequency]] = js.undefined
}

object GooglePrivacyDlpV2beta1LDiversityEquivalenceClass {
  @scala.inline
  def apply(
    equivalenceClassSize: java.lang.String = null,
    numDistinctSensitiveValues: java.lang.String = null,
    quasiIdsValues: js.Array[GooglePrivacyDlpV2beta1Value] = null,
    topSensitiveValues: js.Array[GooglePrivacyDlpV2beta1ValueFrequency] = null
  ): GooglePrivacyDlpV2beta1LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    if (equivalenceClassSize != null) __obj.updateDynamic("equivalenceClassSize")(equivalenceClassSize)
    if (numDistinctSensitiveValues != null) __obj.updateDynamic("numDistinctSensitiveValues")(numDistinctSensitiveValues)
    if (quasiIdsValues != null) __obj.updateDynamic("quasiIdsValues")(quasiIdsValues)
    if (topSensitiveValues != null) __obj.updateDynamic("topSensitiveValues")(topSensitiveValues)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1LDiversityEquivalenceClass]
  }
}

