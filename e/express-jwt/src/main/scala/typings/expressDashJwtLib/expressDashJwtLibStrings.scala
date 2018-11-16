package typings
package expressDashJwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressDashJwtLibStrings {
  @js.native
  sealed trait UnauthorizedError extends js.Object
  
  @js.native
  sealed trait credentials_bad_format extends js.Object
  
  @js.native
  sealed trait credentials_bad_scheme extends js.Object
  
  @js.native
  sealed trait credentials_required extends js.Object
  
  @js.native
  sealed trait invalid_token extends js.Object
  
  @js.native
  sealed trait revoked_token extends js.Object
  
  def UnauthorizedError: UnauthorizedError = "UnauthorizedError".asInstanceOf[UnauthorizedError]
  def credentials_bad_format: credentials_bad_format = "credentials_bad_format".asInstanceOf[credentials_bad_format]
  def credentials_bad_scheme: credentials_bad_scheme = "credentials_bad_scheme".asInstanceOf[credentials_bad_scheme]
  def credentials_required: credentials_required = "credentials_required".asInstanceOf[credentials_required]
  def invalid_token: invalid_token = "invalid_token".asInstanceOf[invalid_token]
  def revoked_token: revoked_token = "revoked_token".asInstanceOf[revoked_token]
}

