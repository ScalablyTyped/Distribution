package typings.expressJwt

import typings.expressJwt.mod.ErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressJwtStrings {
  
  @js.native
  sealed trait UnauthorizedError extends StObject
  @scala.inline
  def UnauthorizedError: UnauthorizedError = "UnauthorizedError".asInstanceOf[UnauthorizedError]
  
  @js.native
  sealed trait credentials_bad_format extends ErrorCode
  @scala.inline
  def credentials_bad_format: credentials_bad_format = "credentials_bad_format".asInstanceOf[credentials_bad_format]
  
  @js.native
  sealed trait credentials_bad_scheme extends ErrorCode
  @scala.inline
  def credentials_bad_scheme: credentials_bad_scheme = "credentials_bad_scheme".asInstanceOf[credentials_bad_scheme]
  
  @js.native
  sealed trait credentials_required extends ErrorCode
  @scala.inline
  def credentials_required: credentials_required = "credentials_required".asInstanceOf[credentials_required]
  
  @js.native
  sealed trait invalid_token extends ErrorCode
  @scala.inline
  def invalid_token: invalid_token = "invalid_token".asInstanceOf[invalid_token]
  
  @js.native
  sealed trait revoked_token extends ErrorCode
  @scala.inline
  def revoked_token: revoked_token = "revoked_token".asInstanceOf[revoked_token]
}
