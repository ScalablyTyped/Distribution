package typings.expressDashNtlm.expressDashNtlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestNtlm extends js.Object {
  var DomainName: js.UndefOr[String] = js.undefined
  var UserName: js.UndefOr[String] = js.undefined
  var Workstation: js.UndefOr[String] = js.undefined
}

object RequestNtlm {
  @scala.inline
  def apply(DomainName: String = null, UserName: String = null, Workstation: String = null): RequestNtlm = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    if (Workstation != null) __obj.updateDynamic("Workstation")(Workstation)
    __obj.asInstanceOf[RequestNtlm]
  }
}

