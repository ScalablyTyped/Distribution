package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculateCustomSummary extends js.Object {
  
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ TotalValue, _]] = js.native
  
  var groupItems: js.UndefOr[js.Array[AlignByColumn]] = js.native
  
  var recalculateWhileEditing: js.UndefOr[Boolean] = js.native
  
  var skipEmptyValues: js.UndefOr[Boolean] = js.native
  
  var texts: js.UndefOr[Avg] = js.native
  
  var totalItems: js.UndefOr[js.Array[Alignment]] = js.native
}
object CalculateCustomSummary {
  
  @scala.inline
  def apply(): CalculateCustomSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculateCustomSummary]
  }
  
  @scala.inline
  implicit class CalculateCustomSummaryOps[Self <: CalculateCustomSummary] (val x: Self) extends AnyVal {
    
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
    def setCalculateCustomSummary(value: /* options */ TotalValue => _): Self = this.set("calculateCustomSummary", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculateCustomSummary: Self = this.set("calculateCustomSummary", js.undefined)
    
    @scala.inline
    def setGroupItemsVarargs(value: AlignByColumn*): Self = this.set("groupItems", js.Array(value :_*))
    
    @scala.inline
    def setGroupItems(value: js.Array[AlignByColumn]): Self = this.set("groupItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupItems: Self = this.set("groupItems", js.undefined)
    
    @scala.inline
    def setRecalculateWhileEditing(value: Boolean): Self = this.set("recalculateWhileEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecalculateWhileEditing: Self = this.set("recalculateWhileEditing", js.undefined)
    
    @scala.inline
    def setSkipEmptyValues(value: Boolean): Self = this.set("skipEmptyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipEmptyValues: Self = this.set("skipEmptyValues", js.undefined)
    
    @scala.inline
    def setTexts(value: Avg): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    
    @scala.inline
    def setTotalItemsVarargs(value: Alignment*): Self = this.set("totalItems", js.Array(value :_*))
    
    @scala.inline
    def setTotalItems(value: js.Array[Alignment]): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
}
