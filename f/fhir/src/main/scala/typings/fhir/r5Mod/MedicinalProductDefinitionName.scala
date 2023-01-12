package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinitionName
  extends StObject
     with BackboneElement {
  
  var _productName: js.UndefOr[Element] = js.undefined
  
  /**
    * Country where the name applies.
    */
  var countryLanguage: js.UndefOr[js.Array[MedicinalProductDefinitionNameCountryLanguage]] = js.undefined
  
  /**
    * Coding words or phrases of the name.
    */
  var namePart: js.UndefOr[js.Array[MedicinalProductDefinitionNameNamePart]] = js.undefined
  
  /**
    * The full product name.
    */
  var productName: String
  
  /**
    * Type of product name, such as rINN, BAN, Proprietary, Non-Proprietary.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductDefinitionName {
  
  inline def apply(productName: String): MedicinalProductDefinitionName = {
    val __obj = js.Dynamic.literal(productName = productName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductDefinitionName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductDefinitionName] (val x: Self) extends AnyVal {
    
    inline def setCountryLanguage(value: js.Array[MedicinalProductDefinitionNameCountryLanguage]): Self = StObject.set(x, "countryLanguage", value.asInstanceOf[js.Any])
    
    inline def setCountryLanguageUndefined: Self = StObject.set(x, "countryLanguage", js.undefined)
    
    inline def setCountryLanguageVarargs(value: MedicinalProductDefinitionNameCountryLanguage*): Self = StObject.set(x, "countryLanguage", js.Array(value*))
    
    inline def setNamePart(value: js.Array[MedicinalProductDefinitionNameNamePart]): Self = StObject.set(x, "namePart", value.asInstanceOf[js.Any])
    
    inline def setNamePartUndefined: Self = StObject.set(x, "namePart", js.undefined)
    
    inline def setNamePartVarargs(value: MedicinalProductDefinitionNameNamePart*): Self = StObject.set(x, "namePart", js.Array(value*))
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_productName(value: Element): Self = StObject.set(x, "_productName", value.asInstanceOf[js.Any])
    
    inline def set_productNameUndefined: Self = StObject.set(x, "_productName", js.undefined)
  }
}
