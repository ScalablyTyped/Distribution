package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnit extends js.Object {
  /** Identity code of this ad unit, not necessarily unique across ad clients. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Settings specific to content ads (AFC) and highend mobile content ads (AFMC - deprecated). */
  var contentAdsSettings: js.UndefOr[gapiDotClientDotAdsensehostLib.Anon_TypeBackupOption] = js.undefined
  /** Custom style information specific to this ad unit. */
  var customStyle: js.UndefOr[AdStyle] = js.undefined
  /** Unique identifier of this ad unit. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adsensehost#adUnit. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Settings specific to WAP mobile content ads (AFMC - deprecated). */
  var mobileContentAdsSettings: js.UndefOr[gapiDotClientDotAdsensehostLib.Anon_TypeMarkupLanguage] = js.undefined
  /** Name of this ad unit. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Status of this ad unit. Possible values are:
    * NEW: Indicates that the ad unit was created within the last seven days and does not yet have any activity associated with it.
    *
    * ACTIVE: Indicates that there has been activity on this ad unit in the last seven days.
    *
    * INACTIVE: Indicates that there has been no activity on this ad unit in the last seven days.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

