package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatchClause
  extends StObject
     with BaseNode {
  
  var body: BlockStatement
  
  var param: Pattern | Null
  
  @JSName("type")
  var type_CatchClause: typings.estree.estreeStrings.CatchClause
}
object CatchClause {
  
  inline def apply(body: BlockStatement): CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], param = null)
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[CatchClause]
  }
  
  extension [Self <: CatchClause](x: Self) {
    
    inline def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setParam(value: Pattern): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamNull: Self = StObject.set(x, "param", null)
    
    inline def setType(value: typings.estree.estreeStrings.CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
