package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesResource extends js.Object {
  /** Gets information about a single resource. */
  def get(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltDeploymentFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Resource]
  /** Lists all resources in a given deployment. */
  def list(request: gapiDotClientDotDeploymentmanagerLib.Anon_AltDeploymentFields): gapiDotClientLib.gapiNs.clientNs.Request[ResourcesListResponse]
}

object ResourcesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDeploymentmanagerLib.Anon_AltDeploymentFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Resource]
    ],
    list: js.Function1[
      gapiDotClientDotDeploymentmanagerLib.Anon_AltDeploymentFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ResourcesListResponse]
    ]
  ): ResourcesResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[ResourcesResource]
  }
}

