package typings.gapiDotClientDotAnalytics

import typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs.AccountRef
import typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs.ProfileRef
import typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs.WebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountRef extends js.Object {
  /** Account for this link. */
  var accountRef: js.UndefOr[AccountRef] = js.undefined
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[ProfileRef] = js.undefined
  /** Web property for this link. */
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.undefined
}

object Anon_AccountRef {
  @scala.inline
  def apply(
    accountRef: AccountRef = null,
    profileRef: ProfileRef = null,
    webPropertyRef: WebPropertyRef = null
  ): Anon_AccountRef = {
    val __obj = js.Dynamic.literal()
    if (accountRef != null) __obj.updateDynamic("accountRef")(accountRef)
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef)
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef)
    __obj.asInstanceOf[Anon_AccountRef]
  }
}

