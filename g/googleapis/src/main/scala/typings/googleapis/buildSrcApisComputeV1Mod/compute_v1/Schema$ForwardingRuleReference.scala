package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ForwardingRuleReference extends js.Object {
  var forwardingRule: js.UndefOr[String] = js.native
}

object Schema$ForwardingRuleReference {
  @scala.inline
  def apply(forwardingRule: String = null): Schema$ForwardingRuleReference = {
    val __obj = js.Dynamic.literal()
    if (forwardingRule != null) __obj.updateDynamic("forwardingRule")(forwardingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ForwardingRuleReference]
  }
}

