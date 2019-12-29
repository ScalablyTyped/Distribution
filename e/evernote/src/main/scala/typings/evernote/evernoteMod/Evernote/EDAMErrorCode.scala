package typings.evernote.evernoteMod.Evernote

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDAMErrorCode with Double] = js.native
  /* 9 */ @js.native
  object AUTH_EXPIRED extends TopLevel[AUTH_EXPIRED with Double]
  
  /* 2 */ @js.native
  object BAD_DATA_FORMAT extends TopLevel[BAD_DATA_FORMAT with Double]
  
  /* 10 */ @js.native
  object DATA_CONFLICT extends TopLevel[DATA_CONFLICT with Double]
  
  /* 5 */ @js.native
  object DATA_REQUIRED extends TopLevel[DATA_REQUIRED with Double]
  
  /* 11 */ @js.native
  object ENML_VALIDATION extends TopLevel[ENML_VALIDATION with Double]
  
  /* 4 */ @js.native
  object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
  
  /* 8 */ @js.native
  object INVALID_AUTH extends TopLevel[INVALID_AUTH with Double]
  
  /* 14 */ @js.native
  object LEN_TOO_LONG extends TopLevel[LEN_TOO_LONG with Double]
  
  /* 13 */ @js.native
  object LEN_TOO_SHORT extends TopLevel[LEN_TOO_SHORT with Double]
  
  /* 6 */ @js.native
  object LIMIT_REACHED extends TopLevel[LIMIT_REACHED with Double]
  
  /* 3 */ @js.native
  object PERMISSION_DENIED extends TopLevel[PERMISSION_DENIED with Double]
  
  /* 7 */ @js.native
  object QUOTA_REACHED extends TopLevel[QUOTA_REACHED with Double]
  
  /* 19 */ @js.native
  object RATE_LIMIT_REACHED extends TopLevel[RATE_LIMIT_REACHED with Double]
  
  /* 12 */ @js.native
  object SHARD_UNAVAILABLE extends TopLevel[SHARD_UNAVAILABLE with Double]
  
  /* 18 */ @js.native
  object TAKEN_DOWN extends TopLevel[TAKEN_DOWN with Double]
  
  /* 15 */ @js.native
  object TOO_FEW extends TopLevel[TOO_FEW with Double]
  
  /* 16 */ @js.native
  object TOO_MANY extends TopLevel[TOO_MANY with Double]
  
  /* 1 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  /* 17 */ @js.native
  object UNSUPPORTED_OPERATION extends TopLevel[UNSUPPORTED_OPERATION with Double]
  
}

