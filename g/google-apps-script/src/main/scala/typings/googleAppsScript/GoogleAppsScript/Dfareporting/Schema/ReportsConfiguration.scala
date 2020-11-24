package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsConfiguration extends js.Object {
  
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.native
  
  var reportGenerationTimeZoneId: js.UndefOr[String] = js.native
}
object ReportsConfiguration {
  
  @scala.inline
  def apply(): ReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportsConfiguration]
  }
  
  @scala.inline
  implicit class ReportsConfigurationOps[Self <: ReportsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setExposureToConversionEnabled(value: Boolean): Self = this.set("exposureToConversionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposureToConversionEnabled: Self = this.set("exposureToConversionEnabled", js.undefined)
    
    @scala.inline
    def setLookbackConfiguration(value: LookbackConfiguration): Self = this.set("lookbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookbackConfiguration: Self = this.set("lookbackConfiguration", js.undefined)
    
    @scala.inline
    def setReportGenerationTimeZoneId(value: String): Self = this.set("reportGenerationTimeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportGenerationTimeZoneId: Self = this.set("reportGenerationTimeZoneId", js.undefined)
  }
}
