package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportExpression
  extends StObject
     with BaseNode {
  
  var source: Expression
  
  @JSName("type")
  var type_ImportExpression: typings.estree.estreeStrings.ImportExpression
}
object ImportExpression {
  
  inline def apply(source: Expression): ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportExpression")
    __obj.asInstanceOf[ImportExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportExpression] (val x: Self) extends AnyVal {
    
    inline def setSource(value: Expression): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.ImportExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
