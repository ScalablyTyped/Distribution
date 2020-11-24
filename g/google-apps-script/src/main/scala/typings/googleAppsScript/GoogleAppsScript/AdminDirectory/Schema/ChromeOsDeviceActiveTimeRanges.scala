package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromeOsDeviceActiveTimeRanges extends js.Object {
  
  var activeTime: js.UndefOr[Double] = js.native
  
  var date: js.UndefOr[String] = js.native
}
object ChromeOsDeviceActiveTimeRanges {
  
  @scala.inline
  def apply(): ChromeOsDeviceActiveTimeRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceActiveTimeRanges]
  }
  
  @scala.inline
  implicit class ChromeOsDeviceActiveTimeRangesOps[Self <: ChromeOsDeviceActiveTimeRanges] (val x: Self) extends AnyVal {
    
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
    def setActiveTime(value: Double): Self = this.set("activeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTime: Self = this.set("activeTime", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
  }
}
