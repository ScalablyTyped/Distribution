package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeApplication
  extends StObject
     with Type_ {
  
  var applications: js.Array[Type_]
  
  var expression: Type_
  
  var `type`: typings.doctrine.doctrineStrings.TypeApplication
}
object TypeApplication {
  
  inline def apply(applications: js.Array[Type_], expression: Type_): TypeApplication = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeApplication")
    __obj.asInstanceOf[TypeApplication]
  }
  
  extension [Self <: TypeApplication](x: Self) {
    
    inline def setApplications(value: js.Array[Type_]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsVarargs(value: Type_ *): Self = StObject.set(x, "applications", js.Array(value :_*))
    
    inline def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.doctrine.doctrineStrings.TypeApplication): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
