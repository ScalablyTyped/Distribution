package typings.gapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMl.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var jobs: JobsResource = js.native
  var models: ModelsResource = js.native
  var operations: OperationsResource = js.native
  /**
    * Get the service account information associated with your project. You need
    * this information in order to grant the service account persmissions for
    * the Google Cloud Storage location where you put your model training code
    * for training the model with Google Cloud Machine Learning.
    */
  def getConfig(request: Accesstoken): Request[GoogleCloudMlV1GetConfigResponse] = js.native
  /**
    * Performs prediction on the data in the request.
    *
    * &#42;&#42;&#42;&#42; REMOVE FROM GENERATED DOCUMENTATION
    */
  def predict(request: Accesstoken): Request[GoogleApiHttpBody] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    getConfig: Accesstoken => Request[GoogleCloudMlV1GetConfigResponse],
    jobs: JobsResource,
    models: ModelsResource,
    operations: OperationsResource,
    predict: Accesstoken => Request[GoogleApiHttpBody]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction1(getConfig), jobs = jobs.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], predict = js.Any.fromFunction1(predict))
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
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
    def setGetConfig(value: Accesstoken => Request[GoogleCloudMlV1GetConfigResponse]): Self = this.set("getConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setJobs(value: JobsResource): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setModels(value: ModelsResource): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredict(value: Accesstoken => Request[GoogleApiHttpBody]): Self = this.set("predict", js.Any.fromFunction1(value))
  }
  
}

