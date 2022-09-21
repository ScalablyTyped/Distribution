package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse extends StObject {
  
  /**
    * Number of ChromeOS devices have not synced policies in the past 28 days.
    */
  var noRecentPolicySyncCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of ChromeOS devices that have not seen any user activity in the past 28 days.
    */
  var noRecentUserActivityCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of devices whose OS version is not compliant.
    */
  var osVersionNotCompliantCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of devices that are pending an OS update.
    */
  var pendingUpdate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of devices that are unable to apply a policy due to an OS version mismatch.
    */
  var unsupportedPolicyCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse {
  
  inline def apply(): SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1CountChromeDevicesThatNeedAttentionResponse](x: Self) {
    
    inline def setNoRecentPolicySyncCount(value: String): Self = StObject.set(x, "noRecentPolicySyncCount", value.asInstanceOf[js.Any])
    
    inline def setNoRecentPolicySyncCountNull: Self = StObject.set(x, "noRecentPolicySyncCount", null)
    
    inline def setNoRecentPolicySyncCountUndefined: Self = StObject.set(x, "noRecentPolicySyncCount", js.undefined)
    
    inline def setNoRecentUserActivityCount(value: String): Self = StObject.set(x, "noRecentUserActivityCount", value.asInstanceOf[js.Any])
    
    inline def setNoRecentUserActivityCountNull: Self = StObject.set(x, "noRecentUserActivityCount", null)
    
    inline def setNoRecentUserActivityCountUndefined: Self = StObject.set(x, "noRecentUserActivityCount", js.undefined)
    
    inline def setOsVersionNotCompliantCount(value: String): Self = StObject.set(x, "osVersionNotCompliantCount", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNotCompliantCountNull: Self = StObject.set(x, "osVersionNotCompliantCount", null)
    
    inline def setOsVersionNotCompliantCountUndefined: Self = StObject.set(x, "osVersionNotCompliantCount", js.undefined)
    
    inline def setPendingUpdate(value: String): Self = StObject.set(x, "pendingUpdate", value.asInstanceOf[js.Any])
    
    inline def setPendingUpdateNull: Self = StObject.set(x, "pendingUpdate", null)
    
    inline def setPendingUpdateUndefined: Self = StObject.set(x, "pendingUpdate", js.undefined)
    
    inline def setUnsupportedPolicyCount(value: String): Self = StObject.set(x, "unsupportedPolicyCount", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedPolicyCountNull: Self = StObject.set(x, "unsupportedPolicyCount", null)
    
    inline def setUnsupportedPolicyCountUndefined: Self = StObject.set(x, "unsupportedPolicyCount", js.undefined)
  }
}
