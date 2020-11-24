package typings.extjs.Ext

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.view.IAbstractView
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataView extends IAbstractView {
  
  /** [Method] Un highlights the currently highlighted item if any  */
  var clearHighlight: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Focuses a node in the view
    * @param rec Ext.data.Model The record associated to the node that is to be focused.
    */
  var focusNode: js.UndefOr[js.Function1[/* rec */ js.UndefOr[IModel], Unit]] = js.native
  
  /** [Method] Highlights a given item in the View
    * @param item HTMLElement The item to highlight
    */
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[HTMLElement], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var mouseOverOutBuffer: js.UndefOr[Double] = js.native
}
object IDataView {
  
  @scala.inline
  def apply(): IDataView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataView]
  }
  
  @scala.inline
  implicit class IDataViewOps[Self <: IDataView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearHighlight(value: () => Unit): Self = this.set("clearHighlight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClearHighlight: Self = this.set("clearHighlight", js.undefined)
    
    @scala.inline
    def setFocusNode(value: /* rec */ js.UndefOr[IModel] => Unit): Self = this.set("focusNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFocusNode: Self = this.set("focusNode", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: /* item */ js.UndefOr[HTMLElement] => Unit): Self = this.set("highlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHighlightItem: Self = this.set("highlightItem", js.undefined)
    
    @scala.inline
    def setMouseOverOutBuffer(value: Double): Self = this.set("mouseOverOutBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseOverOutBuffer: Self = this.set("mouseOverOutBuffer", js.undefined)
  }
}
