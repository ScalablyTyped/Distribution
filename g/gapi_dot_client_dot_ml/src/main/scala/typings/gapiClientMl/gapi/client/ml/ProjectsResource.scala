package typings.gapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMl.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var jobs: JobsResource
  var models: ModelsResource
  var operations: OperationsResource
  /**
    * Get the service account information associated with your project. You need
    * this information in order to grant the service account persmissions for
    * the Google Cloud Storage location where you put your model training code
    * for training the model with Google Cloud Machine Learning.
    */
  def getConfig(request: Accesstoken): Request[GoogleCloudMlV1GetConfigResponse]
  /**
    * Performs prediction on the data in the request.
    *
    * &#42;&#42;&#42;&#42; REMOVE FROM GENERATED DOCUMENTATION
    */
  def predict(request: Accesstoken): Request[GoogleApiHttpBody]
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
}

