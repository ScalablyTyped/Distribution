package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForInStatement
  extends StObject
     with BaseForXStatement
     with Statement {
  
  @JSName("type")
  var type_ForInStatement: typings.estree.estreeStrings.ForInStatement
}
object ForInStatement {
  
  inline def apply(body: Statement, left: VariableDeclaration | Pattern, right: Expression): ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[ForInStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForInStatement] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.estree.estreeStrings.ForInStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
