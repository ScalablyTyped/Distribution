package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expr extends StObject {
  
  var description: String = js.native
  
  var expression: String = js.native
  
  var location: String = js.native
  
  var title: String = js.native
}
object Expr {
  
  @scala.inline
  def apply(description: String, expression: String, location: String, title: String): Expr = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expr]
  }
  
  @scala.inline
  implicit class ExprMutableBuilder[Self <: Expr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
