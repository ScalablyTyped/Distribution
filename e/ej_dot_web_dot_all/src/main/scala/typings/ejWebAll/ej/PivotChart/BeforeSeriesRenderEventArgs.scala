package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeSeriesRenderEventArgs extends js.Object {
  
  /** series - Instance of the series which is about to get rendered
    */
  var data: js.UndefOr[js.Any] = js.native
}
object BeforeSeriesRenderEventArgs {
  
  @scala.inline
  def apply(): BeforeSeriesRenderEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeSeriesRenderEventArgs]
  }
  
  @scala.inline
  implicit class BeforeSeriesRenderEventArgsOps[Self <: BeforeSeriesRenderEventArgs] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
