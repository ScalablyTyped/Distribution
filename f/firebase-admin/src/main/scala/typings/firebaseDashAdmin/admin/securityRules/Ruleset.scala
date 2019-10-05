package typings.firebaseDashAdmin.admin.securityRules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Firebase security rules.
  */
trait Ruleset extends RulesetMetadata {
  val source: js.Array[RulesFile]
}

object Ruleset {
  @scala.inline
  def apply(createTime: String, name: String, source: js.Array[RulesFile]): Ruleset = {
    val __obj = js.Dynamic.literal(createTime = createTime, name = name, source = source)
  
    __obj.asInstanceOf[Ruleset]
  }
}

