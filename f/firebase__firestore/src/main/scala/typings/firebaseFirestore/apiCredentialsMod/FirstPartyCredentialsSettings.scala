package typings.firebaseFirestore.apiCredentialsMod

import typings.firebaseFirestore.firebaseFirestoreStrings.gapi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstPartyCredentialsSettings extends CredentialsSettings {
  var client: js.Any
  var sessionIndex: String
  var `type`: gapi
}

object FirstPartyCredentialsSettings {
  @scala.inline
  def apply(client: js.Any, sessionIndex: String, `type`: gapi): FirstPartyCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], sessionIndex = sessionIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstPartyCredentialsSettings]
  }
}

