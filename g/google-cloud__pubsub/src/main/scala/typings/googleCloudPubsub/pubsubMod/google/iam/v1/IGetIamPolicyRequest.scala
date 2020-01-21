package typings.googleCloudPubsub.pubsubMod.google.iam.v1

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
  def apply(options: IGetPolicyOptions = null, resource: String = null): IGetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetIamPolicyRequest]
  }
}

