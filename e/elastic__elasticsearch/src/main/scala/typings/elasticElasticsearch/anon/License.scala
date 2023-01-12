package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseLicense
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait License extends StObject {
  
  var license: js.UndefOr[LicenseLicense] = js.undefined
  
  var licenses: js.UndefOr[js.Array[LicenseLicense]] = js.undefined
}
object License {
  
  inline def apply(): License = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[License]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: License] (val x: Self) extends AnyVal {
    
    inline def setLicense(value: LicenseLicense): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setLicenses(value: js.Array[LicenseLicense]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: LicenseLicense*): Self = StObject.set(x, "licenses", js.Array(value*))
  }
}
