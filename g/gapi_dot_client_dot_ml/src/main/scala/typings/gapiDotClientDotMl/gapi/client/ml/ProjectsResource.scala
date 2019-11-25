package typings.gapiDotClientDotMl.gapi.client.ml

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotMl.Anon_Accesstoken
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
  def getConfig(request: Anon_Accesstoken): Request[GoogleCloudMlV1__GetConfigResponse]
  /**
    * Performs prediction on the data in the request.
    *
    * &#42;&#42;&#42;&#42; REMOVE FROM GENERATED DOCUMENTATION
    */
  def predict(request: Anon_Accesstoken): Request[GoogleApi__HttpBody]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getConfig: Anon_Accesstoken => Request[GoogleCloudMlV1__GetConfigResponse],
    jobs: JobsResource,
    models: ModelsResource,
    operations: OperationsResource,
    predict: Anon_Accesstoken => Request[GoogleApi__HttpBody]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction1(getConfig), jobs = jobs.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], predict = js.Any.fromFunction1(predict))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

