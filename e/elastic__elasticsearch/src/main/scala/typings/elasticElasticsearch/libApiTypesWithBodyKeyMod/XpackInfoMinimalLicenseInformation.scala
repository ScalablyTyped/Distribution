package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackInfoMinimalLicenseInformation extends StObject {
  
  var expiry_date_in_millis: EpochTime[UnitMillis]
  
  var mode: LicenseLicenseType
  
  var status: LicenseLicenseStatus
  
  var `type`: LicenseLicenseType
  
  var uid: String
}
object XpackInfoMinimalLicenseInformation {
  
  inline def apply(
    expiry_date_in_millis: EpochTime[UnitMillis],
    mode: LicenseLicenseType,
    status: LicenseLicenseStatus,
    `type`: LicenseLicenseType,
    uid: String
  ): XpackInfoMinimalLicenseInformation = {
    val __obj = js.Dynamic.literal(expiry_date_in_millis = expiry_date_in_millis.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackInfoMinimalLicenseInformation]
  }
  
  extension [Self <: XpackInfoMinimalLicenseInformation](x: Self) {
    
    inline def setExpiry_date_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "expiry_date_in_millis", value.asInstanceOf[js.Any])
    
    inline def setMode(value: LicenseLicenseType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: LicenseLicenseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: LicenseLicenseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
