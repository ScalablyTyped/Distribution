package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for CreateInstance.
  */
@js.native
trait Schema$CreateInstanceRequest extends js.Object {
  /**
    * Required. The instance to create.  The name may be omitted, but if
    * specified must be `&lt;parent&gt;/instances/&lt;instance_id&gt;`.
    */
  var instance: js.UndefOr[Schema$Instance] = js.native
  /**
    * Required. The ID of the instance to create.  Valid identifiers are of the
    * form `a-z*[a-z0-9]` and must be between 6 and 30 characters in length.
    */
  var instanceId: js.UndefOr[String] = js.native
}

object Schema$CreateInstanceRequest {
  @scala.inline
  def apply(instance: Schema$Instance = null, instanceId: String = null): Schema$CreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateInstanceRequest]
  }
}

