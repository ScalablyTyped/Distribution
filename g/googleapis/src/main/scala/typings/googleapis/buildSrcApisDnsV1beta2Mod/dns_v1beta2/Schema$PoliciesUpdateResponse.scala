package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PoliciesUpdateResponse extends js.Object {
  var header: js.UndefOr[Schema$ResponseHeader] = js.native
  var policy: js.UndefOr[Schema$Policy] = js.native
}

object Schema$PoliciesUpdateResponse {
  @scala.inline
  def apply(header: Schema$ResponseHeader = null, policy: Schema$Policy = null): Schema$PoliciesUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PoliciesUpdateResponse]
  }
}

