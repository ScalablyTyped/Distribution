package typings
package googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADCResponse extends js.Object {
  var credential: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2Client
  var projectId: java.lang.String | scala.Null
}

object ADCResponse {
  @scala.inline
  def apply(
    credential: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2Client,
    projectId: java.lang.String = null
  ): ADCResponse = {
    val __obj = js.Dynamic.literal(credential = credential)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ADCResponse]
  }
}

