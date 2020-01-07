package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a deployment occurrence.
  */
@js.native
trait Schema$GrafeasV1beta1DeploymentDetails extends js.Object {
  /**
    * Required. Deployment history for the resource.
    */
  var deployment: js.UndefOr[Schema$Deployment] = js.native
}

object Schema$GrafeasV1beta1DeploymentDetails {
  @scala.inline
  def apply(deployment: Schema$Deployment = null): Schema$GrafeasV1beta1DeploymentDetails = {
    val __obj = js.Dynamic.literal()
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GrafeasV1beta1DeploymentDetails]
  }
}

