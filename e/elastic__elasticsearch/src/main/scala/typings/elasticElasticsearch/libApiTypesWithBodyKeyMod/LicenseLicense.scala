package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseLicense extends StObject {
  
  var expiry_date_in_millis: EpochTime[UnitMillis]
  
  var issue_date_in_millis: EpochTime[UnitMillis]
  
  var issued_to: String
  
  var issuer: String
  
  var max_nodes: js.UndefOr[long | Null] = js.undefined
  
  var max_resource_units: js.UndefOr[long] = js.undefined
  
  var signature: String
  
  var start_date_in_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var `type`: LicenseLicenseType
  
  var uid: String
}
object LicenseLicense {
  
  inline def apply(
    expiry_date_in_millis: EpochTime[UnitMillis],
    issue_date_in_millis: EpochTime[UnitMillis],
    issued_to: String,
    issuer: String,
    signature: String,
    `type`: LicenseLicenseType,
    uid: String
  ): LicenseLicense = {
    val __obj = js.Dynamic.literal(expiry_date_in_millis = expiry_date_in_millis.asInstanceOf[js.Any], issue_date_in_millis = issue_date_in_millis.asInstanceOf[js.Any], issued_to = issued_to.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseLicense]
  }
  
  extension [Self <: LicenseLicense](x: Self) {
    
    inline def setExpiry_date_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "expiry_date_in_millis", value.asInstanceOf[js.Any])
    
    inline def setIssue_date_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "issue_date_in_millis", value.asInstanceOf[js.Any])
    
    inline def setIssued_to(value: String): Self = StObject.set(x, "issued_to", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setMax_nodes(value: long): Self = StObject.set(x, "max_nodes", value.asInstanceOf[js.Any])
    
    inline def setMax_nodesNull: Self = StObject.set(x, "max_nodes", null)
    
    inline def setMax_nodesUndefined: Self = StObject.set(x, "max_nodes", js.undefined)
    
    inline def setMax_resource_units(value: long): Self = StObject.set(x, "max_resource_units", value.asInstanceOf[js.Any])
    
    inline def setMax_resource_unitsUndefined: Self = StObject.set(x, "max_resource_units", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setStart_date_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_date_in_millis", value.asInstanceOf[js.Any])
    
    inline def setStart_date_in_millisUndefined: Self = StObject.set(x, "start_date_in_millis", js.undefined)
    
    inline def setType(value: LicenseLicenseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
