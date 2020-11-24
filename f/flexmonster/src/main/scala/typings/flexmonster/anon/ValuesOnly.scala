package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValuesOnly extends js.Object {
  
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.native
  
  var slice: js.UndefOr[typings.flexmonster.mod.Slice] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var valuesOnly: js.UndefOr[Boolean] = js.native
  
  var withDrilldown: js.UndefOr[Boolean] = js.native
  
  var xAxisType: js.UndefOr[String] = js.native
}
object ValuesOnly {
  
  @scala.inline
  def apply(): ValuesOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValuesOnly]
  }
  
  @scala.inline
  implicit class ValuesOnlyOps[Self <: ValuesOnly] (val x: Self) extends AnyVal {
    
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
    def setPrepareDataFunction(value: /* rawData */ js.Any => _): Self = this.set("prepareDataFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrepareDataFunction: Self = this.set("prepareDataFunction", js.undefined)
    
    @scala.inline
    def setSlice(value: typings.flexmonster.mod.Slice): Self = this.set("slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValuesOnly(value: Boolean): Self = this.set("valuesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuesOnly: Self = this.set("valuesOnly", js.undefined)
    
    @scala.inline
    def setWithDrilldown(value: Boolean): Self = this.set("withDrilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithDrilldown: Self = this.set("withDrilldown", js.undefined)
    
    @scala.inline
    def setXAxisType(value: String): Self = this.set("xAxisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisType: Self = this.set("xAxisType", js.undefined)
  }
}
