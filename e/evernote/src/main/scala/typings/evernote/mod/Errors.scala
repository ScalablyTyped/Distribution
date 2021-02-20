package typings.evernote.mod

import typings.evernote.mod.Types.Contact
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Errors {
  
  @js.native
  sealed trait EDAMErrorCode extends StObject
  @JSImport("evernote", "Errors.EDAMErrorCode")
  @js.native
  object EDAMErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EDAMErrorCode with Double] = js.native
    
    @js.native
    sealed trait AUTH_EXPIRED extends EDAMErrorCode
    /* 9 */ val AUTH_EXPIRED: typings.evernote.mod.Errors.EDAMErrorCode.AUTH_EXPIRED with Double = js.native
    
    @js.native
    sealed trait BAD_DATA_FORMAT extends EDAMErrorCode
    /* 2 */ val BAD_DATA_FORMAT: typings.evernote.mod.Errors.EDAMErrorCode.BAD_DATA_FORMAT with Double = js.native
    
    @js.native
    sealed trait BUSINESS_SECURITY_LOGIN_REQUIRED extends EDAMErrorCode
    /* 20 */ val BUSINESS_SECURITY_LOGIN_REQUIRED: typings.evernote.mod.Errors.EDAMErrorCode.BUSINESS_SECURITY_LOGIN_REQUIRED with Double = js.native
    
    @js.native
    sealed trait DATA_CONFLICT extends EDAMErrorCode
    /* 10 */ val DATA_CONFLICT: typings.evernote.mod.Errors.EDAMErrorCode.DATA_CONFLICT with Double = js.native
    
    @js.native
    sealed trait DATA_REQUIRED extends EDAMErrorCode
    /* 5 */ val DATA_REQUIRED: typings.evernote.mod.Errors.EDAMErrorCode.DATA_REQUIRED with Double = js.native
    
    @js.native
    sealed trait DEVICE_LIMIT_REACHED extends EDAMErrorCode
    /* 21 */ val DEVICE_LIMIT_REACHED: typings.evernote.mod.Errors.EDAMErrorCode.DEVICE_LIMIT_REACHED with Double = js.native
    
    @js.native
    sealed trait ENML_VALIDATION extends EDAMErrorCode
    /* 11 */ val ENML_VALIDATION: typings.evernote.mod.Errors.EDAMErrorCode.ENML_VALIDATION with Double = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR extends EDAMErrorCode
    /* 4 */ val INTERNAL_ERROR: typings.evernote.mod.Errors.EDAMErrorCode.INTERNAL_ERROR with Double = js.native
    
    @js.native
    sealed trait INVALID_AUTH extends EDAMErrorCode
    /* 8 */ val INVALID_AUTH: typings.evernote.mod.Errors.EDAMErrorCode.INVALID_AUTH with Double = js.native
    
    @js.native
    sealed trait LEN_TOO_LONG extends EDAMErrorCode
    /* 14 */ val LEN_TOO_LONG: typings.evernote.mod.Errors.EDAMErrorCode.LEN_TOO_LONG with Double = js.native
    
    @js.native
    sealed trait LEN_TOO_SHORT extends EDAMErrorCode
    /* 13 */ val LEN_TOO_SHORT: typings.evernote.mod.Errors.EDAMErrorCode.LEN_TOO_SHORT with Double = js.native
    
    @js.native
    sealed trait LIMIT_REACHED extends EDAMErrorCode
    /* 6 */ val LIMIT_REACHED: typings.evernote.mod.Errors.EDAMErrorCode.LIMIT_REACHED with Double = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED extends EDAMErrorCode
    /* 3 */ val PERMISSION_DENIED: typings.evernote.mod.Errors.EDAMErrorCode.PERMISSION_DENIED with Double = js.native
    
    @js.native
    sealed trait QUOTA_REACHED extends EDAMErrorCode
    /* 7 */ val QUOTA_REACHED: typings.evernote.mod.Errors.EDAMErrorCode.QUOTA_REACHED with Double = js.native
    
    @js.native
    sealed trait RATE_LIMIT_REACHED extends EDAMErrorCode
    /* 19 */ val RATE_LIMIT_REACHED: typings.evernote.mod.Errors.EDAMErrorCode.RATE_LIMIT_REACHED with Double = js.native
    
    @js.native
    sealed trait SHARD_UNAVAILABLE extends EDAMErrorCode
    /* 12 */ val SHARD_UNAVAILABLE: typings.evernote.mod.Errors.EDAMErrorCode.SHARD_UNAVAILABLE with Double = js.native
    
    @js.native
    sealed trait TAKEN_DOWN extends EDAMErrorCode
    /* 18 */ val TAKEN_DOWN: typings.evernote.mod.Errors.EDAMErrorCode.TAKEN_DOWN with Double = js.native
    
    @js.native
    sealed trait TOO_FEW extends EDAMErrorCode
    /* 15 */ val TOO_FEW: typings.evernote.mod.Errors.EDAMErrorCode.TOO_FEW with Double = js.native
    
    @js.native
    sealed trait TOO_MANY extends EDAMErrorCode
    /* 16 */ val TOO_MANY: typings.evernote.mod.Errors.EDAMErrorCode.TOO_MANY with Double = js.native
    
    @js.native
    sealed trait UNKNOWN extends EDAMErrorCode
    /* 1 */ val UNKNOWN: typings.evernote.mod.Errors.EDAMErrorCode.UNKNOWN with Double = js.native
    
    @js.native
    sealed trait UNSUPPORTED_OPERATION extends EDAMErrorCode
    /* 17 */ val UNSUPPORTED_OPERATION: typings.evernote.mod.Errors.EDAMErrorCode.UNSUPPORTED_OPERATION with Double = js.native
  }
  
  @js.native
  sealed trait EDAMInvalidContactReason extends StObject
  @JSImport("evernote", "Errors.EDAMInvalidContactReason")
  @js.native
  object EDAMInvalidContactReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EDAMInvalidContactReason with Double] = js.native
    
    @js.native
    sealed trait BAD_ADDRESS extends EDAMInvalidContactReason
    /* 0 */ val BAD_ADDRESS: typings.evernote.mod.Errors.EDAMInvalidContactReason.BAD_ADDRESS with Double = js.native
    
    @js.native
    sealed trait DUPLICATE_CONTACT extends EDAMInvalidContactReason
    /* 1 */ val DUPLICATE_CONTACT: typings.evernote.mod.Errors.EDAMInvalidContactReason.DUPLICATE_CONTACT with Double = js.native
    
    @js.native
    sealed trait NO_CONNECTION extends EDAMInvalidContactReason
    /* 2 */ val NO_CONNECTION: typings.evernote.mod.Errors.EDAMInvalidContactReason.NO_CONNECTION with Double = js.native
  }
  
  @JSImport("evernote", "Errors.EDAMInvalidContactsException")
  @js.native
  class EDAMInvalidContactsException () extends Error {
    
    var contacts: js.Array[Contact] = js.native
    
    var parameter: String = js.native
    
    var reasons: js.Array[EDAMInvalidContactReason] = js.native
  }
  
  @JSImport("evernote", "Errors.EDAMNotFoundException")
  @js.native
  class EDAMNotFoundException () extends Error {
    
    var identifier: String = js.native
    
    var key: String = js.native
  }
  
  @JSImport("evernote", "Errors.EDAMSystemException")
  @js.native
  class EDAMSystemException () extends Error {
    
    var errorCode: EDAMErrorCode = js.native
    
    var rateLimitDuration: Double = js.native
  }
  
  @JSImport("evernote", "Errors.EDAMUserException")
  @js.native
  class EDAMUserException () extends Error {
    
    var errorCode: EDAMErrorCode = js.native
    
    var parameter: String = js.native
  }
}
