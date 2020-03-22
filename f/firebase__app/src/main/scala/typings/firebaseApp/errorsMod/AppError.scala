package typings.firebaseApp.errorsMod

import typings.firebaseApp.firebaseAppStrings.`app-deleted`
import typings.firebaseApp.firebaseAppStrings.`bad-app-name`
import typings.firebaseApp.firebaseAppStrings.`duplicate-app`
import typings.firebaseApp.firebaseAppStrings.`invalid-app-argument`
import typings.firebaseApp.firebaseAppStrings.`invalid-log-argument`
import typings.firebaseApp.firebaseAppStrings.`no-app`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseApp.firebaseAppStrings.`no-app`
  - typings.firebaseApp.firebaseAppStrings.`bad-app-name`
  - typings.firebaseApp.firebaseAppStrings.`duplicate-app`
  - typings.firebaseApp.firebaseAppStrings.`app-deleted`
  - typings.firebaseApp.firebaseAppStrings.`invalid-app-argument`
  - typings.firebaseApp.firebaseAppStrings.`invalid-log-argument`
*/
trait AppError extends js.Object

object AppError {
  @scala.inline
  def APP_DELETED: `app-deleted` = this.cast("app-deleted")
  @scala.inline
  def BAD_APP_NAME: `bad-app-name` = this.cast("bad-app-name")
  @scala.inline
  def DUPLICATE_APP: `duplicate-app` = this.cast("duplicate-app")
  @scala.inline
  def INVALID_APP_ARGUMENT: `invalid-app-argument` = this.cast("invalid-app-argument")
  @scala.inline
  def INVALID_LOG_ARGUMENT: `invalid-log-argument` = this.cast("invalid-log-argument")
  @scala.inline
  def NO_APP: `no-app` = this.cast("no-app")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

