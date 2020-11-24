package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummaryProcess extends js.Object {
  
  var summaryProcess: js.UndefOr[String] = js.native
  
  var totalValue: js.UndefOr[js.Any] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object SummaryProcess {
  
  @scala.inline
  def apply(): SummaryProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryProcess]
  }
  
  @scala.inline
  implicit class SummaryProcessOps[Self <: SummaryProcess] (val x: Self) extends AnyVal {
    
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
    def setSummaryProcess(value: String): Self = this.set("summaryProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryProcess: Self = this.set("summaryProcess", js.undefined)
    
    @scala.inline
    def setTotalValue(value: js.Any): Self = this.set("totalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalValue: Self = this.set("totalValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
