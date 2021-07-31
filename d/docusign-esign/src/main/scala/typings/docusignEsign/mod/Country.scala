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
  
  @scala.inline
  def apply(): Country = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Country]
  }
  
  @scala.inline
  implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsoCode(value: String): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoCodeUndefined: Self = StObject.set(x, "isoCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProvinceValidated(value: String): Self = StObject.set(x, "provinceValidated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvinceValidatedUndefined: Self = StObject.set(x, "provinceValidated", js.undefined)
    
    @scala.inline
    def setProvinces(value: js.Array[Province]): Self = StObject.set(x, "provinces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvincesUndefined: Self = StObject.set(x, "provinces", js.undefined)
    
    @scala.inline
    def setProvincesVarargs(value: Province*): Self = StObject.set(x, "provinces", js.Array(value :_*))
  }
}
