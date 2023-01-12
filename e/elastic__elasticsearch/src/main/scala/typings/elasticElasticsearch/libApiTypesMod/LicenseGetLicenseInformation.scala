package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseGetLicenseInformation extends StObject {
  
  var expiry_date: js.UndefOr[DateTime] = js.undefined
  
  var expiry_date_in_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var issue_date: DateTime
  
  var issue_date_in_millis: EpochTime[UnitMillis]
  
  var issued_to: String
  
  var issuer: String
  
  var max_nodes: long | Null
  
  var max_resource_units: js.UndefOr[integer | Null] = js.undefined
  
  var start_date_in_millis: EpochTime[UnitMillis]
  
  var status: LicenseLicenseStatus
  
  var `type`: LicenseLicenseType
  
  var uid: Uuid
}
object LicenseGetLicenseInformation {
  
  inline def apply(
    issue_date: DateTime,
    issue_date_in_millis: EpochTime[UnitMillis],
    issued_to: String,
    issuer: String,
    start_date_in_millis: EpochTime[UnitMillis],
    status: LicenseLicenseStatus,
    `type`: LicenseLicenseType,
    uid: Uuid
  ): LicenseGetLicenseInformation = {
    val __obj = js.Dynamic.literal(issue_date = issue_date.asInstanceOf[js.Any], issue_date_in_millis = issue_date_in_millis.asInstanceOf[js.Any], issued_to = issued_to.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], start_date_in_millis = start_date_in_millis.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], max_nodes = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseGetLicenseInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseGetLicenseInformation] (val x: Self) extends AnyVal {
    
    inline def setExpiry_date(value: DateTime): Self = StObject.set(x, "expiry_date", value.asInstanceOf[js.Any])
    
    inline def setExpiry_dateUndefined: Self = StObject.set(x, "expiry_date", js.undefined)
    
    inline def setExpiry_date_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "expiry_date_in_millis", value.asInstanceOf[js.Any])
    
    inline def setExpiry_date_in_millisUndefined: Self = StObject.set(x, "expiry_date_in_millis", js.undefined)
    
    inline def setIssue_date(value: DateTime): Self = StObject.set(x, "issue_date", value.asInstanceOf[js.Any])
    
    inline def setIssue_date_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "issue_date_in_millis", value.asInstanceOf[js.Any])
    
    inline def setIssued_to(value: String): Self = StObject.set(x, "issued_to", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setMax_nodes(value: long): Self = StObject.set(x, "max_nodes", value.asInstanceOf[js.Any])
    
    inline def setMax_nodesNull: Self = StObject.set(x, "max_nodes", null)
    
    inline def setMax_resource_units(value: integer): Self = StObject.set(x, "max_resource_units", value.asInstanceOf[js.Any])
    
    inline def setMax_resource_unitsNull: Self = StObject.set(x, "max_resource_units", null)
    
    inline def setMax_resource_unitsUndefined: Self = StObject.set(x, "max_resource_units", js.undefined)
    
    inline def setStart_date_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_date_in_millis", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: LicenseLicenseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: LicenseLicenseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Uuid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
