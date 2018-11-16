package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePrivacyDlpV2beta1Finding extends js.Object {
  /** Timestamp when finding was detected. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** The specific type of info the string might be. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.undefined
  /** Estimate of how likely it is that the info_type is correct. */
  var likelihood: js.UndefOr[java.lang.String] = js.undefined
  /** Location of the info found. */
  var location: js.UndefOr[GooglePrivacyDlpV2beta1Location] = js.undefined
  /** The specific string that may be potentially sensitive info. */
  var quote: js.UndefOr[java.lang.String] = js.undefined
}

