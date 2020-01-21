package typings.expressJwt

import typings.expressJwt.mod.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressJwtStrings {
  @js.native
  sealed trait UnauthorizedError extends js.Object
  
  @js.native
  sealed trait credentials_bad_format extends ErrorCode
  
  @js.native
  sealed trait credentials_bad_scheme extends ErrorCode
  
  @js.native
  sealed trait credentials_required extends ErrorCode
  
  @js.native
  sealed trait invalid_token extends ErrorCode
  
  @js.native
  sealed trait revoked_token extends ErrorCode
  
  @scala.inline
  def UnauthorizedError: UnauthorizedError = "UnauthorizedError".asInstanceOf[UnauthorizedError]
  @scala.inline
  def credentials_bad_format: credentials_bad_format = "credentials_bad_format".asInstanceOf[credentials_bad_format]
  @scala.inline
  def credentials_bad_scheme: credentials_bad_scheme = "credentials_bad_scheme".asInstanceOf[credentials_bad_scheme]
  @scala.inline
  def credentials_required: credentials_required = "credentials_required".asInstanceOf[credentials_required]
  @scala.inline
  def invalid_token: invalid_token = "invalid_token".asInstanceOf[invalid_token]
  @scala.inline
  def revoked_token: revoked_token = "revoked_token".asInstanceOf[revoked_token]
}

