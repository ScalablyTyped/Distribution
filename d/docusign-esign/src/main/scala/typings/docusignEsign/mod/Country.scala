package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Country extends StObject {
  
  var isoCode: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var provinceValidated: js.UndefOr[String] = js.undefined
  
  var provinces: js.UndefOr[js.Array[Province]] = js.undefined
}
object Country {
  
  inline def apply(): Country = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Country]
  }
  
  extension [Self <: Country](x: Self) {
    
    inline def setIsoCode(value: String): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
    
    inline def setIsoCodeUndefined: Self = StObject.set(x, "isoCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProvinceValidated(value: String): Self = StObject.set(x, "provinceValidated", value.asInstanceOf[js.Any])
    
    inline def setProvinceValidatedUndefined: Self = StObject.set(x, "provinceValidated", js.undefined)
    
    inline def setProvinces(value: js.Array[Province]): Self = StObject.set(x, "provinces", value.asInstanceOf[js.Any])
    
    inline def setProvincesUndefined: Self = StObject.set(x, "provinces", js.undefined)
    
    inline def setProvincesVarargs(value: Province*): Self = StObject.set(x, "provinces", js.Array(value :_*))
  }
}
