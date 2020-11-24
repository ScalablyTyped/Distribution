package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueCellHyperlinkClickEventArgs extends js.Object {
  
  /** returns the clicked cell information.
    */
  var args: js.UndefOr[js.Any] = js.native
  
  /** returns the custom object bounds with PivotClient control.
    */
  var customerObject: js.UndefOr[js.Any] = js.native
  
  /** returns the HTML element of PivotGrid control.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /** returns the model object bound with PivotClient control.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** returns the current action of PivotClient control.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ValueCellHyperlinkClickEventArgs {
  
  @scala.inline
  def apply(): ValueCellHyperlinkClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueCellHyperlinkClickEventArgs]
  }
  
  @scala.inline
  implicit class ValueCellHyperlinkClickEventArgsOps[Self <: ValueCellHyperlinkClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCustomerObject(value: js.Any): Self = this.set("customerObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerObject: Self = this.set("customerObject", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
