package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

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
  def getConfig(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__GetConfigResponse]
  /**
    * Performs prediction on the data in the request.
    *
    * &#42;&#42;&#42;&#42; REMOVE FROM GENERATED DOCUMENTATION
    */
  def predict(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleApi__HttpBody]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getConfig: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__GetConfigResponse]
    ],
    jobs: JobsResource,
    models: ModelsResource,
    operations: OperationsResource,
    predict: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleApi__HttpBody]
    ]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConfig")(getConfig)
    __obj.updateDynamic("jobs")(jobs)
    __obj.updateDynamic("models")(models)
    __obj.updateDynamic("operations")(operations)
    __obj.updateDynamic("predict")(predict)
    __obj.asInstanceOf[ProjectsResource]
  }
}

