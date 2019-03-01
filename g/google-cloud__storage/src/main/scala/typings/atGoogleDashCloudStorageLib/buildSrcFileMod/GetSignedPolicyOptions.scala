package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSignedPolicyOptions extends js.Object {
  var acl: js.UndefOr[java.lang.String] = js.undefined
  var contentLengthRange: js.UndefOr[atGoogleDashCloudStorageLib.Anon_Max] = js.undefined
  @JSName("equals")
  var equals_FGetSignedPolicyOptions: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  var expires: java.lang.String | scala.Double | stdLib.Date
  var startsWith: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  var successRedirect: js.UndefOr[java.lang.String] = js.undefined
  var successStatus: js.UndefOr[java.lang.String] = js.undefined
}

object GetSignedPolicyOptions {
  @scala.inline
  def apply(
    expires: java.lang.String | scala.Double | stdLib.Date,
    acl: java.lang.String = null,
    contentLengthRange: atGoogleDashCloudStorageLib.Anon_Max = null,
    equals: js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]] = null,
    startsWith: js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]] = null,
    successRedirect: java.lang.String = null,
    successStatus: java.lang.String = null
  ): GetSignedPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (contentLengthRange != null) __obj.updateDynamic("contentLengthRange")(contentLengthRange)
    if (equals != null) __obj.updateDynamic("equals")(equals.asInstanceOf[js.Any])
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith.asInstanceOf[js.Any])
    if (successRedirect != null) __obj.updateDynamic("successRedirect")(successRedirect)
    if (successStatus != null) __obj.updateDynamic("successStatus")(successStatus)
    __obj.asInstanceOf[GetSignedPolicyOptions]
  }
}

