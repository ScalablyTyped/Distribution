package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InspectConfig extends js.Object {
  /** When true, excludes type information of the findings. */
  var excludeTypes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, a contextual quote from the data that triggered a finding is
    * included in the response; see Finding.quote.
    */
  var includeQuote: js.UndefOr[scala.Boolean] = js.undefined
  /** Configuration of findings limit given for specified info types. */
  var infoTypeLimits: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeLimit]] = js.undefined
  /**
    * Restricts what info_types to look for. The values must correspond to
    * InfoType values returned by ListInfoTypes or found in documentation.
    * Empty info_types runs all enabled detectors.
    */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoType]] = js.undefined
  /** Limits the number of findings per content item or long running operation. */
  var maxFindings: js.UndefOr[scala.Double] = js.undefined
  /** Only returns findings equal or above this threshold. */
  var minLikelihood: js.UndefOr[java.lang.String] = js.undefined
}

