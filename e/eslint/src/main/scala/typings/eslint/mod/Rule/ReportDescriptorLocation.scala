package typings.eslint.mod.Rule

import typings.eslint.AnonColumn
import typings.eslint.mod.AST.SourceLocation
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.AnonNode80921790
  - typings.eslint.AnonLoc
*/
trait ReportDescriptorLocation extends js.Object

object ReportDescriptorLocation {
  @scala.inline
  def AnonNode80921790(node: Node): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
  @scala.inline
  def AnonLoc(loc: SourceLocation | AnonColumn): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
}

