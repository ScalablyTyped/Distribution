package typings.gapiDotClientDotMl.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__Version extends js.Object {
  /**
    * Automatically scale the number of nodes used to serve the model in
    * response to increases and decreases in traffic. Care should be
    * taken to ramp up traffic according to the model's ability to scale
    * or you will start seeing increases in latency and 429 response codes.
    */
  var autoScaling: js.UndefOr[GoogleCloudMlV1__AutoScaling] = js.undefined
  /** Output only. The time the version was created. */
  var createTime: js.UndefOr[String] = js.undefined
  /**
    * Required. The Google Cloud Storage location of the trained model used to
    * create the version. See the
    * [overview of model
    * deployment](/ml-engine/docs/concepts/deployment-overview) for more
    * information.
    *
    * When passing Version to
    * [projects.models.versions.create](/ml-engine/reference/rest/v1/projects.models.versions/create)
    * the model service uses the specified location as the source of the model.
    * Once deployed, the model version is hosted by the prediction service, so
    * this location is useful only as a historical record.
    * The total number of model files can't exceed 1000.
    */
  var deploymentUri: js.UndefOr[String] = js.undefined
  /** Optional. The description specified for the version when it was created. */
  var description: js.UndefOr[String] = js.undefined
  /** Output only. The details of a failure or a cancellation. */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
    * Output only. If true, this version will be used to handle prediction
    * requests that do not specify a version.
    *
    * You can change the default version by calling
    * [projects.methods.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  /** Output only. The time the version was last used for prediction. */
  var lastUseTime: js.UndefOr[String] = js.undefined
  /**
    * Manually select the number of nodes to use for serving the
    * model. You should generally use `auto_scaling` with an appropriate
    * `min_nodes` instead, but this option is available if you want more
    * predictable billing. Beware that latency and error rates will increase
    * if the traffic exceeds that capability of the system to serve it based
    * on the selected number of nodes.
    */
  var manualScaling: js.UndefOr[GoogleCloudMlV1__ManualScaling] = js.undefined
  /**
    * Required.The name specified for the version when it was created.
    *
    * The version name must be unique within the model it is created in.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Optional. The Google Cloud ML runtime version to use for this deployment.
    * If not set, Google Cloud ML will choose a version.
    */
  var runtimeVersion: js.UndefOr[String] = js.undefined
  /** Output only. The state of a version. */
  var state: js.UndefOr[String] = js.undefined
}

object GoogleCloudMlV1__Version {
  @scala.inline
  def apply(
    autoScaling: GoogleCloudMlV1__AutoScaling = null,
    createTime: String = null,
    deploymentUri: String = null,
    description: String = null,
    errorMessage: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    lastUseTime: String = null,
    manualScaling: GoogleCloudMlV1__ManualScaling = null,
    name: String = null,
    runtimeVersion: String = null,
    state: String = null
  ): GoogleCloudMlV1__Version = {
    val __obj = js.Dynamic.literal()
    if (autoScaling != null) __obj.updateDynamic("autoScaling")(autoScaling)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (deploymentUri != null) __obj.updateDynamic("deploymentUri")(deploymentUri)
    if (description != null) __obj.updateDynamic("description")(description)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (lastUseTime != null) __obj.updateDynamic("lastUseTime")(lastUseTime)
    if (manualScaling != null) __obj.updateDynamic("manualScaling")(manualScaling)
    if (name != null) __obj.updateDynamic("name")(name)
    if (runtimeVersion != null) __obj.updateDynamic("runtimeVersion")(runtimeVersion)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[GoogleCloudMlV1__Version]
  }
}

