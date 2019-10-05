package typings.evernote.evernoteMod.Evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDAMErrorCode extends js.Object

/**
  * Numeric codes indicating the type of error that occurred on the
  * service.
  * <dl>
  *     <dt>UNKNOWN</dt>
  *         <dd>No information available about the error</dd>
  *     <dt>BAD_DATA_FORMAT</dt>
  *         <dd>The format of the request data was incorrect</dd>
  *     <dt>PERMISSION_DENIED</dt>
  *         <dd>Not permitted to perform action</dd>
  *     <dt>INTERNAL_ERROR</dt>
  *         <dd>Unexpected problem with the service</dd>
  *     <dt>DATA_REQUIRED</dt>
  *         <dd>A required parameter/field was absent</dd>
  *     <dt>LIMIT_REACHED</dt>
  *         <dd>Operation denied due to data model limit</dd>
  *     <dt>QUOTA_REACHED</dt>
  *         <dd>Operation denied due to user storage limit</dd>
  *     <dt>INVALID_AUTH</dt>
  *         <dd>Username and/or password incorrect</dd>
  *     <dt>AUTH_EXPIRED</dt>
  *         <dd>Authentication token expired</dd>
  *     <dt>DATA_CONFLICT</dt>
  *         <dd>Change denied due to data model conflict</dd>
  *     <dt>ENML_VALIDATION</dt>
  *         <dd>Content of submitted note was malformed</dd>
  *     <dt>SHARD_UNAVAILABLE</dt>
  *         <dd>Service shard with account data is temporarily down</dd>
  *     <dt>LEN_TOO_SHORT</dt>
  *         <dd>Operation denied due to data model limit, where something such
  *                 as a string length was too short</dd>
  *     <dt>LEN_TOO_LONG</dt>
  *         <dd>Operation denied due to data model limit, where something such
  *                 as a string length was too long</dd>
  *     <dt>TOO_FEW</dt>
  *         <dd>Operation denied due to data model limit, where there were
  *                 too few of something.</dd>
  *     <dt>TOO_MANY</dt>
  *         <dd>Operation denied due to data model limit, where there were
  *                 too many of something.</dd>
  *     <dt>UNSUPPORTED_OPERATION</dt>
  *         <dd>Operation denied because it is currently unsupported.</dd>
  *     <dt>TAKEN_DOWN</dt>
  *         <dd>Operation denied because access to the corresponding object is
  *                 prohibited in response to a take-down notice.</dd>
  *     <dt>RATE_LIMIT_REACHED</dt>
  *         <dd>Operation denied because the calling application has reached
  *                 its hourly API call limit for this user.</dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.EDAMErrorCode")
@js.native
object EDAMErrorCode extends js.Object {
  @js.native
  sealed trait AUTH_EXPIRED extends EDAMErrorCode
  
  @js.native
  sealed trait BAD_DATA_FORMAT extends EDAMErrorCode
  
  @js.native
  sealed trait DATA_CONFLICT extends EDAMErrorCode
  
  @js.native
  sealed trait DATA_REQUIRED extends EDAMErrorCode
  
  @js.native
  sealed trait ENML_VALIDATION extends EDAMErrorCode
  
  @js.native
  sealed trait INTERNAL_ERROR extends EDAMErrorCode
  
  @js.native
  sealed trait INVALID_AUTH extends EDAMErrorCode
  
  @js.native
  sealed trait LEN_TOO_LONG extends EDAMErrorCode
  
  @js.native
  sealed trait LEN_TOO_SHORT extends EDAMErrorCode
  
  @js.native
  sealed trait LIMIT_REACHED extends EDAMErrorCode
  
  @js.native
  sealed trait PERMISSION_DENIED extends EDAMErrorCode
  
  @js.native
  sealed trait QUOTA_REACHED extends EDAMErrorCode
  
  @js.native
  sealed trait RATE_LIMIT_REACHED extends EDAMErrorCode
  
  @js.native
  sealed trait SHARD_UNAVAILABLE extends EDAMErrorCode
  
  @js.native
  sealed trait TAKEN_DOWN extends EDAMErrorCode
  
  @js.native
  sealed trait TOO_FEW extends EDAMErrorCode
  
  @js.native
  sealed trait TOO_MANY extends EDAMErrorCode
  
  @js.native
  sealed trait UNKNOWN extends EDAMErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_OPERATION extends EDAMErrorCode
  
  /* 9 */ val AUTH_EXPIRED: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.AUTH_EXPIRED with Double = js.native
  /* 2 */ val BAD_DATA_FORMAT: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.BAD_DATA_FORMAT with Double = js.native
  /* 10 */ val DATA_CONFLICT: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.DATA_CONFLICT with Double = js.native
  /* 5 */ val DATA_REQUIRED: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.DATA_REQUIRED with Double = js.native
  /* 11 */ val ENML_VALIDATION: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.ENML_VALIDATION with Double = js.native
  /* 4 */ val INTERNAL_ERROR: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.INTERNAL_ERROR with Double = js.native
  /* 8 */ val INVALID_AUTH: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.INVALID_AUTH with Double = js.native
  /* 14 */ val LEN_TOO_LONG: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.LEN_TOO_LONG with Double = js.native
  /* 13 */ val LEN_TOO_SHORT: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.LEN_TOO_SHORT with Double = js.native
  /* 6 */ val LIMIT_REACHED: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.LIMIT_REACHED with Double = js.native
  /* 3 */ val PERMISSION_DENIED: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.PERMISSION_DENIED with Double = js.native
  /* 7 */ val QUOTA_REACHED: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.QUOTA_REACHED with Double = js.native
  /* 19 */ val RATE_LIMIT_REACHED: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.RATE_LIMIT_REACHED with Double = js.native
  /* 12 */ val SHARD_UNAVAILABLE: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.SHARD_UNAVAILABLE with Double = js.native
  /* 18 */ val TAKEN_DOWN: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.TAKEN_DOWN with Double = js.native
  /* 15 */ val TOO_FEW: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.TOO_FEW with Double = js.native
  /* 16 */ val TOO_MANY: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.TOO_MANY with Double = js.native
  /* 1 */ val UNKNOWN: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.UNKNOWN with Double = js.native
  /* 17 */ val UNSUPPORTED_OPERATION: typings.evernote.evernoteMod.Evernote.EDAMErrorCode.UNSUPPORTED_OPERATION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDAMErrorCode with Double] = js.native
}

