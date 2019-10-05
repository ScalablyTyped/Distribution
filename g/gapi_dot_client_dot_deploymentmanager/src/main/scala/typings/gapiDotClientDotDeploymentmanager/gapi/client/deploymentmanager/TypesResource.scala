package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDeploymentmanager.Anon_AltFieldsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypesResource extends js.Object {
  /** Lists all resource types for Deployment Manager. */
  def list(request: Anon_AltFieldsFilter): Request[TypesListResponse]
}

object TypesResource {
  @scala.inline
  def apply(list: Anon_AltFieldsFilter => Request[TypesListResponse]): TypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TypesResource]
  }
}

