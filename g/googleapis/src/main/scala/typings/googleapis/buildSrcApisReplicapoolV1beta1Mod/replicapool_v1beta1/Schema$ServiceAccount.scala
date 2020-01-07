package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine service account, identical to the Compute Engine resource.
  */
@js.native
trait Schema$ServiceAccount extends js.Object {
  /**
    * The service account email address, for example:
    * 123845678986@project.gserviceaccount.com
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The list of OAuth2 scopes to obtain for the service account, for example:
    * https://www.googleapis.com/auth/devstorage.full_control
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ServiceAccount {
  @scala.inline
  def apply(email: String = null, scopes: js.Array[String] = null): Schema$ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceAccount]
  }
}

