package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service account identity, including the name and credentials that can be
  * used to authenticate as the service account.
  */
@js.native
trait SchemaServiceAccount extends js.Object {
  /**
    * Credentials that can be used to authenticate as this ServiceAccount.
    */
  var key: js.UndefOr[SchemaServiceAccountKey] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#serviceAccount&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The account name of the service account, in the form of an email address.
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaServiceAccount {
  @scala.inline
  def apply(key: SchemaServiceAccountKey = null, kind: String = null, name: String = null): SchemaServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceAccount]
  }
}

