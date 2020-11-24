package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDeclaration
  extends BaseFunction
     with Declaration
     with Function {
  
  @JSName("body")
  var body_FunctionDeclaration: BlockStatement = js.native
  
  /** It is null when a function declaration is a part of the `export default function` statement */
  var id: Identifier | Null = js.native
  
  @JSName("type")
  var type_FunctionDeclaration: typings.estree.estreeStrings.FunctionDeclaration = js.native
}
object FunctionDeclaration {
  
  @scala.inline
  def apply(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.FunctionDeclaration
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration]
  }
  
  @scala.inline
  implicit class FunctionDeclarationOps[Self <: FunctionDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: BlockStatement): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.FunctionDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
  }
}
