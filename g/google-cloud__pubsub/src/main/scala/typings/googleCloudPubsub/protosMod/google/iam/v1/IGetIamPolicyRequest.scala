package typings.googleCloudPubsub.protosMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetIamPolicyRequest. */
trait IGetIamPolicyRequest extends js.Object {
  /** GetIamPolicyRequest options */
  var options: js.UndefOr[IGetPolicyOptions | Null] = js.undefined
  /** GetIamPolicyRequest resource */
  var resource: js.UndefOr[String | Null] = js.undefined
}

object IGetIamPolicyRequest {
  @scala.inline
  def apply(
    options: js.UndefOr[Null | IGetPolicyOptions] = js.undefined,
    resource: js.UndefOr[Null | String] = js.undefined
  ): IGetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(resource)) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetIamPolicyRequest]
  }
}

