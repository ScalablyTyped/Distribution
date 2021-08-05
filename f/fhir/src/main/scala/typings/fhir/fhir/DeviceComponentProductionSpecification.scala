package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification details such as Component Revisions, or Serial Numbers
  */
trait DeviceComponentProductionSpecification
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'productionSpec'.
    */
  var _productionSpec: js.UndefOr[Element] = js.undefined
  
  /**
    * Internal component unique identification
    */
  var componentId: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A printable string defining the component
    */
  var productionSpec: js.UndefOr[String] = js.undefined
  
  /**
    * Type or kind of production specification, for example serial number or software revision
    */
  var specType: js.UndefOr[CodeableConcept] = js.undefined
}
object DeviceComponentProductionSpecification {
  
  inline def apply(): DeviceComponentProductionSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComponentProductionSpecification]
  }
  
  extension [Self <: DeviceComponentProductionSpecification](x: Self) {
    
    inline def setComponentId(value: Identifier): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    inline def setProductionSpec(value: String): Self = StObject.set(x, "productionSpec", value.asInstanceOf[js.Any])
    
    inline def setProductionSpecUndefined: Self = StObject.set(x, "productionSpec", js.undefined)
    
    inline def setSpecType(value: CodeableConcept): Self = StObject.set(x, "specType", value.asInstanceOf[js.Any])
    
    inline def setSpecTypeUndefined: Self = StObject.set(x, "specType", js.undefined)
    
    inline def set_productionSpec(value: Element): Self = StObject.set(x, "_productionSpec", value.asInstanceOf[js.Any])
    
    inline def set_productionSpecUndefined: Self = StObject.set(x, "_productionSpec", js.undefined)
  }
}
