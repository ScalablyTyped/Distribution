package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass extends js.Object {
  /**
    * Size of the equivalence class, for example number of rows with the
    * above set of values.
    */
  var equivalenceClassSize: js.UndefOr[String] = js.native
  /**
    * Set of values defining the equivalence class. One value per
    * quasi-identifier column in the original KAnonymity metric message.
    * The order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.native
}

object GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1KAnonymityEquivalenceClassOps[Self <: GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEquivalenceClassSize(value: String): Self = this.set("equivalenceClassSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEquivalenceClassSize: Self = this.set("equivalenceClassSize", js.undefined)
    @scala.inline
    def setQuasiIdsValuesVarargs(value: GooglePrivacyDlpV2beta1Value*): Self = this.set("quasiIdsValues", js.Array(value :_*))
    @scala.inline
    def setQuasiIdsValues(value: js.Array[GooglePrivacyDlpV2beta1Value]): Self = this.set("quasiIdsValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuasiIdsValues: Self = this.set("quasiIdsValues", js.undefined)
  }
  
}

