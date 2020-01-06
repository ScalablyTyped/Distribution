package typings.eslint.eslintMod.Rule

import typings.eslint.Anon_Column
import typings.eslint.eslintMod.AST.SourceLocation
import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.Anon_Node_1457648560
  - typings.eslint.Anon_Loc
*/
trait ReportDescriptorLocation extends js.Object

object ReportDescriptorLocation {
  @scala.inline
  def Anon_Node_1457648560(node: Node): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
  @scala.inline
  def Anon_Loc(loc: SourceLocation | Anon_Column): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
}

