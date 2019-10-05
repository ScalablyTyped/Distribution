package typings.gapiDotClientDotSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListDescriptor extends js.Object {
  /** The platform type targeted by the list's entries. */
  var platformType: js.UndefOr[String] = js.undefined
  /** The entry types contained in the list. */
  var threatEntryType: js.UndefOr[String] = js.undefined
  /** The threat type posed by the list's entries. */
  var threatType: js.UndefOr[String] = js.undefined
}

object ThreatListDescriptor {
  @scala.inline
  def apply(platformType: String = null, threatEntryType: String = null, threatType: String = null): ThreatListDescriptor = {
    val __obj = js.Dynamic.literal()
    if (platformType != null) __obj.updateDynamic("platformType")(platformType)
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType)
    if (threatType != null) __obj.updateDynamic("threatType")(threatType)
    __obj.asInstanceOf[ThreatListDescriptor]
  }
}

