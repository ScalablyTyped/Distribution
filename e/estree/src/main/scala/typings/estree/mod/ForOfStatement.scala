package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForOfStatement
  extends StObject
     with BaseForXStatement
     with Statement {
  
  var await: Boolean
  
  @JSName("type")
  var type_ForOfStatement: typings.estree.estreeStrings.ForOfStatement
}
object ForOfStatement {
  
  inline def apply(await: Boolean, body: Statement, left: VariableDeclaration | Pattern, right: Expression): ForOfStatement = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[ForOfStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForOfStatement] (val x: Self) extends AnyVal {
    
    inline def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
