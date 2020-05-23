package typings.firebaseAdmin.admin.securityRules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Firebase security rules.
  */
trait Ruleset
  extends typings.firebaseAdmin.securityRulesMod.admin.securityRules.RulesetMetadata {
  val source: js.Array[typings.firebaseAdmin.securityRulesMod.admin.securityRules.RulesFile]
}

object Ruleset {
  @scala.inline
  def apply(
    createTime: String,
    name: String,
    source: js.Array[typings.firebaseAdmin.securityRulesMod.admin.securityRules.RulesFile]
  ): Ruleset = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruleset]
  }
}

