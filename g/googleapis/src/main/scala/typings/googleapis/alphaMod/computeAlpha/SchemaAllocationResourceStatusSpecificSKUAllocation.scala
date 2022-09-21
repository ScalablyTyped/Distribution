package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllocationResourceStatusSpecificSKUAllocation extends StObject {
  
  /**
    * ID of the instance template used to populate reservation properties.
    */
  var sourceInstanceTemplateId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAllocationResourceStatusSpecificSKUAllocation {
  
  inline def apply(): SchemaAllocationResourceStatusSpecificSKUAllocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationResourceStatusSpecificSKUAllocation]
  }
  
  extension [Self <: SchemaAllocationResourceStatusSpecificSKUAllocation](x: Self) {
    
    inline def setSourceInstanceTemplateId(value: String): Self = StObject.set(x, "sourceInstanceTemplateId", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceTemplateIdNull: Self = StObject.set(x, "sourceInstanceTemplateId", null)
    
    inline def setSourceInstanceTemplateIdUndefined: Self = StObject.set(x, "sourceInstanceTemplateId", js.undefined)
  }
}
