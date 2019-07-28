package typings.eslint.eslintMod.RuleNs

import typings.eslint.Anon_Column
import typings.eslint.eslintMod.ASTNs.SourceLocation
import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDescriptorLocation extends js.Object {
  var loc: js.UndefOr[SourceLocation | Anon_Column] = js.undefined
  var node: js.UndefOr[Node] = js.undefined
}

object ReportDescriptorLocation {
  @scala.inline
  def apply(loc: SourceLocation | Anon_Column = null, node: Node = null): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal()
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
}

