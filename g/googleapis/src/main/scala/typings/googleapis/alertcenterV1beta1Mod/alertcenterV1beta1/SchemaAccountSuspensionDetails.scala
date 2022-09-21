package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountSuspensionDetails extends StObject {
  
  /**
    * The reason why this account is receiving an account suspension warning.
    */
  var abuseReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the product being abused. This is restricted to only the following values: "Gmail" "Google Workspace" "Payments" "Voice" "YouTube" "Other"
    */
  var productName: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountSuspensionDetails {
  
  inline def apply(): SchemaAccountSuspensionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountSuspensionDetails]
  }
  
  extension [Self <: SchemaAccountSuspensionDetails](x: Self) {
    
    inline def setAbuseReason(value: String): Self = StObject.set(x, "abuseReason", value.asInstanceOf[js.Any])
    
    inline def setAbuseReasonNull: Self = StObject.set(x, "abuseReason", null)
    
    inline def setAbuseReasonUndefined: Self = StObject.set(x, "abuseReason", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameNull: Self = StObject.set(x, "productName", null)
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
  }
}
