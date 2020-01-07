package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `CreateServiceInstance()` method.
  */
@js.native
trait Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse extends js.Object {
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If broker executes operation asynchronously, this is the operation ID
    * that can be polled to check the completion status of said operation. This
    * broker always will return a non-empty operation on success.
    */
  var operation: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse {
  @scala.inline
  def apply(description: String = null, operation: String = null): Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudServicebrokerV1beta1__CreateServiceInstanceResponse]
  }
}

