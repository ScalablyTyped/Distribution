package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Association")
@js.native
open class Association protected () extends AbstractNode {
  def this(branch: Any, `object`: Any) = this()
  
  def getDirection(node: Any): Any = js.native
  
  def getDirectionality(): Any = js.native
  
  def getOtherNodeId(node: Node): String = js.native
  
  def getSourceNodeChangesetId(): String = js.native
  
  def getSourceNodeId(): String = js.native
  
  def getSourceNodeType(): String = js.native
  
  def getTargetNodeChangesetId(): String = js.native
  
  def getTargetNodeId(): String = js.native
  
  def getTargetNodeType(): String = js.native
  
  def readOtherNode(node: Any): Any = js.native
  
  def readSourceNode(): Any = js.native
  
  def readTargetNode(): Any = js.native
}
object Association {
  
  @JSImport("gitana", "Association")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
