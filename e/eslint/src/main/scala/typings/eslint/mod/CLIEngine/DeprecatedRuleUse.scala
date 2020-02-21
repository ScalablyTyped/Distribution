package typings.eslint.mod.CLIEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedRuleUse extends js.Object {
  var replacedBy: js.Array[String]
  var ruleId: String
}

object DeprecatedRuleUse {
  @scala.inline
  def apply(replacedBy: js.Array[String], ruleId: String): DeprecatedRuleUse = {
    val __obj = js.Dynamic.literal(replacedBy = replacedBy.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeprecatedRuleUse]
  }
}

