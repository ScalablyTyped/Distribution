package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenviewData extends js.Object {
  
  var appName: js.UndefOr[String] = js.native
  
  var mobileDeviceBranding: js.UndefOr[String] = js.native
  
  var mobileDeviceModel: js.UndefOr[String] = js.native
  
  var screenName: js.UndefOr[String] = js.native
}
object ScreenviewData {
  
  @scala.inline
  def apply(): ScreenviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenviewData]
  }
  
  @scala.inline
  implicit class ScreenviewDataOps[Self <: ScreenviewData] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    
    @scala.inline
    def setMobileDeviceBranding(value: String): Self = this.set("mobileDeviceBranding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileDeviceBranding: Self = this.set("mobileDeviceBranding", js.undefined)
    
    @scala.inline
    def setMobileDeviceModel(value: String): Self = this.set("mobileDeviceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileDeviceModel: Self = this.set("mobileDeviceModel", js.undefined)
    
    @scala.inline
    def setScreenName(value: String): Self = this.set("screenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenName: Self = this.set("screenName", js.undefined)
  }
}
