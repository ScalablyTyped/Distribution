package typings.expressDashNtlm.expressDashNtlmMod.Global.ExpressNs

import typings.expressDashNtlm.expressDashNtlmMod.RequestNtlm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var ntlm: js.UndefOr[RequestNtlm] = js.undefined
}

object Request {
  @scala.inline
  def apply(ntlm: RequestNtlm = null): Request = {
    val __obj = js.Dynamic.literal()
    if (ntlm != null) __obj.updateDynamic("ntlm")(ntlm)
    __obj.asInstanceOf[Request]
  }
}

