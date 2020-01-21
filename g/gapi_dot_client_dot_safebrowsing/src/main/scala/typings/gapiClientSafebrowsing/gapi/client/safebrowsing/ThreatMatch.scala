package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatMatch extends js.Object {
  /**
    * The cache lifetime for the returned match. Clients must not cache this
    * response for more than this duration to avoid false positives.
    */
  var cacheDuration: js.UndefOr[String] = js.undefined
  /** The platform type matching this threat. */
  var platformType: js.UndefOr[String] = js.undefined
  /** The threat matching this threat. */
  var threat: js.UndefOr[ThreatEntry] = js.undefined
  /** Optional metadata associated with this threat. */
  var threatEntryMetadata: js.UndefOr[ThreatEntryMetadata] = js.undefined
  /** The threat entry type matching this threat. */
  var threatEntryType: js.UndefOr[String] = js.undefined
  /** The threat type matching this threat. */
  var threatType: js.UndefOr[String] = js.undefined
}

object ThreatMatch {
  @scala.inline
  def apply(
    cacheDuration: String = null,
    platformType: String = null,
    threat: ThreatEntry = null,
    threatEntryMetadata: ThreatEntryMetadata = null,
    threatEntryType: String = null,
    threatType: String = null
  ): ThreatMatch = {
    val __obj = js.Dynamic.literal()
    if (cacheDuration != null) __obj.updateDynamic("cacheDuration")(cacheDuration.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (threat != null) __obj.updateDynamic("threat")(threat.asInstanceOf[js.Any])
    if (threatEntryMetadata != null) __obj.updateDynamic("threatEntryMetadata")(threatEntryMetadata.asInstanceOf[js.Any])
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType.asInstanceOf[js.Any])
    if (threatType != null) __obj.updateDynamic("threatType")(threatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreatMatch]
  }
}

