package typings.expressDashJwt.expressDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressDashJwt.expressDashJwtStrings.revoked_token
  - typings.expressDashJwt.expressDashJwtStrings.invalid_token
  - typings.expressDashJwt.expressDashJwtStrings.credentials_bad_scheme
  - typings.expressDashJwt.expressDashJwtStrings.credentials_bad_format
  - typings.expressDashJwt.expressDashJwtStrings.credentials_required
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credentials_bad_format: typings.expressDashJwt.expressDashJwtStrings.credentials_bad_format = this.cast("credentials_bad_format")
  @scala.inline
  def credentials_bad_scheme: typings.expressDashJwt.expressDashJwtStrings.credentials_bad_scheme = this.cast("credentials_bad_scheme")
  @scala.inline
  def credentials_required: typings.expressDashJwt.expressDashJwtStrings.credentials_required = this.cast("credentials_required")
  @scala.inline
  def invalid_token: typings.expressDashJwt.expressDashJwtStrings.invalid_token = this.cast("invalid_token")
  @scala.inline
  def revoked_token: typings.expressDashJwt.expressDashJwtStrings.revoked_token = this.cast("revoked_token")
}

