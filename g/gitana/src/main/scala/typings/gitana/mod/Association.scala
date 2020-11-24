package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Association")
@js.native
class Association protected () extends AbstractNode {
  def this(branch: js.Any, `object`: js.Any) = this()
  
  def getDirection(node: js.Any): js.Any = js.native
  
  def getDirectionality(): js.Any = js.native
  
  def getOtherNodeId(node: Node): String = js.native
  
  def getSourceNodeChangesetId(): String = js.native
  
  def getSourceNodeId(): String = js.native
  
  def getSourceNodeType(): String = js.native
  
  def getTargetNodeChangesetId(): String = js.native
  
  def getTargetNodeId(): String = js.native
  
  def getTargetNodeType(): String = js.native
  
  def readOtherNode(node: js.Any): js.Any = js.native
  
  def readSourceNode(): js.Any = js.native
  
  def readTargetNode(): js.Any = js.native
}
/* static members */
@JSImport("gitana", "Association")
@js.native
object Association extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
