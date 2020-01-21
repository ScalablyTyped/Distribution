package typings.firebaseInstallations.errorsMod

import typings.firebaseInstallations.firebaseInstallationsStrings.`app-offline`
import typings.firebaseInstallations.firebaseInstallationsStrings.`delete-pending-registration`
import typings.firebaseInstallations.firebaseInstallationsStrings.`installation-not-found`
import typings.firebaseInstallations.firebaseInstallationsStrings.`missing-app-config-values`
import typings.firebaseInstallations.firebaseInstallationsStrings.`not-registered`
import typings.firebaseInstallations.firebaseInstallationsStrings.`request-failed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseInstallations.firebaseInstallationsStrings.`missing-app-config-values`
  - typings.firebaseInstallations.firebaseInstallationsStrings.`not-registered`
  - typings.firebaseInstallations.firebaseInstallationsStrings.`installation-not-found`
  - typings.firebaseInstallations.firebaseInstallationsStrings.`request-failed`
  - typings.firebaseInstallations.firebaseInstallationsStrings.`app-offline`
  - typings.firebaseInstallations.firebaseInstallationsStrings.`delete-pending-registration`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def APP_OFFLINE: `app-offline` = this.cast("app-offline")
  @scala.inline
  def DELETE_PENDING_REGISTRATION: `delete-pending-registration` = this.cast("delete-pending-registration")
  @scala.inline
  def INSTALLATION_NOT_FOUND: `installation-not-found` = this.cast("installation-not-found")
  @scala.inline
  def MISSING_APP_CONFIG_VALUES: `missing-app-config-values` = this.cast("missing-app-config-values")
  @scala.inline
  def NOT_REGISTERED: `not-registered` = this.cast("not-registered")
  @scala.inline
  def REQUEST_FAILED: `request-failed` = this.cast("request-failed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

