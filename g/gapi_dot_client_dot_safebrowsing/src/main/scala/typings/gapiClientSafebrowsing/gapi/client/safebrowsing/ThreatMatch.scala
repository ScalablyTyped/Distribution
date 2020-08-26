package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatMatch extends js.Object {
  /**
    * The cache lifetime for the returned match. Clients must not cache this
    * response for more than this duration to avoid false positives.
    */
  var cacheDuration: js.UndefOr[String] = js.native
  /** The platform type matching this threat. */
  var platformType: js.UndefOr[String] = js.native
  /** The threat matching this threat. */
  var threat: js.UndefOr[ThreatEntry] = js.native
  /** Optional metadata associated with this threat. */
  var threatEntryMetadata: js.UndefOr[ThreatEntryMetadata] = js.native
  /** The threat entry type matching this threat. */
  var threatEntryType: js.UndefOr[String] = js.native
  /** The threat type matching this threat. */
  var threatType: js.UndefOr[String] = js.native
}

object ThreatMatch {
  @scala.inline
  def apply(): ThreatMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatMatch]
  }
  @scala.inline
  implicit class ThreatMatchOps[Self <: ThreatMatch] (val x: Self) extends AnyVal {
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
    def setCacheDuration(value: String): Self = this.set("cacheDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheDuration: Self = this.set("cacheDuration", js.undefined)
    @scala.inline
    def setPlatformType(value: String): Self = this.set("platformType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformType: Self = this.set("platformType", js.undefined)
    @scala.inline
    def setThreat(value: ThreatEntry): Self = this.set("threat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreat: Self = this.set("threat", js.undefined)
    @scala.inline
    def setThreatEntryMetadata(value: ThreatEntryMetadata): Self = this.set("threatEntryMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreatEntryMetadata: Self = this.set("threatEntryMetadata", js.undefined)
    @scala.inline
    def setThreatEntryType(value: String): Self = this.set("threatEntryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreatEntryType: Self = this.set("threatEntryType", js.undefined)
    @scala.inline
    def setThreatType(value: String): Self = this.set("threatType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreatType: Self = this.set("threatType", js.undefined)
  }
  
}

