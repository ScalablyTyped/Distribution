package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binding extends StObject {
  
  var condition: Expr = js.native
  
  var members: js.Array[String] = js.native
  
  var role: String = js.native
}
object Binding {
  
  @scala.inline
  def apply(condition: Expr, members: js.Array[String], role: String): Binding = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  
  @scala.inline
  implicit class BindingMutableBuilder[Self <: Binding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Expr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
