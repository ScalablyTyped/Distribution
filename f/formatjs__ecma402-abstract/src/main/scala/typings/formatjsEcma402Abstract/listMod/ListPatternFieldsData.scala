package typings.formatjsEcma402Abstract.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPatternFieldsData extends js.Object {
  
  var conjunction: js.UndefOr[ListPatternData] = js.native
  
  var disjunction: js.UndefOr[ListPatternData] = js.native
  
  var unit: js.UndefOr[ListPatternData] = js.native
}
object ListPatternFieldsData {
  
  @scala.inline
  def apply(): ListPatternFieldsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatternFieldsData]
  }
  
  @scala.inline
  implicit class ListPatternFieldsDataOps[Self <: ListPatternFieldsData] (val x: Self) extends AnyVal {
    
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
    def setConjunction(value: ListPatternData): Self = this.set("conjunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConjunction: Self = this.set("conjunction", js.undefined)
    
    @scala.inline
    def setDisjunction(value: ListPatternData): Self = this.set("disjunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisjunction: Self = this.set("disjunction", js.undefined)
    
    @scala.inline
    def setUnit(value: ListPatternData): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
