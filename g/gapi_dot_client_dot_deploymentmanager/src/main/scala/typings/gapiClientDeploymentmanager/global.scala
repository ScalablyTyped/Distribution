package typings.gapiClientDeploymentmanager

import typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager.DeploymentsResource
import typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager.ManifestsResource
import typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager.OperationsResource
import typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager.ResourcesResource
import typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager.TypesResource
import typings.gapiClientDeploymentmanager.gapiClientDeploymentmanagerStrings.deploymentmanager
import typings.gapiClientDeploymentmanager.gapiClientDeploymentmanagerStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val deployments: DeploymentsResource = js.native
      val manifests: ManifestsResource = js.native
      val operations: OperationsResource = js.native
      val resources: ResourcesResource = js.native
      val types: TypesResource = js.native
      /** Load Google Cloud Deployment Manager API v2 */
      def load(name: deploymentmanager, version: v2): js.Thenable[Unit] = js.native
      def load(name: deploymentmanager, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

