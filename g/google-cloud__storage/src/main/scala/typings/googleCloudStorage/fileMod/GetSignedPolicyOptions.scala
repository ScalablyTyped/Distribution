package typings.googleCloudStorage.fileMod

import typings.googleCloudStorage.anon.Max
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSignedPolicyOptions extends js.Object {
  var acl: js.UndefOr[String] = js.undefined
  var contentLengthRange: js.UndefOr[Max] = js.undefined
  @JSName("equals")
  var equals_FGetSignedPolicyOptions: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  var expires: String | Double | Date
  var startsWith: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  var successRedirect: js.UndefOr[String] = js.undefined
  var successStatus: js.UndefOr[String] = js.undefined
}

object GetSignedPolicyOptions {
  @scala.inline
  def apply(
    expires: String | Double | Date,
    acl: String = null,
    contentLengthRange: Max = null,
    equals: js.Array[js.Array[String] | String] = null,
    startsWith: js.Array[js.Array[String] | String] = null,
    successRedirect: String = null,
    successStatus: String = null
  ): GetSignedPolicyOptions = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (contentLengthRange != null) __obj.updateDynamic("contentLengthRange")(contentLengthRange.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(equals.asInstanceOf[js.Any])
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith.asInstanceOf[js.Any])
    if (successRedirect != null) __obj.updateDynamic("successRedirect")(successRedirect.asInstanceOf[js.Any])
    if (successStatus != null) __obj.updateDynamic("successStatus")(successStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignedPolicyOptions]
  }
}

