package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.gapiClientIam.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /**
    * Lists the permissions testable on a resource.
    * A permission is testable if it can be tested for an identity on a resource.
    */
  def queryTestablePermissions(request: Oauthtoken): Request[QueryTestablePermissionsResponse]
}

object PermissionsResource {
  @scala.inline
  def apply(queryTestablePermissions: Oauthtoken => Request[QueryTestablePermissionsResponse]): PermissionsResource = {
    val __obj = js.Dynamic.literal(queryTestablePermissions = js.Any.fromFunction1(queryTestablePermissions))
    __obj.asInstanceOf[PermissionsResource]
  }
}

