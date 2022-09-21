package typings.evernote.mod

import typings.evernote.mod.Types.Contact
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Errors {
  
  @js.native
  sealed trait EDAMErrorCode extends StObject
  @JSImport("evernote", "Errors.EDAMErrorCode")
  @js.native
  object EDAMErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EDAMErrorCode & Double] = js.native
    
    @js.native
    sealed trait AUTH_EXPIRED
      extends StObject
         with EDAMErrorCode
    /* 9 */ val AUTH_EXPIRED: typings.evernote.mod.Errors.EDAMErrorCode.AUTH_EXPIRED & Double = js.native
    
    @js.native
    sealed trait BAD_DATA_FORMAT
      extends StObject
         with EDAMErrorCode
    /* 2 */ val BAD_DATA_FORMAT: typings.evernote.mod.Errors.EDAMErrorCode.BAD_DATA_FORMAT & Double = js.native
    
    @js.native
    sealed trait BUSINESS_SECURITY_LOGIN_REQUIRED
      extends StObject
         with EDAMErrorCode
    /* 20 */ val BUSINESS_SECURITY_LOGIN_REQUIRED: typings.evernote.mod.Errors.EDAMErrorCode.BUSINESS_SECURITY_LOGIN_REQUIRED & Double = js.native
    
    @js.native
    sealed trait DATA_CONFLICT
      extends StObject
         with EDAMErrorCode
    /* 10 */ val DATA_CONFLICT: typings.evernote.mod.Errors.EDAMErrorCode.DATA_CONFLICT & Double = js.native
    
    @js.native
    sealed trait DATA_REQUIRED
      extends StObject
         with EDAMErrorCode
    /* 5 */ val DATA_REQUIRED: typings.evernote.mod.Errors.EDAMErrorCode.DATA_REQUIRED & Double = js.native
    
    @js.native
    sealed trait DEVICE_LIMIT_REACHED
      extends StObject
         with EDAMErrorCode
    /* 21 */ val DEVICE_LIMIT_REACHED: typings.evernote.mod.Errors.EDAMErrorCode.DEVICE_LIMIT_REACHED & Double = js.native
    
    @js.native
    sealed trait ENML_VALIDATION
      extends StObject
         with EDAMErrorCode
    /* 11 */ val ENML_VALIDATION: typings.evernote.mod.Errors.EDAMErrorCode.ENML_VALIDATION & Double = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with EDAMErrorCode
    /* 4 */ val INTERNAL_ERROR: typings.evernote.mod.Errors.EDAMErrorCode.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_AUTH
      extends StObject
         with EDAMErrorCode
    /* 8 */ val INVALID_AUTH: typings.evernote.mod.Errors.EDAMErrorCode.INVALID_AUTH & Double = js.native
    
    @js.native
    sealed trait LEN_TOO_LONG
      extends StObject
         with EDAMErrorCode
    /* 14 */ val LEN_TOO_LONG: typings.evernote.mod.Errors.EDAMErrorCode.LEN_TOO_LONG & Double = js.native
    
    @js.native
    sealed trait LEN_TOO_SHORT
      extends StObject
         with EDAMErrorCode
    /* 13 */ val LEN_TOO_SHORT: typings.evernote.mod.Errors.EDAMErrorCode.LEN_TOO_SHORT & Double = js.native
    
    @js.native
    sealed trait LIMIT_REACHED
      extends StObject
         with EDAMErrorCode
    /* 6 */ val LIMIT_REACHED: typings.evernote.mod.Errors.EDAMErrorCode.LIMIT_REACHED & Double = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends StObject
         with EDAMErrorCode
    /* 3 */ val PERMISSION_DENIED: typings.evernote.mod.Errors.EDAMErrorCode.PERMISSION_DENIED & Double = js.native
    
    @js.native
    sealed trait QUOTA_REACHED
      extends StObject
         with EDAMErrorCode
    /* 7 */ val QUOTA_REACHED: typings.evernote.mod.Errors.EDAMErrorCode.QUOTA_REACHED & Double = js.native
    
    @js.native
    sealed trait RATE_LIMIT_REACHED
      extends StObject
         with EDAMErrorCode
    /* 19 */ val RATE_LIMIT_REACHED: typings.evernote.mod.Errors.EDAMErrorCode.RATE_LIMIT_REACHED & Double = js.native
    
    @js.native
    sealed trait SHARD_UNAVAILABLE
      extends StObject
         with EDAMErrorCode
    /* 12 */ val SHARD_UNAVAILABLE: typings.evernote.mod.Errors.EDAMErrorCode.SHARD_UNAVAILABLE & Double = js.native
    
    @js.native
    sealed trait TAKEN_DOWN
      extends StObject
         with EDAMErrorCode
    /* 18 */ val TAKEN_DOWN: typings.evernote.mod.Errors.EDAMErrorCode.TAKEN_DOWN & Double = js.native
    
    @js.native
    sealed trait TOO_FEW
      extends StObject
         with EDAMErrorCode
    /* 15 */ val TOO_FEW: typings.evernote.mod.Errors.EDAMErrorCode.TOO_FEW & Double = js.native
    
    @js.native
    sealed trait TOO_MANY
      extends StObject
         with EDAMErrorCode
    /* 16 */ val TOO_MANY: typings.evernote.mod.Errors.EDAMErrorCode.TOO_MANY & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with EDAMErrorCode
    /* 1 */ val UNKNOWN: typings.evernote.mod.Errors.EDAMErrorCode.UNKNOWN & Double = js.native
    
    @js.native
    sealed trait UNSUPPORTED_OPERATION
      extends StObject
         with EDAMErrorCode
    /* 17 */ val UNSUPPORTED_OPERATION: typings.evernote.mod.Errors.EDAMErrorCode.UNSUPPORTED_OPERATION & Double = js.native
  }
  
  @js.native
  sealed trait EDAMInvalidContactReason extends StObject
  @JSImport("evernote", "Errors.EDAMInvalidContactReason")
  @js.native
  object EDAMInvalidContactReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EDAMInvalidContactReason & Double] = js.native
    
    @js.native
    sealed trait BAD_ADDRESS
      extends StObject
         with EDAMInvalidContactReason
    /* 0 */ val BAD_ADDRESS: typings.evernote.mod.Errors.EDAMInvalidContactReason.BAD_ADDRESS & Double = js.native
    
    @js.native
    sealed trait DUPLICATE_CONTACT
      extends StObject
         with EDAMInvalidContactReason
    /* 1 */ val DUPLICATE_CONTACT: typings.evernote.mod.Errors.EDAMInvalidContactReason.DUPLICATE_CONTACT & Double = js.native
    
    @js.native
    sealed trait NO_CONNECTION
      extends StObject
         with EDAMInvalidContactReason
    /* 2 */ val NO_CONNECTION: typings.evernote.mod.Errors.EDAMInvalidContactReason.NO_CONNECTION & Double = js.native
  }
  
  @JSImport("evernote", "Errors.EDAMInvalidContactsException")
  @js.native
  open class EDAMInvalidContactsException ()
    extends StObject
       with Error {
    
    var contacts: js.Array[Contact] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var parameter: String = js.native
    
    var reasons: js.Array[EDAMInvalidContactReason] = js.native
  }
  
  @JSImport("evernote", "Errors.EDAMNotFoundException")
  @js.native
  open class EDAMNotFoundException ()
    extends StObject
       with Error {
    
    var identifier: String = js.native
    
    var key: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("evernote", "Errors.EDAMSystemException")
  @js.native
  open class EDAMSystemException ()
    extends StObject
       with Error {
    
    var errorCode: EDAMErrorCode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var rateLimitDuration: Double = js.native
  }
  
  @JSImport("evernote", "Errors.EDAMUserException")
  @js.native
  open class EDAMUserException ()
    extends StObject
       with Error {
    
    var errorCode: EDAMErrorCode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var parameter: String = js.native
  }
}
