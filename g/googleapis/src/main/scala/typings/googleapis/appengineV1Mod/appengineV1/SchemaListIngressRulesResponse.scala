package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Firewall.ListIngressRules.
  */
@js.native
trait SchemaListIngressRulesResponse extends js.Object {
  /**
    * The ingress FirewallRules for this application.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListIngressRulesResponse {
  @scala.inline
  def apply(): SchemaListIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListIngressRulesResponse]
  }
  @scala.inline
  implicit class SchemaListIngressRulesResponseOps[Self <: SchemaListIngressRulesResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

