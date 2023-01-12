package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binding extends StObject {
  
  var condition: Expr
  
  var members: js.Array[String]
  
  var role: String
}
object Binding {
  
  inline def apply(condition: Expr, members: js.Array[String], role: String): Binding = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Binding] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Expr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
