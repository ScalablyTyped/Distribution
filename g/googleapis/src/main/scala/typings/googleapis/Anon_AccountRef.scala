package typings.googleapis

import typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3.Schema$AccountRef
import typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3.Schema$ProfileRef
import typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3.Schema$WebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccountRef extends js.Object {
  var accountRef: js.UndefOr[Schema$AccountRef] = js.native
  var profileRef: js.UndefOr[Schema$ProfileRef] = js.native
  var webPropertyRef: js.UndefOr[Schema$WebPropertyRef] = js.native
}

object Anon_AccountRef {
  @scala.inline
  def apply(
    accountRef: Schema$AccountRef = null,
    profileRef: Schema$ProfileRef = null,
    webPropertyRef: Schema$WebPropertyRef = null
  ): Anon_AccountRef = {
    val __obj = js.Dynamic.literal()
    if (accountRef != null) __obj.updateDynamic("accountRef")(accountRef.asInstanceOf[js.Any])
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef.asInstanceOf[js.Any])
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountRef]
  }
}

