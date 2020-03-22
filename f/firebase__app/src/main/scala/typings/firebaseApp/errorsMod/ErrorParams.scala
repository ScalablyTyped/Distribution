package typings.firebaseApp.errorsMod

import typings.firebaseApp.AnonAppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in @firebase/app.@firebase/app/dist/packages/app/src/errors.AppError ]: {  appName  :string}} */
trait ErrorParams extends js.Object {
  var `app-deleted`: AnonAppName
  var `bad-app-name`: AnonAppName
  var `duplicate-app`: AnonAppName
  var `invalid-app-argument`: AnonAppName
  var `invalid-log-argument`: AnonAppName
  var `no-app`: AnonAppName
}

object ErrorParams {
  @scala.inline
  def apply(
    `app-deleted`: AnonAppName,
    `bad-app-name`: AnonAppName,
    `duplicate-app`: AnonAppName,
    `invalid-app-argument`: AnonAppName,
    `invalid-log-argument`: AnonAppName,
    `no-app`: AnonAppName
  ): ErrorParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app-deleted")(`app-deleted`.asInstanceOf[js.Any])
    __obj.updateDynamic("bad-app-name")(`bad-app-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("duplicate-app")(`duplicate-app`.asInstanceOf[js.Any])
    __obj.updateDynamic("invalid-app-argument")(`invalid-app-argument`.asInstanceOf[js.Any])
    __obj.updateDynamic("invalid-log-argument")(`invalid-log-argument`.asInstanceOf[js.Any])
    __obj.updateDynamic("no-app")(`no-app`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorParams]
  }
}

