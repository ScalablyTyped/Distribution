package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1Version extends js.Object {
  /**
    * Automatically scale the number of nodes used to serve the model in
    * response to increases and decreases in traffic. Care should be
    * taken to ramp up traffic according to the model's ability to scale
    * or you will start seeing increases in latency and 429 response codes.
    */
  var autoScaling: js.UndefOr[GoogleCloudMlV1AutoScaling] = js.native
  /** Output only. The time the version was created. */
  var createTime: js.UndefOr[String] = js.native
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
  var deploymentUri: js.UndefOr[String] = js.native
  /** Optional. The description specified for the version when it was created. */
  var description: js.UndefOr[String] = js.native
  /** Output only. The details of a failure or a cancellation. */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Output only. If true, this version will be used to handle prediction
    * requests that do not specify a version.
    *
    * You can change the default version by calling
    * [projects.methods.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  /** Output only. The time the version was last used for prediction. */
  var lastUseTime: js.UndefOr[String] = js.native
  /**
    * Manually select the number of nodes to use for serving the
    * model. You should generally use `auto_scaling` with an appropriate
    * `min_nodes` instead, but this option is available if you want more
    * predictable billing. Beware that latency and error rates will increase
    * if the traffic exceeds that capability of the system to serve it based
    * on the selected number of nodes.
    */
  var manualScaling: js.UndefOr[GoogleCloudMlV1ManualScaling] = js.native
  /**
    * Required.The name specified for the version when it was created.
    *
    * The version name must be unique within the model it is created in.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The Google Cloud ML runtime version to use for this deployment.
    * If not set, Google Cloud ML will choose a version.
    */
  var runtimeVersion: js.UndefOr[String] = js.native
  /** Output only. The state of a version. */
  var state: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1Version {
  @scala.inline
  def apply(): GoogleCloudMlV1Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Version]
  }
  @scala.inline
  implicit class GoogleCloudMlV1VersionOps[Self <: GoogleCloudMlV1Version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoScaling(value: GoogleCloudMlV1AutoScaling): Self = this.set("autoScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScaling: Self = this.set("autoScaling", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDeploymentUri(value: String): Self = this.set("deploymentUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentUri: Self = this.set("deploymentUri", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    @scala.inline
    def setLastUseTime(value: String): Self = this.set("lastUseTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUseTime: Self = this.set("lastUseTime", js.undefined)
    @scala.inline
    def setManualScaling(value: GoogleCloudMlV1ManualScaling): Self = this.set("manualScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualScaling: Self = this.set("manualScaling", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("runtimeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("runtimeVersion", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

