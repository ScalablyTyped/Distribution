package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for Firewall.BatchUpdateIngressRules.
  */
@js.native
trait SchemaBatchUpdateIngressRulesRequest extends js.Object {
  /**
    * A list of FirewallRules to replace the existing set.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.native
}

object SchemaBatchUpdateIngressRulesRequest {
  @scala.inline
  def apply(): SchemaBatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateIngressRulesRequest]
  }
  @scala.inline
  implicit class SchemaBatchUpdateIngressRulesRequestOps[Self <: SchemaBatchUpdateIngressRulesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIngressRulesVarargs(value: SchemaFirewallRule*): Self = this.set("ingressRules", js.Array(value :_*))
    @scala.inline
    def setIngressRules(value: js.Array[SchemaFirewallRule]): Self = this.set("ingressRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngressRules: Self = this.set("ingressRules", js.undefined)
  }
  
}

