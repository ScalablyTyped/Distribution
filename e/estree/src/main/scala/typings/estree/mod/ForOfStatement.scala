package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForOfStatement
  extends BaseForXStatement
     with Statement {
  
  var await: Boolean = js.native
  
  @JSName("type")
  var type_ForOfStatement: typings.estree.estreeStrings.ForOfStatement = js.native
}
object ForOfStatement {
  
  @scala.inline
  def apply(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typings.estree.estreeStrings.ForOfStatement
  ): ForOfStatement = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForOfStatement]
  }
  
  @scala.inline
  implicit class ForOfStatementMutableBuilder[Self <: ForOfStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
