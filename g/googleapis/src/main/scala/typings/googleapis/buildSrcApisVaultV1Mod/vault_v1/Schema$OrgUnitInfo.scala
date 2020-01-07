package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Org Unit to search
  */
@js.native
trait Schema$OrgUnitInfo extends js.Object {
  /**
    * Org unit to search, as provided by the &lt;a
    * href=&quot;https://developers.google.com/admin-sdk/directory/&quot;&gt;Admin
    * SDK Directory API&lt;/a&gt;.
    */
  var orgUnitId: js.UndefOr[String] = js.native
}

object Schema$OrgUnitInfo {
  @scala.inline
  def apply(orgUnitId: String = null): Schema$OrgUnitInfo = {
    val __obj = js.Dynamic.literal()
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrgUnitInfo]
  }
}

