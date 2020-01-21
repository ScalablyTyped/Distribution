package typings.firebaseFirestore.apiCredentialsMod

import typings.firebaseFirestore.firebaseFirestoreStrings.gapi
import typings.firebaseFirestore.firebaseFirestoreStrings.provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.apiCredentialsMod.FirstPartyCredentialsSettings
  - typings.firebaseFirestore.apiCredentialsMod.ProviderCredentialsSettings
*/
trait CredentialsSettings extends js.Object

object CredentialsSettings {
  @scala.inline
  def FirstPartyCredentialsSettings(client: js.Any, sessionIndex: String, `type`: gapi): CredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], sessionIndex = sessionIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsSettings]
  }
  @scala.inline
  def ProviderCredentialsSettings(client: CredentialsProvider, `type`: provider): CredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsSettings]
  }
}

