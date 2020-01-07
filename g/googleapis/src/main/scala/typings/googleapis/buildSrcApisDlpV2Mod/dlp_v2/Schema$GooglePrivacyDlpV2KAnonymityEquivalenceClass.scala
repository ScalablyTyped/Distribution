package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of columns&#39; values that share the same ldiversity value
  */
@js.native
trait Schema$GooglePrivacyDlpV2KAnonymityEquivalenceClass extends js.Object {
  /**
    * Size of the equivalence class, for example number of rows with the above
    * set of values.
    */
  var equivalenceClassSize: js.UndefOr[String] = js.native
  /**
    * Set of values defining the equivalence class. One value per
    * quasi-identifier column in the original KAnonymity metric message. The
    * order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Value]] = js.native
}

object Schema$GooglePrivacyDlpV2KAnonymityEquivalenceClass {
  @scala.inline
  def apply(
    equivalenceClassSize: String = null,
    quasiIdsValues: js.Array[Schema$GooglePrivacyDlpV2Value] = null
  ): Schema$GooglePrivacyDlpV2KAnonymityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    if (equivalenceClassSize != null) __obj.updateDynamic("equivalenceClassSize")(equivalenceClassSize.asInstanceOf[js.Any])
    if (quasiIdsValues != null) __obj.updateDynamic("quasiIdsValues")(quasiIdsValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2KAnonymityEquivalenceClass]
  }
}

