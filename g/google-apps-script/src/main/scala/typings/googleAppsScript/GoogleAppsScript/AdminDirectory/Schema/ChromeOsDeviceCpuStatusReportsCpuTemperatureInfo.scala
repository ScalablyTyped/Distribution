package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo extends js.Object {
  
  var label: js.UndefOr[String] = js.native
  
  var temperature: js.UndefOr[Double] = js.native
}
object ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo {
  
  @scala.inline
  def apply(): ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo]
  }
  
  @scala.inline
  implicit class ChromeOsDeviceCpuStatusReportsCpuTemperatureInfoOps[Self <: ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setTemperature(value: Double): Self = this.set("temperature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemperature: Self = this.set("temperature", js.undefined)
  }
}
