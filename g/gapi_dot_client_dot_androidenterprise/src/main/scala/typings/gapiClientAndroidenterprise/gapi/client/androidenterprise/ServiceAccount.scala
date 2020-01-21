package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccount extends js.Object {
  /** Credentials that can be used to authenticate as this ServiceAccount. */
  var key: js.UndefOr[ServiceAccountKey] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#serviceAccount". */
  var kind: js.UndefOr[String] = js.undefined
  /** The account name of the service account, in the form of an email address. Assigned by the server. */
  var name: js.UndefOr[String] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(key: ServiceAccountKey = null, kind: String = null, name: String = null): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccount]
  }
}

