package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RedactContentRequest extends js.Object {
  /** The configuration for specifying what content to redact from images. */
  var imageRedactionConfigs: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ImageRedactionConfig]] = js.undefined
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.undefined
  /** The list of items to inspect. Up to 100 are allowed per request. */
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.undefined
  /**
    * The strings to replace findings text findings with. Must specify at least
    * one of these or one ImageRedactionConfig if redacting images.
    */
  var replaceConfigs: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ReplaceConfig]] = js.undefined
}

