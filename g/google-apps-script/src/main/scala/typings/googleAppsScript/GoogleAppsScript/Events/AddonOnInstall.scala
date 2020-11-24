package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddonOnInstall extends js.Object {
  
  var authMode: AuthMode = js.native
}
object AddonOnInstall {
  
  @scala.inline
  def apply(authMode: AuthMode): AddonOnInstall = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonOnInstall]
  }
  
  @scala.inline
  implicit class AddonOnInstallOps[Self <: AddonOnInstall] (val x: Self) extends AnyVal {
    
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
    def setAuthMode(value: AuthMode): Self = this.set("authMode", value.asInstanceOf[js.Any])
  }
}
