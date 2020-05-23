package typings.firebaseApp.errorsMod

import typings.firebaseApp.anon.AppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in @firebase/app.@firebase/app/dist/packages/app/src/errors.AppError ]: {  appName  :string}} */
trait ErrorParams extends js.Object {
  var `app-deleted`: AppName
  var `bad-app-name`: AppName
  var `duplicate-app`: AppName
  var `invalid-app-argument`: AppName
  var `invalid-log-argument`: AppName
  var `no-app`: AppName
}

object ErrorParams {
  @scala.inline
  def apply(
    `app-deleted`: AppName,
    `bad-app-name`: AppName,
    `duplicate-app`: AppName,
    `invalid-app-argument`: AppName,
    `invalid-log-argument`: AppName,
    `no-app`: AppName
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

