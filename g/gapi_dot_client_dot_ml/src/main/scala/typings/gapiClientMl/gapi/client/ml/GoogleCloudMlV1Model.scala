package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1Model extends js.Object {
  /**
    * Output only. The default version of the model. This version will be used to
    * handle prediction requests that do not specify a version.
    *
    * You can change the default version by calling
    * [projects.methods.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    */
  var defaultVersion: js.UndefOr[GoogleCloudMlV1Version] = js.native
  /** Optional. The description specified for the model when it was created. */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The name specified for the model when it was created.
    *
    * The model name must be unique within the project it is created in.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. If true, enables StackDriver Logging for online prediction.
    * Default is false.
    */
  var onlinePredictionLogging: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The list of regions where the model is going to be deployed.
    * Currently only one region per model is supported.
    * Defaults to 'us-central1' if nothing is set.
    * Note:
    * &#42;   No matter where a model is deployed, it can always be accessed by
    * users from anywhere, both for online and batch prediction.
    * &#42;   The region for a batch prediction job is set by the region field when
    * submitting the batch prediction job and does not take its value from
    * this field.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
}

object GoogleCloudMlV1Model {
  @scala.inline
  def apply(): GoogleCloudMlV1Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Model]
  }
  @scala.inline
  implicit class GoogleCloudMlV1ModelOps[Self <: GoogleCloudMlV1Model] (val x: Self) extends AnyVal {
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
    def setDefaultVersion(value: GoogleCloudMlV1Version): Self = this.set("defaultVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVersion: Self = this.set("defaultVersion", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnlinePredictionLogging(value: Boolean): Self = this.set("onlinePredictionLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlinePredictionLogging: Self = this.set("onlinePredictionLogging", js.undefined)
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
  
}

