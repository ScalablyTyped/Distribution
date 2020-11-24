package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Measure extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var aggregation: js.UndefOr[String] = js.native
  
  var availableAggregations: js.UndefOr[js.Array[String]] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var formula: js.UndefOr[String] = js.native
  
  var grandTotalCaption: js.UndefOr[String] = js.native
  
  var uniqueName: js.UndefOr[String] = js.native
}
object Measure {
  
  @scala.inline
  def apply(): Measure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Measure]
  }
  
  @scala.inline
  implicit class MeasureOps[Self <: Measure] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAggregation(value: String): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    
    @scala.inline
    def setAvailableAggregationsVarargs(value: String*): Self = this.set("availableAggregations", js.Array(value :_*))
    
    @scala.inline
    def setAvailableAggregations(value: js.Array[String]): Self = this.set("availableAggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableAggregations: Self = this.set("availableAggregations", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setGrandTotalCaption(value: String): Self = this.set("grandTotalCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrandTotalCaption: Self = this.set("grandTotalCaption", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueName: Self = this.set("uniqueName", js.undefined)
  }
}
