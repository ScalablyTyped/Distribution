package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass extends js.Object {
  /**
    * Size of the equivalence class, for example number of rows with the
    * above set of values.
    */
  var equivalenceClassSize: js.UndefOr[String] = js.undefined
  /**
    * Set of values defining the equivalence class. One value per
    * quasi-identifier column in the original KAnonymity metric message.
    * The order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.undefined
}

object GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass {
  @scala.inline
  def apply(equivalenceClassSize: String = null, quasiIdsValues: js.Array[GooglePrivacyDlpV2beta1Value] = null): GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    if (equivalenceClassSize != null) __obj.updateDynamic("equivalenceClassSize")(equivalenceClassSize.asInstanceOf[js.Any])
    if (quasiIdsValues != null) __obj.updateDynamic("quasiIdsValues")(quasiIdsValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass]
  }
}

