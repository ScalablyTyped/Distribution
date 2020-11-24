package typings.evernote.mod.Errors

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDAMErrorCode extends js.Object
@JSImport("evernote", "Errors.EDAMErrorCode")
@js.native
object EDAMErrorCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDAMErrorCode with Double] = js.native
  
  @js.native
  sealed trait AUTH_EXPIRED extends EDAMErrorCode
  /* 9 */ @js.native
  object AUTH_EXPIRED extends TopLevel[AUTH_EXPIRED with Double]
  
  @js.native
  sealed trait BAD_DATA_FORMAT extends EDAMErrorCode
  /* 2 */ @js.native
  object BAD_DATA_FORMAT extends TopLevel[BAD_DATA_FORMAT with Double]
  
  @js.native
  sealed trait BUSINESS_SECURITY_LOGIN_REQUIRED extends EDAMErrorCode
  /* 20 */ @js.native
  object BUSINESS_SECURITY_LOGIN_REQUIRED extends TopLevel[BUSINESS_SECURITY_LOGIN_REQUIRED with Double]
  
  @js.native
  sealed trait DATA_CONFLICT extends EDAMErrorCode
  /* 10 */ @js.native
  object DATA_CONFLICT extends TopLevel[DATA_CONFLICT with Double]
  
  @js.native
  sealed trait DATA_REQUIRED extends EDAMErrorCode
  /* 5 */ @js.native
  object DATA_REQUIRED extends TopLevel[DATA_REQUIRED with Double]
  
  @js.native
  sealed trait DEVICE_LIMIT_REACHED extends EDAMErrorCode
  /* 21 */ @js.native
  object DEVICE_LIMIT_REACHED extends TopLevel[DEVICE_LIMIT_REACHED with Double]
  
  @js.native
  sealed trait ENML_VALIDATION extends EDAMErrorCode
  /* 11 */ @js.native
  object ENML_VALIDATION extends TopLevel[ENML_VALIDATION with Double]
  
  @js.native
  sealed trait INTERNAL_ERROR extends EDAMErrorCode
  /* 4 */ @js.native
  object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
  
  @js.native
  sealed trait INVALID_AUTH extends EDAMErrorCode
  /* 8 */ @js.native
  object INVALID_AUTH extends TopLevel[INVALID_AUTH with Double]
  
  @js.native
  sealed trait LEN_TOO_LONG extends EDAMErrorCode
  /* 14 */ @js.native
  object LEN_TOO_LONG extends TopLevel[LEN_TOO_LONG with Double]
  
  @js.native
  sealed trait LEN_TOO_SHORT extends EDAMErrorCode
  /* 13 */ @js.native
  object LEN_TOO_SHORT extends TopLevel[LEN_TOO_SHORT with Double]
  
  @js.native
  sealed trait LIMIT_REACHED extends EDAMErrorCode
  /* 6 */ @js.native
  object LIMIT_REACHED extends TopLevel[LIMIT_REACHED with Double]
  
  @js.native
  sealed trait PERMISSION_DENIED extends EDAMErrorCode
  /* 3 */ @js.native
  object PERMISSION_DENIED extends TopLevel[PERMISSION_DENIED with Double]
  
  @js.native
  sealed trait QUOTA_REACHED extends EDAMErrorCode
  /* 7 */ @js.native
  object QUOTA_REACHED extends TopLevel[QUOTA_REACHED with Double]
  
  @js.native
  sealed trait RATE_LIMIT_REACHED extends EDAMErrorCode
  /* 19 */ @js.native
  object RATE_LIMIT_REACHED extends TopLevel[RATE_LIMIT_REACHED with Double]
  
  @js.native
  sealed trait SHARD_UNAVAILABLE extends EDAMErrorCode
  /* 12 */ @js.native
  object SHARD_UNAVAILABLE extends TopLevel[SHARD_UNAVAILABLE with Double]
  
  @js.native
  sealed trait TAKEN_DOWN extends EDAMErrorCode
  /* 18 */ @js.native
  object TAKEN_DOWN extends TopLevel[TAKEN_DOWN with Double]
  
  @js.native
  sealed trait TOO_FEW extends EDAMErrorCode
  /* 15 */ @js.native
  object TOO_FEW extends TopLevel[TOO_FEW with Double]
  
  @js.native
  sealed trait TOO_MANY extends EDAMErrorCode
  /* 16 */ @js.native
  object TOO_MANY extends TopLevel[TOO_MANY with Double]
  
  @js.native
  sealed trait UNKNOWN extends EDAMErrorCode
  /* 1 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  @js.native
  sealed trait UNSUPPORTED_OPERATION extends EDAMErrorCode
  /* 17 */ @js.native
  object UNSUPPORTED_OPERATION extends TopLevel[UNSUPPORTED_OPERATION with Double]
}
