package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var body: js.Array[Statement]
  
  var innerComments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  @JSName("type")
  var type_BlockStatement: typings.estree.estreeStrings.BlockStatement
}
object BlockStatement {
  
  inline def apply(body: js.Array[Statement]): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[BlockStatement]
  }
  
  extension [Self <: BlockStatement](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    inline def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
    
    inline def setInnerCommentsUndefined: Self = StObject.set(x, "innerComments", js.undefined)
    
    inline def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value :_*))
    
    inline def setType(value: typings.estree.estreeStrings.BlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
