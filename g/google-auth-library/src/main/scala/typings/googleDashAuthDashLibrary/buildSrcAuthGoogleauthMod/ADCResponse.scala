package typings.googleDashAuthDashLibrary.buildSrcAuthGoogleauthMod

import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.OAuth2Client
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
    val __obj = js.Dynamic.literal(credential = credential)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ADCResponse]
  }
}

