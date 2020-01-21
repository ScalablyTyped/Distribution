package typings.firebaseFirestore.credentialsMod

import typings.firebaseFirestore.firebaseFirestoreStrings.provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderCredentialsSettings extends CredentialsSettings {
  var client: CredentialsProvider
  var `type`: provider
}

object ProviderCredentialsSettings {
  @scala.inline
  def apply(client: CredentialsProvider, `type`: provider): ProviderCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderCredentialsSettings]
  }
}

