package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderSearchTemplateParams
  extends StObject
     with GenericParams {
  
  var id: String
}
object RenderSearchTemplateParams {
  
  inline def apply(id: String): RenderSearchTemplateParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSearchTemplateParams]
  }
  
  extension [Self <: RenderSearchTemplateParams](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
