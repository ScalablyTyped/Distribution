package typings
package expressDashNtlmLib.expressDashNtlmMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var ntlm: js.UndefOr[expressDashNtlmLib.expressDashNtlmMod.expressNtlmNs.RequestNtlm] = js.undefined
}

object Request {
  @scala.inline
  def apply(ntlm: expressDashNtlmLib.expressDashNtlmMod.expressNtlmNs.RequestNtlm = null): Request = {
    val __obj = js.Dynamic.literal()
    if (ntlm != null) __obj.updateDynamic("ntlm")(ntlm)
    __obj.asInstanceOf[Request]
  }
}

