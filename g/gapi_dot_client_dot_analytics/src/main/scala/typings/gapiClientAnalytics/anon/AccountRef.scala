package typings.gapiClientAnalytics.anon

import typings.gapiClientAnalytics.gapi.client.analytics.ProfileRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRef extends js.Object {
  /** Account for this link. */
  var accountRef: js.UndefOr[typings.gapiClientAnalytics.gapi.client.analytics.AccountRef] = js.undefined
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[ProfileRef] = js.undefined
  /** Web property for this link. */
  var webPropertyRef: js.UndefOr[typings.gapiClientAnalytics.gapi.client.analytics.WebPropertyRef] = js.undefined
}

object AccountRef {
  @scala.inline
  def apply(
    accountRef: typings.gapiClientAnalytics.gapi.client.analytics.AccountRef = null,
    profileRef: ProfileRef = null,
    webPropertyRef: typings.gapiClientAnalytics.gapi.client.analytics.WebPropertyRef = null
  ): AccountRef = {
    val __obj = js.Dynamic.literal()
    if (accountRef != null) __obj.updateDynamic("accountRef")(accountRef.asInstanceOf[js.Any])
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef.asInstanceOf[js.Any])
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRef]
  }
}

