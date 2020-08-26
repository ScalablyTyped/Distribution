package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1LDiversityEquivalenceClass extends js.Object {
  /** Size of the k-anonymity equivalence class. */
  var equivalenceClassSize: js.UndefOr[String] = js.native
  /** Number of distinct sensitive values in this equivalence class. */
  var numDistinctSensitiveValues: js.UndefOr[String] = js.native
  /**
    * Quasi-identifier values defining the k-anonymity equivalence
    * class. The order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.native
  /** Estimated frequencies of top sensitive values. */
  var topSensitiveValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ValueFrequency]] = js.native
}

object GooglePrivacyDlpV2beta1LDiversityEquivalenceClass {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1LDiversityEquivalenceClass]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1LDiversityEquivalenceClassOps[Self <: GooglePrivacyDlpV2beta1LDiversityEquivalenceClass] (val x: Self) extends AnyVal {
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
    def setNumDistinctSensitiveValues(value: String): Self = this.set("numDistinctSensitiveValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumDistinctSensitiveValues: Self = this.set("numDistinctSensitiveValues", js.undefined)
    @scala.inline
    def setQuasiIdsValuesVarargs(value: GooglePrivacyDlpV2beta1Value*): Self = this.set("quasiIdsValues", js.Array(value :_*))
    @scala.inline
    def setQuasiIdsValues(value: js.Array[GooglePrivacyDlpV2beta1Value]): Self = this.set("quasiIdsValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuasiIdsValues: Self = this.set("quasiIdsValues", js.undefined)
    @scala.inline
    def setTopSensitiveValuesVarargs(value: GooglePrivacyDlpV2beta1ValueFrequency*): Self = this.set("topSensitiveValues", js.Array(value :_*))
    @scala.inline
    def setTopSensitiveValues(value: js.Array[GooglePrivacyDlpV2beta1ValueFrequency]): Self = this.set("topSensitiveValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopSensitiveValues: Self = this.set("topSensitiveValues", js.undefined)
  }
  
}

