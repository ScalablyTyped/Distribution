package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountRef extends js.Object {
  /** Account for this link. */
  var accountRef: js.UndefOr[gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.AccountRef] = js.undefined
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.ProfileRef] = js.undefined
  /** Web property for this link. */
  var webPropertyRef: js.UndefOr[gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.WebPropertyRef] = js.undefined
}

object Anon_AccountRef {
  @scala.inline
  def apply(
    accountRef: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.AccountRef = null,
    profileRef: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.ProfileRef = null,
    webPropertyRef: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.WebPropertyRef = null
  ): Anon_AccountRef = {
    val __obj = js.Dynamic.literal()
    if (accountRef != null) __obj.updateDynamic("accountRef")(accountRef)
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef)
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef)
    __obj.asInstanceOf[Anon_AccountRef]
  }
}

