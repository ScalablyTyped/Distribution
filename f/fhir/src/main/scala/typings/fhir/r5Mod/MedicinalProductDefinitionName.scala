package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinitionName
  extends StObject
     with BackboneElement {
  
  var _productName: js.UndefOr[Element] = js.undefined
  
  /**
    * Coding words or phrases of the name.
    */
  var part: js.UndefOr[js.Array[MedicinalProductDefinitionNamePart]] = js.undefined
  
  /**
    * The full product name.
    */
  var productName: String
  
  /**
    * Type of product name, such as rINN, BAN, Proprietary, Non-Proprietary.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Country and jurisdiction where the name applies, and associated language.
    */
  var usage: js.UndefOr[js.Array[MedicinalProductDefinitionNameUsage]] = js.undefined
}
object MedicinalProductDefinitionName {
  
  inline def apply(productName: String): MedicinalProductDefinitionName = {
    val __obj = js.Dynamic.literal(productName = productName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductDefinitionName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductDefinitionName] (val x: Self) extends AnyVal {
    
    inline def setPart(value: js.Array[MedicinalProductDefinitionNamePart]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: MedicinalProductDefinitionNamePart*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsage(value: js.Array[MedicinalProductDefinitionNameUsage]): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setUsageVarargs(value: MedicinalProductDefinitionNameUsage*): Self = StObject.set(x, "usage", js.Array(value*))
    
    inline def set_productName(value: Element): Self = StObject.set(x, "_productName", value.asInstanceOf[js.Any])
    
    inline def set_productNameUndefined: Self = StObject.set(x, "_productName", js.undefined)
  }
}
