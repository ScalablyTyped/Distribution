package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotValue extends js.Object {
  
  var calculatedDisplayType: js.UndefOr[String] = js.native
  
  var formula: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  
  var summarizeFunction: js.UndefOr[String] = js.native
}
object PivotValue {
  
  @scala.inline
  def apply(): PivotValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotValue]
  }
  
  @scala.inline
  implicit class PivotValueOps[Self <: PivotValue] (val x: Self) extends AnyVal {
    
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
    def setCalculatedDisplayType(value: String): Self = this.set("calculatedDisplayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculatedDisplayType: Self = this.set("calculatedDisplayType", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSourceColumnOffset(value: Double): Self = this.set("sourceColumnOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceColumnOffset: Self = this.set("sourceColumnOffset", js.undefined)
    
    @scala.inline
    def setSummarizeFunction(value: String): Self = this.set("summarizeFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummarizeFunction: Self = this.set("summarizeFunction", js.undefined)
  }
}
