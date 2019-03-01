package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListDescriptor extends js.Object {
  /** The platform type targeted by the list's entries. */
  var platformType: js.UndefOr[java.lang.String] = js.undefined
  /** The entry types contained in the list. */
  var threatEntryType: js.UndefOr[java.lang.String] = js.undefined
  /** The threat type posed by the list's entries. */
  var threatType: js.UndefOr[java.lang.String] = js.undefined
}

object ThreatListDescriptor {
  @scala.inline
  def apply(
    platformType: java.lang.String = null,
    threatEntryType: java.lang.String = null,
    threatType: java.lang.String = null
  ): ThreatListDescriptor = {
    val __obj = js.Dynamic.literal()
    if (platformType != null) __obj.updateDynamic("platformType")(platformType)
    if (threatEntryType != null) __obj.updateDynamic("threatEntryType")(threatEntryType)
    if (threatType != null) __obj.updateDynamic("threatType")(threatType)
    __obj.asInstanceOf[ThreatListDescriptor]
  }
}

