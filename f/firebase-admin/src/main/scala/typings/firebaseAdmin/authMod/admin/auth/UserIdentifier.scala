package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a user to be looked up.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.authMod.admin.auth.UidIdentifier
  - typings.firebaseAdmin.authMod.admin.auth.EmailIdentifier
  - typings.firebaseAdmin.authMod.admin.auth.PhoneIdentifier
  - typings.firebaseAdmin.authMod.admin.auth.ProviderIdentifier
*/
trait UserIdentifier extends js.Object

object UserIdentifier {
  @scala.inline
  def UidIdentifier(uid: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentifier]
  }
  @scala.inline
  def EmailIdentifier(email: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentifier]
  }
  @scala.inline
  def PhoneIdentifier(phoneNumber: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentifier]
  }
  @scala.inline
  def ProviderIdentifier(providerId: String, providerUid: String): UserIdentifier = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], providerUid = providerUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentifier]
  }
}

