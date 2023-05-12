package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductName
  extends StObject
     with BackboneElement {
  
  var _productName: js.UndefOr[Element] = js.undefined
  
  /**
    * Country where the name applies.
    */
  var countryLanguage: js.UndefOr[js.Array[MedicinalProductNameCountryLanguage]] = js.undefined
  
  /**
    * Coding words or phrases of the name.
    */
  var namePart: js.UndefOr[js.Array[MedicinalProductNameNamePart]] = js.undefined
  
  /**
    * The full product name.
    */
  var productName: String
}
object MedicinalProductName {
  
  inline def apply(productName: String): MedicinalProductName = {
    val __obj = js.Dynamic.literal(productName = productName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductName] (val x: Self) extends AnyVal {
    
    inline def setCountryLanguage(value: js.Array[MedicinalProductNameCountryLanguage]): Self = StObject.set(x, "countryLanguage", value.asInstanceOf[js.Any])
    
    inline def setCountryLanguageUndefined: Self = StObject.set(x, "countryLanguage", js.undefined)
    
    inline def setCountryLanguageVarargs(value: MedicinalProductNameCountryLanguage*): Self = StObject.set(x, "countryLanguage", js.Array(value*))
    
    inline def setNamePart(value: js.Array[MedicinalProductNameNamePart]): Self = StObject.set(x, "namePart", value.asInstanceOf[js.Any])
    
    inline def setNamePartUndefined: Self = StObject.set(x, "namePart", js.undefined)
    
    inline def setNamePartVarargs(value: MedicinalProductNameNamePart*): Self = StObject.set(x, "namePart", js.Array(value*))
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def set_productName(value: Element): Self = StObject.set(x, "_productName", value.asInstanceOf[js.Any])
    
    inline def set_productNameUndefined: Self = StObject.set(x, "_productName", js.undefined)
  }
}
