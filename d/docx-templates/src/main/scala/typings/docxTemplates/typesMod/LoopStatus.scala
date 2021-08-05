package typings.docxTemplates.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoopStatus extends StObject {
  
  var idx: Double
  
  var isIf: js.UndefOr[Boolean] = js.undefined
  
  var loopOver: js.Array[VarValue]
  
  var refNode: Node
  
  var refNodeLevel: Double
  
  var varName: String
}
object LoopStatus {
  
  inline def apply(idx: Double, loopOver: js.Array[VarValue], refNode: Node, refNodeLevel: Double, varName: String): LoopStatus = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], loopOver = loopOver.asInstanceOf[js.Any], refNode = refNode.asInstanceOf[js.Any], refNodeLevel = refNodeLevel.asInstanceOf[js.Any], varName = varName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopStatus]
  }
  
  extension [Self <: LoopStatus](x: Self) {
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIsIf(value: Boolean): Self = StObject.set(x, "isIf", value.asInstanceOf[js.Any])
    
    inline def setIsIfUndefined: Self = StObject.set(x, "isIf", js.undefined)
    
    inline def setLoopOver(value: js.Array[VarValue]): Self = StObject.set(x, "loopOver", value.asInstanceOf[js.Any])
    
    inline def setLoopOverVarargs(value: VarValue*): Self = StObject.set(x, "loopOver", js.Array(value :_*))
    
    inline def setRefNode(value: Node): Self = StObject.set(x, "refNode", value.asInstanceOf[js.Any])
    
    inline def setRefNodeLevel(value: Double): Self = StObject.set(x, "refNodeLevel", value.asInstanceOf[js.Any])
    
    inline def setVarName(value: String): Self = StObject.set(x, "varName", value.asInstanceOf[js.Any])
  }
}
