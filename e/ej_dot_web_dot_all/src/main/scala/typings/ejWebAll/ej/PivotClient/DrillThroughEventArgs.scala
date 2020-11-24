package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrillThroughEventArgs extends js.Object {
  
  /** return the JSON records of the generated cells on drill-through operation.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** returns the HTML element of PivotClient.
    */
  var element: js.UndefOr[js.Any] = js.native
}
object DrillThroughEventArgs {
  
  @scala.inline
  def apply(): DrillThroughEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillThroughEventArgs]
  }
  
  @scala.inline
  implicit class DrillThroughEventArgsOps[Self <: DrillThroughEventArgs] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
  }
}
