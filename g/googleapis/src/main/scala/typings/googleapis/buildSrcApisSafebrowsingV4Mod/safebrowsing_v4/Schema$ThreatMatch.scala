package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A match when checking a threat entry in the Safe Browsing threat lists.
  */
@js.native
trait Schema$ThreatMatch extends js.Object {
  /**
    * The cache lifetime for the returned match. Clients must not cache this
    * response for more than this duration to avoid false positives.
    */
  var cacheDuration: js.UndefOr[String] = js.native
  /**
    * The platform type matching this threat.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * The threat matching this threat.
    */
  var threat: js.UndefOr[Schema$ThreatEntry] = js.native
  /**
    * Optional metadata associated with this threat.
    */
  var threatEntryMetadata: js.UndefOr[Schema$ThreatEntryMetadata] = js.native
  /**
    * The threat entry type matching this threat.
    */
  var threatEntryType: js.UndefOr[String] = js.native
  /**
    * The threat type matching this threat.
    */
  var threatType: js.UndefOr[String] = js.native
}

object Schema$ThreatMatch {
  @scala.inline
  def apply(
    cacheDuration: String = null,
    platformType: String = null,
    threat: Schema$ThreatEntry = null,
    threatEntryMetadata: Schema$ThreatEntryMetadata = null,
    threatEntryType: String = null,
    threatType: String = null
  ): Schema$ThreatMatch = {
    val __obj = js.Dynamic.literal()
    if (cacheDuration != null) __obj.updateDynamic("cacheDuration")(cacheDuration.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (threat != null) __obj.updateDynamic("threat")(threat.asInstanceOf[js.Any])
    if (threatEntryMetadata != null) __obj.updateDynamic("threatEntryMetadata")(threatEntryMetadata.asInstanceOf[js.Any])
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType.asInstanceOf[js.Any])
    if (threatType != null) __obj.updateDynamic("threatType")(threatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ThreatMatch]
  }
}

