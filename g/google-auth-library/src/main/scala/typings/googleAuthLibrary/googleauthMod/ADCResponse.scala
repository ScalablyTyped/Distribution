package typings.googleAuthLibrary.googleauthMod

import typings.googleAuthLibrary.oauth2clientMod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADCResponse extends js.Object {
  var credential: OAuth2Client
  var projectId: String | Null
}

object ADCResponse {
  @scala.inline
  def apply(credential: OAuth2Client, projectId: String = null): ADCResponse = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADCResponse]
  }
}

