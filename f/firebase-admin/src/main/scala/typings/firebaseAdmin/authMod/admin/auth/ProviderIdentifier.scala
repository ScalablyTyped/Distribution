package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for looking up an account by federated provider.
  *
  * See auth.getUsers()
  */
trait ProviderIdentifier extends UserIdentifier {
  var providerId: String
  var providerUid: String
}

object ProviderIdentifier {
  @scala.inline
  def apply(providerId: String, providerUid: String): ProviderIdentifier = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], providerUid = providerUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderIdentifier]
  }
}

