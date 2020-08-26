package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InspectConfig extends js.Object {
  /** When true, excludes type information of the findings. */
  var excludeTypes: js.UndefOr[Boolean] = js.native
  /**
    * When true, a contextual quote from the data that triggered a finding is
    * included in the response; see Finding.quote.
    */
  var includeQuote: js.UndefOr[Boolean] = js.native
  /** Configuration of findings limit given for specified info types. */
  var infoTypeLimits: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeLimit]] = js.native
  /**
    * Restricts what info_types to look for. The values must correspond to
    * InfoType values returned by ListInfoTypes or found in documentation.
    * Empty info_types runs all enabled detectors.
    */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoType]] = js.native
  /** Limits the number of findings per content item or long running operation. */
  var maxFindings: js.UndefOr[Double] = js.native
  /** Only returns findings equal or above this threshold. */
  var minLikelihood: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1InspectConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InspectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InspectConfigOps[Self <: GooglePrivacyDlpV2beta1InspectConfig] (val x: Self) extends AnyVal {
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
    def setExcludeTypes(value: Boolean): Self = this.set("excludeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeTypes: Self = this.set("excludeTypes", js.undefined)
    @scala.inline
    def setIncludeQuote(value: Boolean): Self = this.set("includeQuote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeQuote: Self = this.set("includeQuote", js.undefined)
    @scala.inline
    def setInfoTypeLimitsVarargs(value: GooglePrivacyDlpV2beta1InfoTypeLimit*): Self = this.set("infoTypeLimits", js.Array(value :_*))
    @scala.inline
    def setInfoTypeLimits(value: js.Array[GooglePrivacyDlpV2beta1InfoTypeLimit]): Self = this.set("infoTypeLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoTypeLimits: Self = this.set("infoTypeLimits", js.undefined)
    @scala.inline
    def setInfoTypesVarargs(value: GooglePrivacyDlpV2beta1InfoType*): Self = this.set("infoTypes", js.Array(value :_*))
    @scala.inline
    def setInfoTypes(value: js.Array[GooglePrivacyDlpV2beta1InfoType]): Self = this.set("infoTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoTypes: Self = this.set("infoTypes", js.undefined)
    @scala.inline
    def setMaxFindings(value: Double): Self = this.set("maxFindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFindings: Self = this.set("maxFindings", js.undefined)
    @scala.inline
    def setMinLikelihood(value: String): Self = this.set("minLikelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLikelihood: Self = this.set("minLikelihood", js.undefined)
  }
  
}

