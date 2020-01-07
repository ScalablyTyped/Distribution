package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service account that can be used to authenticate as the enterprise to API
  * calls that require such authentication.
  */
@js.native
trait Schema$EnterpriseAccount extends js.Object {
  /**
    * The email address of the service account.
    */
  var accountEmail: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterpriseAccount&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$EnterpriseAccount {
  @scala.inline
  def apply(accountEmail: String = null, kind: String = null): Schema$EnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    if (accountEmail != null) __obj.updateDynamic("accountEmail")(accountEmail.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EnterpriseAccount]
  }
}

