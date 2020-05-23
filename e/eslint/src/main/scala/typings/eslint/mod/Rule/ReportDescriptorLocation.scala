package typings.eslint.mod.Rule

import typings.eslint.anon.Column
import typings.eslint.mod.AST.SourceLocation
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.anon.NodeNode
  - typings.eslint.anon.Loc
*/
trait ReportDescriptorLocation extends js.Object

object ReportDescriptorLocation {
  @scala.inline
  def NodeNode(node: Node): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
  @scala.inline
  def Loc(loc: SourceLocation | Column): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
}

