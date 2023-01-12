package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateParams
  extends StObject
     with GenericParams {
  
  var id: String
}
object GetTemplateParams {
  
  inline def apply(id: String): GetTemplateParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateParams] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
