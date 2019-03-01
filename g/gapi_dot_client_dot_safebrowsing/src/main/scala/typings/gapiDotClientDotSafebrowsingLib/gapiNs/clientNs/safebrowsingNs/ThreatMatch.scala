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

object ThreatMatch {
  @scala.inline
  def apply(
    cacheDuration: java.lang.String = null,
    platformType: java.lang.String = null,
    threat: ThreatEntry = null,
    threatEntryMetadata: ThreatEntryMetadata = null,
    threatEntryType: java.lang.String = null,
    threatType: java.lang.String = null
  ): ThreatMatch = {
    val __obj = js.Dynamic.literal()
    if (cacheDuration != null) __obj.updateDynamic("cacheDuration")(cacheDuration)
    if (platformType != null) __obj.updateDynamic("platformType")(platformType)
    if (threat != null) __obj.updateDynamic("threat")(threat)
    if (threatEntryMetadata != null) __obj.updateDynamic("threatEntryMetadata")(threatEntryMetadata)
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType)
    if (threatType != null) __obj.updateDynamic("threatType")(threatType)
    __obj.asInstanceOf[ThreatMatch]
  }
}

