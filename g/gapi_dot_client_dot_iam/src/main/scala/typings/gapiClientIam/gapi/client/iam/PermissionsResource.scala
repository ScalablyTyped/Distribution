package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientIam.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /**
    * Lists the permissions testable on a resource.
    * A permission is testable if it can be tested for an identity on a resource.
    */
  def queryTestablePermissions(request: AnonOauthtoken): Request_[QueryTestablePermissionsResponse]
}

object PermissionsResource {
  @scala.inline
  def apply(queryTestablePermissions: AnonOauthtoken => Request_[QueryTestablePermissionsResponse]): PermissionsResource = {
    val __obj = js.Dynamic.literal(queryTestablePermissions = js.Any.fromFunction1(queryTestablePermissions))
    __obj.asInstanceOf[PermissionsResource]
  }
}

