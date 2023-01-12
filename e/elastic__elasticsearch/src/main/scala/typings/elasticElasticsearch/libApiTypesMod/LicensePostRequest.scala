package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var acknowledge: js.UndefOr[Boolean] = js.undefined
  
  var license: js.UndefOr[LicenseLicense] = js.undefined
  
  var licenses: js.UndefOr[js.Array[LicenseLicense]] = js.undefined
}
object LicensePostRequest {
  
  inline def apply(): LicensePostRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicensePostRequest] (val x: Self) extends AnyVal {
    
    inline def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
    
    inline def setLicense(value: LicenseLicense): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setLicenses(value: js.Array[LicenseLicense]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: LicenseLicense*): Self = StObject.set(x, "licenses", js.Array(value*))
  }
}
