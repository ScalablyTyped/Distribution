package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node_238858895
  extends eslintLib.eslintMod.RuleNs.ReportDescriptorLocation {
  var node: estreeLib.estreeMod.Node
}

object Anon_Node_238858895 {
  @scala.inline
  def apply(node: estreeLib.estreeMod.Node): Anon_Node_238858895 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Node_238858895]
  }
}

