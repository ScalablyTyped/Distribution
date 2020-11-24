package typings.flexmonster.anon

import typings.flexmonster.mod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveMeasure extends js.Object {
  
  var activeMeasure: js.UndefOr[MeasureObject] = js.native
  
  var activeTupleIndex: js.UndefOr[Double] = js.native
  
  var autoRange: js.UndefOr[Boolean] = js.native
  
  var axisShortNumberFormat: js.UndefOr[Boolean] = js.native
  
  var labelsHierarchy: js.UndefOr[String] = js.native
  
  var multipleMeasures: js.UndefOr[Boolean] = js.native
  
  var oneLevel: js.UndefOr[Boolean] = js.native
  
  var pieDataIndex: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var reversedAxes: js.UndefOr[Boolean] = js.native
  
  var showAllLabels: js.UndefOr[Boolean] = js.native
  
  var showDataLabels: js.UndefOr[Boolean] = js.native
  
  var showFilter: js.UndefOr[Boolean] = js.native
  
  var showLegend: js.UndefOr[Boolean] = js.native
  
  var showLegendButton: js.UndefOr[Boolean] = js.native
  
  var showMeasures: js.UndefOr[Boolean] = js.native
  
  var showOneMeasureSelection: js.UndefOr[Boolean] = js.native
  
  var showWarning: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ActiveMeasure {
  
  @scala.inline
  def apply(): ActiveMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveMeasure]
  }
  
  @scala.inline
  implicit class ActiveMeasureOps[Self <: ActiveMeasure] (val x: Self) extends AnyVal {
    
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
    def setActiveMeasure(value: MeasureObject): Self = this.set("activeMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveMeasure: Self = this.set("activeMeasure", js.undefined)
    
    @scala.inline
    def setActiveTupleIndex(value: Double): Self = this.set("activeTupleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTupleIndex: Self = this.set("activeTupleIndex", js.undefined)
    
    @scala.inline
    def setAutoRange(value: Boolean): Self = this.set("autoRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRange: Self = this.set("autoRange", js.undefined)
    
    @scala.inline
    def setAxisShortNumberFormat(value: Boolean): Self = this.set("axisShortNumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisShortNumberFormat: Self = this.set("axisShortNumberFormat", js.undefined)
    
    @scala.inline
    def setLabelsHierarchy(value: String): Self = this.set("labelsHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelsHierarchy: Self = this.set("labelsHierarchy", js.undefined)
    
    @scala.inline
    def setMultipleMeasures(value: Boolean): Self = this.set("multipleMeasures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleMeasures: Self = this.set("multipleMeasures", js.undefined)
    
    @scala.inline
    def setOneLevel(value: Boolean): Self = this.set("oneLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneLevel: Self = this.set("oneLevel", js.undefined)
    
    @scala.inline
    def setPieDataIndex(value: String): Self = this.set("pieDataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieDataIndex: Self = this.set("pieDataIndex", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setReversedAxes(value: Boolean): Self = this.set("reversedAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversedAxes: Self = this.set("reversedAxes", js.undefined)
    
    @scala.inline
    def setShowAllLabels(value: Boolean): Self = this.set("showAllLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAllLabels: Self = this.set("showAllLabels", js.undefined)
    
    @scala.inline
    def setShowDataLabels(value: Boolean): Self = this.set("showDataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDataLabels: Self = this.set("showDataLabels", js.undefined)
    
    @scala.inline
    def setShowFilter(value: Boolean): Self = this.set("showFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFilter: Self = this.set("showFilter", js.undefined)
    
    @scala.inline
    def setShowLegend(value: Boolean): Self = this.set("showLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLegend: Self = this.set("showLegend", js.undefined)
    
    @scala.inline
    def setShowLegendButton(value: Boolean): Self = this.set("showLegendButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLegendButton: Self = this.set("showLegendButton", js.undefined)
    
    @scala.inline
    def setShowMeasures(value: Boolean): Self = this.set("showMeasures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMeasures: Self = this.set("showMeasures", js.undefined)
    
    @scala.inline
    def setShowOneMeasureSelection(value: Boolean): Self = this.set("showOneMeasureSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOneMeasureSelection: Self = this.set("showOneMeasureSelection", js.undefined)
    
    @scala.inline
    def setShowWarning(value: Boolean): Self = this.set("showWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWarning: Self = this.set("showWarning", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
