package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyguardDismissAuthAttemptEvent extends StObject {
  
  /**
    * Whether a strong form of authentication (password, PIN, or pattern) was used to unlock device.
    */
  var strongAuthMethodUsed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the unlock attempt was successful.
    */
  var success: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaKeyguardDismissAuthAttemptEvent {
  
  inline def apply(): SchemaKeyguardDismissAuthAttemptEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyguardDismissAuthAttemptEvent]
  }
  
  extension [Self <: SchemaKeyguardDismissAuthAttemptEvent](x: Self) {
    
    inline def setStrongAuthMethodUsed(value: Boolean): Self = StObject.set(x, "strongAuthMethodUsed", value.asInstanceOf[js.Any])
    
    inline def setStrongAuthMethodUsedNull: Self = StObject.set(x, "strongAuthMethodUsed", null)
    
    inline def setStrongAuthMethodUsedUndefined: Self = StObject.set(x, "strongAuthMethodUsed", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
