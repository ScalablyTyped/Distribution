package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeApplication extends Type_ {
  
  var applications: js.Array[Type_] = js.native
  
  var expression: Type_ = js.native
  
  var `type`: typings.doctrine.doctrineStrings.TypeApplication = js.native
}
object TypeApplication {
  
  @scala.inline
  def apply(
    applications: js.Array[Type_],
    expression: Type_,
    `type`: typings.doctrine.doctrineStrings.TypeApplication
  ): TypeApplication = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeApplication]
  }
  
  @scala.inline
  implicit class TypeApplicationMutableBuilder[Self <: TypeApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: js.Array[Type_]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsVarargs(value: Type_ *): Self = StObject.set(x, "applications", js.Array(value :_*))
    
    @scala.inline
    def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.TypeApplication): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
