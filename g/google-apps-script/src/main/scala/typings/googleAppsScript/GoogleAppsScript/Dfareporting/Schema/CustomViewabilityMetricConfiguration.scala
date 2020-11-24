package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomViewabilityMetricConfiguration extends js.Object {
  
  var audible: js.UndefOr[Boolean] = js.native
  
  var timeMillis: js.UndefOr[Double] = js.native
  
  var timePercent: js.UndefOr[Double] = js.native
  
  var viewabilityPercent: js.UndefOr[Double] = js.native
}
object CustomViewabilityMetricConfiguration {
  
  @scala.inline
  def apply(): CustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomViewabilityMetricConfiguration]
  }
  
  @scala.inline
  implicit class CustomViewabilityMetricConfigurationOps[Self <: CustomViewabilityMetricConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAudible(value: Boolean): Self = this.set("audible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudible: Self = this.set("audible", js.undefined)
    
    @scala.inline
    def setTimeMillis(value: Double): Self = this.set("timeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeMillis: Self = this.set("timeMillis", js.undefined)
    
    @scala.inline
    def setTimePercent(value: Double): Self = this.set("timePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePercent: Self = this.set("timePercent", js.undefined)
    
    @scala.inline
    def setViewabilityPercent(value: Double): Self = this.set("viewabilityPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewabilityPercent: Self = this.set("viewabilityPercent", js.undefined)
  }
}
