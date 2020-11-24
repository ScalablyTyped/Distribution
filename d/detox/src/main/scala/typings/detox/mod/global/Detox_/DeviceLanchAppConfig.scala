package typings.detox.mod.global.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceLanchAppConfig extends js.Object {
  
  /**
    * Launch into a fresh installation
    * A flag that enables relaunching into a fresh installation of the app (it will uninstall and install the binary again), default is false.
    */
  var delete: js.UndefOr[Boolean] = js.native
  
  /**
    * Launch config for specifying the native language and locale
    */
  var languageAndLocale: js.UndefOr[LanguageAndLocale] = js.native
  
  /**
    * Detox can start the app with additional launch arguments
    * The added launchArgs will be passed through the launch command to the device and be accessible via [[NSProcessInfo processInfo] arguments]
    */
  var launchArgs: js.UndefOr[js.Any] = js.native
  
  /**
    * Restart the app
    * Terminate the app and launch it again. If set to false, the simulator will try to bring app from background, if the app isn't running, it will launch a new instance. default is false
    */
  var newInstance: js.UndefOr[Boolean] = js.native
  
  /**
    * Set runtime permissions
    * Grant or deny runtime permissions for your application.
    */
  var permissions: js.UndefOr[DevicePermissions] = js.native
  
  /**
    * Launch from URL
    * Mock opening the app from URL to test your app's deep link handling mechanism.
    */
  var url: js.UndefOr[js.Any] = js.native
  
  /**
    * Launch with user activity
    */
  var userActivity: js.UndefOr[js.Any] = js.native
  
  /**
    * Launch with user notifications
    */
  var userNotification: js.UndefOr[js.Any] = js.native
}
object DeviceLanchAppConfig {
  
  @scala.inline
  def apply(): DeviceLanchAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceLanchAppConfig]
  }
  
  @scala.inline
  implicit class DeviceLanchAppConfigOps[Self <: DeviceLanchAppConfig] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: Boolean): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setLanguageAndLocale(value: LanguageAndLocale): Self = this.set("languageAndLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageAndLocale: Self = this.set("languageAndLocale", js.undefined)
    
    @scala.inline
    def setLaunchArgs(value: js.Any): Self = this.set("launchArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchArgs: Self = this.set("launchArgs", js.undefined)
    
    @scala.inline
    def setNewInstance(value: Boolean): Self = this.set("newInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewInstance: Self = this.set("newInstance", js.undefined)
    
    @scala.inline
    def setPermissions(value: DevicePermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUserActivity(value: js.Any): Self = this.set("userActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserActivity: Self = this.set("userActivity", js.undefined)
    
    @scala.inline
    def setUserNotification(value: js.Any): Self = this.set("userNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNotification: Self = this.set("userNotification", js.undefined)
  }
}
