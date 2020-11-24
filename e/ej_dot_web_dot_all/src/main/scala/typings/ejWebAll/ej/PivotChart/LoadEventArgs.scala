package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadEventArgs extends js.Object {
  
  /** returns the current action of PivotChart control.
    */
  var action: js.UndefOr[String] = js.native
  
  /** returns the custom object bound with PivotChart control.
    */
  var customObject: js.UndefOr[js.Any] = js.native
  
  /** returns the HTML element of PivotChart control.
    */
  var element: js.UndefOr[js.Any] = js.native
}
object LoadEventArgs {
  
  @scala.inline
  def apply(): LoadEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadEventArgs]
  }
  
  @scala.inline
  implicit class LoadEventArgsOps[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setCustomObject(value: js.Any): Self = this.set("customObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomObject: Self = this.set("customObject", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
  }
}
