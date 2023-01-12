package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrowStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var argument: Expression
  
  @JSName("type")
  var type_ThrowStatement: typings.estree.estreeStrings.ThrowStatement
}
object ThrowStatement {
  
  inline def apply(argument: Expression): ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[ThrowStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThrowStatement] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
