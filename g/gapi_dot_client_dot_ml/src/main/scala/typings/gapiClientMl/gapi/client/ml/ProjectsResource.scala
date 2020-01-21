package typings.gapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMl.AnonAccesstoken
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
  def getConfig(request: AnonAccesstoken): Request_[GoogleCloudMlV1GetConfigResponse]
  /**
    * Performs prediction on the data in the request.
    *
    * &#42;&#42;&#42;&#42; REMOVE FROM GENERATED DOCUMENTATION
    */
  def predict(request: AnonAccesstoken): Request_[GoogleApiHttpBody]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getConfig: AnonAccesstoken => Request_[GoogleCloudMlV1GetConfigResponse],
    jobs: JobsResource,
    models: ModelsResource,
    operations: OperationsResource,
    predict: AnonAccesstoken => Request_[GoogleApiHttpBody]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction1(getConfig), jobs = jobs.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], predict = js.Any.fromFunction1(predict))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

