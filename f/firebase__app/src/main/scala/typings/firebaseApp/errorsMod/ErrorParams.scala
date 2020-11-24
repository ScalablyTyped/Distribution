package typings.firebaseApp.errorsMod

import typings.firebaseApp.anon.AppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @firebase/app.@firebase/app/dist/packages/app/src/errors.AppError ]: {  appName :string}} */
@js.native
trait ErrorParams extends js.Object {
  
  var `app-deleted`: AppName = js.native
  
  var `bad-app-name`: AppName = js.native
  
  var `duplicate-app`: AppName = js.native
  
  var `invalid-app-argument`: AppName = js.native
  
  var `invalid-log-argument`: AppName = js.native
  
  var `no-app`: AppName = js.native
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
  
  @scala.inline
  implicit class ErrorParamsOps[Self <: ErrorParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setApp-deleted`(value: AppName): Self = this.set("app-deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBad-app-name`(value: AppName): Self = this.set("bad-app-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDuplicate-app`(value: AppName): Self = this.set("duplicate-app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInvalid-app-argument`(value: AppName): Self = this.set("invalid-app-argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInvalid-log-argument`(value: AppName): Self = this.set("invalid-log-argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNo-app`(value: AppName): Self = this.set("no-app", value.asInstanceOf[js.Any])
  }
}
