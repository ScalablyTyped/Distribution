package typings.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a long running operation, which conforms to OpenService API.
  */
@js.native
trait Schema$GoogleCloudServicebrokerV1beta1__Operation extends js.Object {
  /**
    * Optional description of the Operation state.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The state of the operation. Valid values are: &quot;in progress&quot;,
    * &quot;succeeded&quot;, and &quot;failed&quot;.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudServicebrokerV1beta1__Operation {
  @scala.inline
  def apply(description: String = null, state: String = null): Schema$GoogleCloudServicebrokerV1beta1__Operation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudServicebrokerV1beta1__Operation]
  }
}

