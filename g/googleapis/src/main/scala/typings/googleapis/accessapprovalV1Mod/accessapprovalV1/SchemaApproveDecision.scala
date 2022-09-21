package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApproveDecision extends StObject {
  
  /**
    * The time at which approval was granted.
    */
  var approveTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True when the request has been auto-approved.
    */
  var autoApproved: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The time at which the approval expires.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, denotes the timestamp at which the approval is invalidated.
    */
  var invalidateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The signature for the ApprovalRequest and details on how it was signed.
    */
  var signatureInfo: js.UndefOr[SchemaSignatureInfo] = js.undefined
}
object SchemaApproveDecision {
  
  inline def apply(): SchemaApproveDecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproveDecision]
  }
  
  extension [Self <: SchemaApproveDecision](x: Self) {
    
    inline def setApproveTime(value: String): Self = StObject.set(x, "approveTime", value.asInstanceOf[js.Any])
    
    inline def setApproveTimeNull: Self = StObject.set(x, "approveTime", null)
    
    inline def setApproveTimeUndefined: Self = StObject.set(x, "approveTime", js.undefined)
    
    inline def setAutoApproved(value: Boolean): Self = StObject.set(x, "autoApproved", value.asInstanceOf[js.Any])
    
    inline def setAutoApprovedNull: Self = StObject.set(x, "autoApproved", null)
    
    inline def setAutoApprovedUndefined: Self = StObject.set(x, "autoApproved", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setInvalidateTime(value: String): Self = StObject.set(x, "invalidateTime", value.asInstanceOf[js.Any])
    
    inline def setInvalidateTimeNull: Self = StObject.set(x, "invalidateTime", null)
    
    inline def setInvalidateTimeUndefined: Self = StObject.set(x, "invalidateTime", js.undefined)
    
    inline def setSignatureInfo(value: SchemaSignatureInfo): Self = StObject.set(x, "signatureInfo", value.asInstanceOf[js.Any])
    
    inline def setSignatureInfoUndefined: Self = StObject.set(x, "signatureInfo", js.undefined)
  }
}
