package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaAccountRef
import typings.googleapis.v3Mod.analyticsV3.SchemaProfileRef
import typings.googleapis.v3Mod.analyticsV3.SchemaWebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRef extends js.Object {
  var accountRef: js.UndefOr[SchemaAccountRef] = js.native
  var profileRef: js.UndefOr[SchemaProfileRef] = js.native
  var webPropertyRef: js.UndefOr[SchemaWebPropertyRef] = js.native
}

object AccountRef {
  @scala.inline
  def apply(
    accountRef: SchemaAccountRef = null,
    profileRef: SchemaProfileRef = null,
    webPropertyRef: SchemaWebPropertyRef = null
  ): AccountRef = {
    val __obj = js.Dynamic.literal()
    if (accountRef != null) __obj.updateDynamic("accountRef")(accountRef.asInstanceOf[js.Any])
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef.asInstanceOf[js.Any])
    if (webPropertyRef != null) __obj.updateDynamic("webPropertyRef")(webPropertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRef]
  }
}

