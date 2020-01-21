package typings.firebaseAdmin.admin.securityRules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Required metadata associated with a ruleset.
  */
trait RulesetMetadata extends js.Object {
  /**
    * Creation time of the `Ruleset` as a UTC timestamp string.
    */
  val createTime: String
  /**
    * Name of the `Ruleset` as a short string. This can be directly passed into APIs
    * like [`securityRules.getRuleset()`](admin.securityRules.SecurityRules#getRuleset)
    * and [`securityRules.deleteRuleset()`](admin.securityRules.SecurityRules#deleteRuleset).
    */
  val name: String
}

object RulesetMetadata {
  @scala.inline
  def apply(createTime: String, name: String): RulesetMetadata = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RulesetMetadata]
  }
}

