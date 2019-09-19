package typings.firebaseDashAdmin.adminNs.securityRulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A source file containing some Firebase security rules. The content includes raw
  * source code including text formatting, indentation and comments. Use the
  * [`securityRules.createRulesFileFromSource()`](admin.securityRules.SecurityRules#createRulesFileFromSource)
  * method to create new instances of this type.
  */
trait RulesFile extends js.Object {
  val content: String
  val name: String
}

object RulesFile {
  @scala.inline
  def apply(content: String, name: String): RulesFile = {
    val __obj = js.Dynamic.literal(content = content, name = name)
  
    __obj.asInstanceOf[RulesFile]
  }
}

