package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionPackagingDistributor
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Distributor's human-readable name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Distributor as an Organization resource.
    */
  var organizationReference: js.UndefOr[js.Array[Reference]] = js.undefined
}
object DeviceDefinitionPackagingDistributor {
  
  inline def apply(): DeviceDefinitionPackagingDistributor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDefinitionPackagingDistributor]
  }
  
  extension [Self <: DeviceDefinitionPackagingDistributor](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrganizationReference(value: js.Array[Reference]): Self = StObject.set(x, "organizationReference", value.asInstanceOf[js.Any])
    
    inline def setOrganizationReferenceUndefined: Self = StObject.set(x, "organizationReference", js.undefined)
    
    inline def setOrganizationReferenceVarargs(value: Reference*): Self = StObject.set(x, "organizationReference", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
