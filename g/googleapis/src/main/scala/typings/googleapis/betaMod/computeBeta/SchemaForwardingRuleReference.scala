package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaForwardingRuleReference extends js.Object {
  var forwardingRule: js.UndefOr[String] = js.native
}

object SchemaForwardingRuleReference {
  @scala.inline
  def apply(): SchemaForwardingRuleReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingRuleReference]
  }
  @scala.inline
  implicit class SchemaForwardingRuleReferenceOps[Self <: SchemaForwardingRuleReference] (val x: Self) extends AnyVal {
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
    def setForwardingRule(value: String): Self = this.set("forwardingRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardingRule: Self = this.set("forwardingRule", js.undefined)
  }
  
}

