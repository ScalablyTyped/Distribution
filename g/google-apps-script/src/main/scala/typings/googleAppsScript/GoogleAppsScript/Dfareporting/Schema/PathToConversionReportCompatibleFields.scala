package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathToConversionReportCompatibleFields extends js.Object {
  
  var conversionDimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  var customFloodlightVariables: js.UndefOr[js.Array[Dimension]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  var perInteractionDimensions: js.UndefOr[js.Array[Dimension]] = js.native
}
object PathToConversionReportCompatibleFields {
  
  @scala.inline
  def apply(): PathToConversionReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathToConversionReportCompatibleFields]
  }
  
  @scala.inline
  implicit class PathToConversionReportCompatibleFieldsOps[Self <: PathToConversionReportCompatibleFields] (val x: Self) extends AnyVal {
    
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
    def setConversionDimensionsVarargs(value: Dimension*): Self = this.set("conversionDimensions", js.Array(value :_*))
    
    @scala.inline
    def setConversionDimensions(value: js.Array[Dimension]): Self = this.set("conversionDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionDimensions: Self = this.set("conversionDimensions", js.undefined)
    
    @scala.inline
    def setCustomFloodlightVariablesVarargs(value: Dimension*): Self = this.set("customFloodlightVariables", js.Array(value :_*))
    
    @scala.inline
    def setCustomFloodlightVariables(value: js.Array[Dimension]): Self = this.set("customFloodlightVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFloodlightVariables: Self = this.set("customFloodlightVariables", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setPerInteractionDimensionsVarargs(value: Dimension*): Self = this.set("perInteractionDimensions", js.Array(value :_*))
    
    @scala.inline
    def setPerInteractionDimensions(value: js.Array[Dimension]): Self = this.set("perInteractionDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerInteractionDimensions: Self = this.set("perInteractionDimensions", js.undefined)
  }
}
