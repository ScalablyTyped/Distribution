package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PollingOptions extends js.Object {
  /**
    * An array of diagnostics to be collected by Deployment Manager, these
    * diagnostics will be displayed to the user.
    */
  var diagnostics: js.UndefOr[js.Array[Schema$Diagnostic]] = js.native
  /**
    * JsonPath expression that determines if the request failed.
    */
  var failCondition: js.UndefOr[String] = js.native
  /**
    * JsonPath expression that determines if the request is completed.
    */
  var finishCondition: js.UndefOr[String] = js.native
  /**
    * JsonPath expression that evaluates to string, it indicates where to poll.
    */
  var pollingLink: js.UndefOr[String] = js.native
  /**
    * JsonPath expression, after polling is completed, indicates where to fetch
    * the resource.
    */
  var targetLink: js.UndefOr[String] = js.native
}

object Schema$PollingOptions {
  @scala.inline
  def apply(
    diagnostics: js.Array[Schema$Diagnostic] = null,
    failCondition: String = null,
    finishCondition: String = null,
    pollingLink: String = null,
    targetLink: String = null
  ): Schema$PollingOptions = {
    val __obj = js.Dynamic.literal()
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (failCondition != null) __obj.updateDynamic("failCondition")(failCondition.asInstanceOf[js.Any])
    if (finishCondition != null) __obj.updateDynamic("finishCondition")(finishCondition.asInstanceOf[js.Any])
    if (pollingLink != null) __obj.updateDynamic("pollingLink")(pollingLink.asInstanceOf[js.Any])
    if (targetLink != null) __obj.updateDynamic("targetLink")(targetLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PollingOptions]
  }
}

