package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatMatch extends js.Object {
  /**
    * The cache lifetime for the returned match. Clients must not cache this
    * response for more than this duration to avoid false positives.
    */
  var cacheDuration: js.UndefOr[java.lang.String] = js.undefined
  /** The platform type matching this threat. */
  var platformType: js.UndefOr[java.lang.String] = js.undefined
  /** The threat matching this threat. */
  var threat: js.UndefOr[ThreatEntry] = js.undefined
  /** Optional metadata associated with this threat. */
  var threatEntryMetadata: js.UndefOr[ThreatEntryMetadata] = js.undefined
  /** The threat entry type matching this threat. */
  var threatEntryType: js.UndefOr[java.lang.String] = js.undefined
  /** The threat type matching this threat. */
  var threatType: js.UndefOr[java.lang.String] = js.undefined
}

