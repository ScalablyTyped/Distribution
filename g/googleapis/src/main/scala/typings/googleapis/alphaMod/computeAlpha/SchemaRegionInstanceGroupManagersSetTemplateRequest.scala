package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupManagersSetTemplateRequest extends StObject {
  
  /**
    * URL of the InstanceTemplate resource from which all new instances will be created.
    */
  var instanceTemplate: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegionInstanceGroupManagersSetTemplateRequest {
  
  inline def apply(): SchemaRegionInstanceGroupManagersSetTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersSetTemplateRequest]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagersSetTemplateRequest](x: Self) {
    
    inline def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setInstanceTemplateNull: Self = StObject.set(x, "instanceTemplate", null)
    
    inline def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
  }
}
