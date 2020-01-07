package typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OperationDnsKeyContext extends js.Object {
  var newValue: js.UndefOr[Schema$DnsKey] = js.native
  var oldValue: js.UndefOr[Schema$DnsKey] = js.native
}

object Schema$OperationDnsKeyContext {
  @scala.inline
  def apply(newValue: Schema$DnsKey = null, oldValue: Schema$DnsKey = null): Schema$OperationDnsKeyContext = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationDnsKeyContext]
  }
}

