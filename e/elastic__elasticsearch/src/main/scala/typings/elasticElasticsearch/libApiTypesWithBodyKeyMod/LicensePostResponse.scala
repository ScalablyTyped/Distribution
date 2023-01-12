package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostResponse extends StObject {
  
  var acknowledge: js.UndefOr[LicensePostAcknowledgement] = js.undefined
  
  var acknowledged: Boolean
  
  var license_status: LicenseLicenseStatus
}
object LicensePostResponse {
  
  inline def apply(acknowledged: Boolean, license_status: LicenseLicenseStatus): LicensePostResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], license_status = license_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensePostResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicensePostResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledge(value: LicensePostAcknowledgement): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setLicense_status(value: LicenseLicenseStatus): Self = StObject.set(x, "license_status", value.asInstanceOf[js.Any])
  }
}
