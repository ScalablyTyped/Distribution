package typings.gapiDotClientDotAnalytics

import typings.gapiDotClientDotAnalytics.gapi.client.analytics.AccountRef
import typings.gapiDotClientDotAnalytics.gapi.client.analytics.ProfileRef
import typings.gapiDotClientDotAnalytics.gapi.client.analytics.WebPropertyRef
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
    if (accountRef != null) __obj.updateDynamic("accountRef")(accountRef.asInstanceOf[js.Any])
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef.asInstanceOf[js.Any])
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountRef]
  }
}

