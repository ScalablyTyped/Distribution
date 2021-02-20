package typings.docxTemplates.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoopStatus extends StObject {
  
  var idx: Double = js.native
  
  var isIf: js.UndefOr[Boolean] = js.native
  
  var loopOver: js.Array[VarValue] = js.native
  
  var refNode: Node = js.native
  
  var refNodeLevel: Double = js.native
  
  var varName: String = js.native
}
object LoopStatus {
  
  @scala.inline
  def apply(idx: Double, loopOver: js.Array[VarValue], refNode: Node, refNodeLevel: Double, varName: String): LoopStatus = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], loopOver = loopOver.asInstanceOf[js.Any], refNode = refNode.asInstanceOf[js.Any], refNodeLevel = refNodeLevel.asInstanceOf[js.Any], varName = varName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopStatus]
  }
  
  @scala.inline
  implicit class LoopStatusMutableBuilder[Self <: LoopStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIf(value: Boolean): Self = StObject.set(x, "isIf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIfUndefined: Self = StObject.set(x, "isIf", js.undefined)
    
    @scala.inline
    def setLoopOver(value: js.Array[VarValue]): Self = StObject.set(x, "loopOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopOverVarargs(value: VarValue*): Self = StObject.set(x, "loopOver", js.Array(value :_*))
    
    @scala.inline
    def setRefNode(value: Node): Self = StObject.set(x, "refNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefNodeLevel(value: Double): Self = StObject.set(x, "refNodeLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarName(value: String): Self = StObject.set(x, "varName", value.asInstanceOf[js.Any])
  }
}
