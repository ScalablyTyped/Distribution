package typings.expressJwt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressJwt.expressJwtStrings.revoked_token
  - typings.expressJwt.expressJwtStrings.invalid_token
  - typings.expressJwt.expressJwtStrings.credentials_bad_scheme
  - typings.expressJwt.expressJwtStrings.credentials_bad_format
  - typings.expressJwt.expressJwtStrings.credentials_required
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def credentials_bad_format: typings.expressJwt.expressJwtStrings.credentials_bad_format = "credentials_bad_format".asInstanceOf[typings.expressJwt.expressJwtStrings.credentials_bad_format]
  @scala.inline
  def credentials_bad_scheme: typings.expressJwt.expressJwtStrings.credentials_bad_scheme = "credentials_bad_scheme".asInstanceOf[typings.expressJwt.expressJwtStrings.credentials_bad_scheme]
  @scala.inline
  def credentials_required: typings.expressJwt.expressJwtStrings.credentials_required = "credentials_required".asInstanceOf[typings.expressJwt.expressJwtStrings.credentials_required]
  @scala.inline
  def invalid_token: typings.expressJwt.expressJwtStrings.invalid_token = "invalid_token".asInstanceOf[typings.expressJwt.expressJwtStrings.invalid_token]
  @scala.inline
  def revoked_token: typings.expressJwt.expressJwtStrings.revoked_token = "revoked_token".asInstanceOf[typings.expressJwt.expressJwtStrings.revoked_token]
}

