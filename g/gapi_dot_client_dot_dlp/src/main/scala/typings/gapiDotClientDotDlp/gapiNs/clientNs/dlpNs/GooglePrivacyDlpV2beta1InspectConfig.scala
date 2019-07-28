package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InspectConfig extends js.Object {
  /** When true, excludes type information of the findings. */
  var excludeTypes: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, a contextual quote from the data that triggered a finding is
    * included in the response; see Finding.quote.
    */
  var includeQuote: js.UndefOr[Boolean] = js.undefined
  /** Configuration of findings limit given for specified info types. */
  var infoTypeLimits: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeLimit]] = js.undefined
  /**
    * Restricts what info_types to look for. The values must correspond to
    * InfoType values returned by ListInfoTypes or found in documentation.
    * Empty info_types runs all enabled detectors.
    */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoType]] = js.undefined
  /** Limits the number of findings per content item or long running operation. */
  var maxFindings: js.UndefOr[Double] = js.undefined
  /** Only returns findings equal or above this threshold. */
  var minLikelihood: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1InspectConfig {
  @scala.inline
  def apply(
    excludeTypes: js.UndefOr[Boolean] = js.undefined,
    includeQuote: js.UndefOr[Boolean] = js.undefined,
    infoTypeLimits: js.Array[GooglePrivacyDlpV2beta1InfoTypeLimit] = null,
    infoTypes: js.Array[GooglePrivacyDlpV2beta1InfoType] = null,
    maxFindings: Int | Double = null,
    minLikelihood: String = null
  ): GooglePrivacyDlpV2beta1InspectConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeTypes)) __obj.updateDynamic("excludeTypes")(excludeTypes)
    if (!js.isUndefined(includeQuote)) __obj.updateDynamic("includeQuote")(includeQuote)
    if (infoTypeLimits != null) __obj.updateDynamic("infoTypeLimits")(infoTypeLimits)
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes)
    if (maxFindings != null) __obj.updateDynamic("maxFindings")(maxFindings.asInstanceOf[js.Any])
    if (minLikelihood != null) __obj.updateDynamic("minLikelihood")(minLikelihood)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectConfig]
  }
}

