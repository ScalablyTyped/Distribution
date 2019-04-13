package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorLocation extends js.Object {
  var loc: js.UndefOr[eslintLib.eslintMod.ASTNs.SourceLocation | eslintLib.Anon_Column] = js.undefined
  var node: js.UndefOr[estreeLib.estreeMod.Node] = js.undefined
}

object ReportDescriptorLocation {
  @scala.inline
  def apply(
    loc: eslintLib.eslintMod.ASTNs.SourceLocation | eslintLib.Anon_Column = null,
    node: estreeLib.estreeMod.Node = null
  ): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal()
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
}

