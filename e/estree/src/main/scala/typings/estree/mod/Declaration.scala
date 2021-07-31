package typings.estree.mod

import typings.estree.estreeStrings.`var`
import typings.estree.estreeStrings.const
import typings.estree.estreeStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.FunctionDeclaration
  - typings.estree.mod.VariableDeclaration
  - typings.estree.mod.ClassDeclaration
*/
trait Declaration
  extends StObject
     with Statement
object Declaration {
  
  @scala.inline
  def ClassDeclaration(body: ClassBody): typings.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typings.estree.mod.ClassDeclaration]
  }
  
  @scala.inline
  def FunctionDeclaration(body: BlockStatement, params: js.Array[Pattern]): typings.estree.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.estree.mod.FunctionDeclaration]
  }
  
  @scala.inline
  def VariableDeclaration(declarations: js.Array[VariableDeclarator], kind: `var` | let | const): typings.estree.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typings.estree.mod.VariableDeclaration]
  }
}
