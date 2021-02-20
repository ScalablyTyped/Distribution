package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForInStatement
  extends BaseForXStatement
     with Statement {
  
  @JSName("type")
  var type_ForInStatement: typings.estree.estreeStrings.ForInStatement = js.native
}
object ForInStatement {
  
  @scala.inline
  def apply(
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typings.estree.estreeStrings.ForInStatement
  ): ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForInStatement]
  }
  
  @scala.inline
  implicit class ForInStatementMutableBuilder[Self <: ForInStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ForInStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
