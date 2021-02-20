package typings.estree.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ClassBodyMutableBuilder[Self <: ClassBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[MethodDefinition]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: MethodDefinition*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
