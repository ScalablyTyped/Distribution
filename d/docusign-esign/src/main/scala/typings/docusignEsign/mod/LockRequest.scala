package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockRequest extends StObject {
  
  /**
    * The number of seconds to lock the envelope for editing.  This value must be greater than `0` seconds.
    */
  var lockDurationInSeconds: js.UndefOr[String] = js.undefined
  
  /**
    * The type of lock.  Currently `edit` is the only supported type.
    */
  var lockType: js.UndefOr[String] = js.undefined
  
  /**
    * The human-readable name of the application that is locking the envelope or template. This value displays to the user in error messages when lock conflicts occur.
    */
  var lockedByApp: js.UndefOr[String] = js.undefined
  
  /**
    * The [password for the template](https://support.docusign.com/en/guides/ndse-user-guide-template-passwords). If you are using a lock for a template that
    * has a password or an envelope that is based on a template that has a password, you must enter the `templatePassword` to save the changes.
    */
  var templatePassword: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, a scratchpad is used to edit information.
    *
    */
  var useScratchPad: js.UndefOr[String] = js.undefined
}
object LockRequest {
  
  inline def apply(): LockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockRequest]
  }
  
  extension [Self <: LockRequest](x: Self) {
    
    inline def setLockDurationInSeconds(value: String): Self = StObject.set(x, "lockDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setLockDurationInSecondsUndefined: Self = StObject.set(x, "lockDurationInSeconds", js.undefined)
    
    inline def setLockType(value: String): Self = StObject.set(x, "lockType", value.asInstanceOf[js.Any])
    
    inline def setLockTypeUndefined: Self = StObject.set(x, "lockType", js.undefined)
    
    inline def setLockedByApp(value: String): Self = StObject.set(x, "lockedByApp", value.asInstanceOf[js.Any])
    
    inline def setLockedByAppUndefined: Self = StObject.set(x, "lockedByApp", js.undefined)
    
    inline def setTemplatePassword(value: String): Self = StObject.set(x, "templatePassword", value.asInstanceOf[js.Any])
    
    inline def setTemplatePasswordUndefined: Self = StObject.set(x, "templatePassword", js.undefined)
    
    inline def setUseScratchPad(value: String): Self = StObject.set(x, "useScratchPad", value.asInstanceOf[js.Any])
    
    inline def setUseScratchPadUndefined: Self = StObject.set(x, "useScratchPad", js.undefined)
  }
}
