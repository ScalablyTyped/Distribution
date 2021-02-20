package typings.extjs.Ext

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.view.IAbstractView
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
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
  implicit class IDataViewMutableBuilder[Self <: IDataView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearHighlight(value: () => Unit): Self = StObject.set(x, "clearHighlight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearHighlightUndefined: Self = StObject.set(x, "clearHighlight", js.undefined)
    
    @scala.inline
    def setFocusNode(value: /* rec */ js.UndefOr[IModel] => Unit): Self = StObject.set(x, "focusNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusNodeUndefined: Self = StObject.set(x, "focusNode", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: /* item */ js.UndefOr[HTMLElement] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    @scala.inline
    def setMouseOverOutBuffer(value: Double): Self = StObject.set(x, "mouseOverOutBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseOverOutBufferUndefined: Self = StObject.set(x, "mouseOverOutBuffer", js.undefined)
  }
}
