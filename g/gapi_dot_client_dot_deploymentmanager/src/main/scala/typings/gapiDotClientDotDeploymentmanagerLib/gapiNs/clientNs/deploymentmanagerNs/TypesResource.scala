package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypesResource extends js.Object {
  /** Lists all resource types for Deployment Manager. */
  def list(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[TypesListResponse]
}

object TypesResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotDeploymentmanagerLib.Anon_AltFieldsFilter => gapiDotClientLib.gapiNs.clientNs.Request[TypesListResponse]
  ): TypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TypesResource]
  }
}

