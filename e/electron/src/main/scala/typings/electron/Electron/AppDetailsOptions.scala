package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppDetailsOptions extends js.Object {
  
  /**
    * Index of the icon in `appIconPath`. Ignored when `appIconPath` is not set.
    * Default is `0`.
    */
  var appIconIndex: js.UndefOr[Double] = js.native
  
  /**
    * Window's Relaunch Icon.
    */
  var appIconPath: js.UndefOr[String] = js.native
  
  /**
    * Window's App User Model ID. It has to be set, otherwise the other options will
    * have no effect.
    */
  var appId: js.UndefOr[String] = js.native
  
  /**
    * Window's Relaunch Command.
    */
  var relaunchCommand: js.UndefOr[String] = js.native
  
  /**
    * Window's Relaunch Display Name.
    */
  var relaunchDisplayName: js.UndefOr[String] = js.native
}
object AppDetailsOptions {
  
  @scala.inline
  def apply(): AppDetailsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDetailsOptions]
  }
  
  @scala.inline
  implicit class AppDetailsOptionsOps[Self <: AppDetailsOptions] (val x: Self) extends AnyVal {
    
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
    def setAppIconIndex(value: Double): Self = this.set("appIconIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppIconIndex: Self = this.set("appIconIndex", js.undefined)
    
    @scala.inline
    def setAppIconPath(value: String): Self = this.set("appIconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppIconPath: Self = this.set("appIconPath", js.undefined)
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setRelaunchCommand(value: String): Self = this.set("relaunchCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelaunchCommand: Self = this.set("relaunchCommand", js.undefined)
    
    @scala.inline
    def setRelaunchDisplayName(value: String): Self = this.set("relaunchDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelaunchDisplayName: Self = this.set("relaunchDisplayName", js.undefined)
  }
}
