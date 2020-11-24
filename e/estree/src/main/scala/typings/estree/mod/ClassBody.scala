package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassBody
  extends BaseNode
     with Node {
  
  var body: js.Array[MethodDefinition] = js.native
  
  @JSName("type")
  var type_ClassBody: typings.estree.estreeStrings.ClassBody = js.native
}
object ClassBody {
  
  @scala.inline
  def apply(body: js.Array[MethodDefinition], `type`: typings.estree.estreeStrings.ClassBody): ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBody]
  }
  
  @scala.inline
  implicit class ClassBodyOps[Self <: ClassBody] (val x: Self) extends AnyVal {
    
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
    def setBodyVarargs(value: MethodDefinition*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[MethodDefinition]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ClassBody): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
