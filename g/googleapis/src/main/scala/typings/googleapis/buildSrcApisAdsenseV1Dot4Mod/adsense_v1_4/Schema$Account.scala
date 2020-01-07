package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Account extends js.Object {
  var creation_time: js.UndefOr[String] = js.native
  /**
    * Unique identifier of this account.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#account.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether this account is premium.
    */
  var premium: js.UndefOr[Boolean] = js.native
  /**
    * Sub accounts of the this account.
    */
  var subAccounts: js.UndefOr[js.Array[Schema$Account]] = js.native
  /**
    * AdSense timezone of this account.
    */
  var timezone: js.UndefOr[String] = js.native
}

object Schema$Account {
  @scala.inline
  def apply(
    creation_time: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    premium: js.UndefOr[Boolean] = js.undefined,
    subAccounts: js.Array[Schema$Account] = null,
    timezone: String = null
  ): Schema$Account = {
    val __obj = js.Dynamic.literal()
    if (creation_time != null) __obj.updateDynamic("creation_time")(creation_time.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(premium)) __obj.updateDynamic("premium")(premium.asInstanceOf[js.Any])
    if (subAccounts != null) __obj.updateDynamic("subAccounts")(subAccounts.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Account]
  }
}

