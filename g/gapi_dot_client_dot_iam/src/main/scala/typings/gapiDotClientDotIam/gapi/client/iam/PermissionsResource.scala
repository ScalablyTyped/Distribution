package typings.gapiDotClientDotIam.gapi.client.iam

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotIam.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /**
    * Lists the permissions testable on a resource.
    * A permission is testable if it can be tested for an identity on a resource.
    */
  def queryTestablePermissions(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[QueryTestablePermissionsResponse]
}

object PermissionsResource {
  @scala.inline
  def apply(
    queryTestablePermissions: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[QueryTestablePermissionsResponse]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(queryTestablePermissions = js.Any.fromFunction1(queryTestablePermissions))
  
    __obj.asInstanceOf[PermissionsResource]
  }
}

