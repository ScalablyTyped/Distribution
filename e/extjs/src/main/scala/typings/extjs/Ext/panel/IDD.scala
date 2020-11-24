package typings.extjs.Ext.panel

import typings.extjs.Ext.dd.IDragSource
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDD extends IDragSource {
  
  /** [Method] Returns a reference to the actual element to drag
    * @param e Object
    * @returns HTMLElement the html element
    */
  @JSName("getDragEl")
  var getDragEl_IDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], HTMLElement]] = js.native
}
object IDD {
  
  @scala.inline
  def apply(): IDD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDD]
  }
  
  @scala.inline
  implicit class IDDOps[Self <: IDD] (val x: Self) extends AnyVal {
    
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
    def setGetDragEl(value: /* e */ js.UndefOr[js.Any] => HTMLElement): Self = this.set("getDragEl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDragEl: Self = this.set("getDragEl", js.undefined)
  }
}
