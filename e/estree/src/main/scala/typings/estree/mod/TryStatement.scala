package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TryStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var block: BlockStatement
  
  var finalizer: js.UndefOr[BlockStatement | Null] = js.undefined
  
  var handler: js.UndefOr[CatchClause | Null] = js.undefined
  
  @JSName("type")
  var type_TryStatement: typings.estree.estreeStrings.TryStatement
}
object TryStatement {
  
  inline def apply(block: BlockStatement): TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[TryStatement]
  }
  
  extension [Self <: TryStatement](x: Self) {
    
    inline def setBlock(value: BlockStatement): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setFinalizer(value: BlockStatement): Self = StObject.set(x, "finalizer", value.asInstanceOf[js.Any])
    
    inline def setFinalizerNull: Self = StObject.set(x, "finalizer", null)
    
    inline def setFinalizerUndefined: Self = StObject.set(x, "finalizer", js.undefined)
    
    inline def setHandler(value: CatchClause): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setType(value: typings.estree.estreeStrings.TryStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
