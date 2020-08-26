package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rule that describes one or more match conditions along with
  * the action to be taken when traffic matches this condition (allow or deny).
  */
@js.native
trait SchemaSecurityPolicyRule extends js.Object {
  /**
    * The Action to preform when the client connection triggers the rule. Can
    * currently be either &quot;allow&quot; or &quot;deny()&quot; where valid
    * values for status are 403, 404, and 502.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output only] Type of the resource. Always compute#securityPolicyRule for
    * security policy rules
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A match condition that incoming traffic is evaluated against. If it
    * evaluates to true, the corresponding ?action? is enforced.
    */
  var `match`: js.UndefOr[SchemaSecurityPolicyRuleMatcher] = js.native
  /**
    * If set to true, the specified action is not enforced.
    */
  var preview: js.UndefOr[Boolean] = js.native
  /**
    * An integer indicating the priority of a rule in the list. The priority
    * must be a positive value between 0 and 2147483647. Rules are evaluated
    * from highest to lowest priority where 0 is the highest priority and
    * 2147483647 is the lowest prority.
    */
  var priority: js.UndefOr[Double] = js.native
}

object SchemaSecurityPolicyRule {
  @scala.inline
  def apply(): SchemaSecurityPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRule]
  }
  @scala.inline
  implicit class SchemaSecurityPolicyRuleOps[Self <: SchemaSecurityPolicyRule] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMatch(value: SchemaSecurityPolicyRuleMatcher): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

