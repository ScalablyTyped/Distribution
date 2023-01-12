package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLocks extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * Sets the time, in seconds, until the lock expires when there is no activity on the envelope.
    *
    * If no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.
    *
    * The lock duration can be extended.
    *
    */
  var lockDurationInSeconds: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier provided to the owner of the lock. You must use this token with subsequent calls to prove ownership of the lock.
    */
  var lockToken: js.UndefOr[String] = js.undefined
  
  /**
    * The type of lock.  Currently `edit` is the only supported type.
    */
  var lockType: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the friendly name of  the application that is locking the envelope.
    */
  var lockedByApp: js.UndefOr[String] = js.undefined
  
  /**
    * A complex type containing information about the user that has the envelope or template locked.
    */
  var lockedByUser: js.UndefOr[UserInfo] = js.undefined
  
  /**
    * The date and time that the lock expires.
    */
  var lockedUntilDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, a scratchpad is used to edit information.
    *
    */
  var useScratchPad: js.UndefOr[String] = js.undefined
}
object TemplateLocks {
  
  inline def apply(): TemplateLocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateLocks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateLocks] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setLockDurationInSeconds(value: String): Self = StObject.set(x, "lockDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setLockDurationInSecondsUndefined: Self = StObject.set(x, "lockDurationInSeconds", js.undefined)
    
    inline def setLockToken(value: String): Self = StObject.set(x, "lockToken", value.asInstanceOf[js.Any])
    
    inline def setLockTokenUndefined: Self = StObject.set(x, "lockToken", js.undefined)
    
    inline def setLockType(value: String): Self = StObject.set(x, "lockType", value.asInstanceOf[js.Any])
    
    inline def setLockTypeUndefined: Self = StObject.set(x, "lockType", js.undefined)
    
    inline def setLockedByApp(value: String): Self = StObject.set(x, "lockedByApp", value.asInstanceOf[js.Any])
    
    inline def setLockedByAppUndefined: Self = StObject.set(x, "lockedByApp", js.undefined)
    
    inline def setLockedByUser(value: UserInfo): Self = StObject.set(x, "lockedByUser", value.asInstanceOf[js.Any])
    
    inline def setLockedByUserUndefined: Self = StObject.set(x, "lockedByUser", js.undefined)
    
    inline def setLockedUntilDateTime(value: String): Self = StObject.set(x, "lockedUntilDateTime", value.asInstanceOf[js.Any])
    
    inline def setLockedUntilDateTimeUndefined: Self = StObject.set(x, "lockedUntilDateTime", js.undefined)
    
    inline def setUseScratchPad(value: String): Self = StObject.set(x, "useScratchPad", value.asInstanceOf[js.Any])
    
    inline def setUseScratchPadUndefined: Self = StObject.set(x, "useScratchPad", js.undefined)
  }
}
