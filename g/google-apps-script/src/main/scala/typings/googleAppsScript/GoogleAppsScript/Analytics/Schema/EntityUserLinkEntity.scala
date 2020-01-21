package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityUserLinkEntity extends js.Object {
  var accountRef: js.UndefOr[AccountRef] = js.undefined
  var profileRef: js.UndefOr[ProfileRef] = js.undefined
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.undefined
}

object EntityUserLinkEntity {
  @scala.inline
  def apply(
    accountRef: AccountRef = null,
    profileRef: ProfileRef = null,
    webPropertyRef: WebPropertyRef = null
  ): EntityUserLinkEntity = {
    val __obj = js.Dynamic.literal()
    if (accountRef != null) __obj.updateDynamic("accountRef")(accountRef.asInstanceOf[js.Any])
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef.asInstanceOf[js.Any])
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityUserLinkEntity]
  }
}

