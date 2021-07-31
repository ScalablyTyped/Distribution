package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object Association {
  
  @JSImport("gitana", "Association")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def implement(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def toString_(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def valueOf_(`type`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
