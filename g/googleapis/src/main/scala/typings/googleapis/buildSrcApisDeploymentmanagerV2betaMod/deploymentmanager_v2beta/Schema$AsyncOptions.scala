package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Async options that determine when a resource should finish.
  */
@js.native
trait Schema$AsyncOptions extends js.Object {
  /**
    * Method regex where this policy will apply.
    */
  var methodMatch: js.UndefOr[String] = js.native
  /**
    * Deployment manager will poll instances for this API resource setting a
    * RUNNING state, and blocking until polling conditions tell whether the
    * resource is completed or failed.
    */
  var pollingOptions: js.UndefOr[Schema$PollingOptions] = js.native
}

object Schema$AsyncOptions {
  @scala.inline
  def apply(methodMatch: String = null, pollingOptions: Schema$PollingOptions = null): Schema$AsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (methodMatch != null) __obj.updateDynamic("methodMatch")(methodMatch.asInstanceOf[js.Any])
    if (pollingOptions != null) __obj.updateDynamic("pollingOptions")(pollingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AsyncOptions]
  }
}

