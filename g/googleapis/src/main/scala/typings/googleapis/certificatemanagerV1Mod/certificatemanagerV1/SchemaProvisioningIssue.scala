package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProvisioningIssue extends StObject {
  
  /**
    * Output only. Human readable explanation about the issue. Provided to help address the configuration issues. Not guaranteed to be stable. For programmatic access use Reason enum.
    */
  var details: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Reason for provisioning failures.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaProvisioningIssue {
  
  inline def apply(): SchemaProvisioningIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvisioningIssue]
  }
  
  extension [Self <: SchemaProvisioningIssue](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
