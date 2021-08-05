package typings.extjs.Ext

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.view.IAbstractView
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataView
  extends StObject
     with IAbstractView {
  
  /** [Method] Un highlights the currently highlighted item if any  */
  var clearHighlight: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Focuses a node in the view
    * @param rec Ext.data.Model The record associated to the node that is to be focused.
    */
  var focusNode: js.UndefOr[js.Function1[/* rec */ js.UndefOr[IModel], Unit]] = js.undefined
  
  /** [Method] Highlights a given item in the View
    * @param item HTMLElement The item to highlight
    */
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var mouseOverOutBuffer: js.UndefOr[Double] = js.undefined
}
object IDataView {
  
  inline def apply(): IDataView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataView]
  }
  
  extension [Self <: IDataView](x: Self) {
    
    inline def setClearHighlight(value: () => Unit): Self = StObject.set(x, "clearHighlight", js.Any.fromFunction0(value))
    
    inline def setClearHighlightUndefined: Self = StObject.set(x, "clearHighlight", js.undefined)
    
    inline def setFocusNode(value: /* rec */ js.UndefOr[IModel] => Unit): Self = StObject.set(x, "focusNode", js.Any.fromFunction1(value))
    
    inline def setFocusNodeUndefined: Self = StObject.set(x, "focusNode", js.undefined)
    
    inline def setHighlightItem(value: /* item */ js.UndefOr[HTMLElement] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
    
    inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    inline def setMouseOverOutBuffer(value: Double): Self = StObject.set(x, "mouseOverOutBuffer", value.asInstanceOf[js.Any])
    
    inline def setMouseOverOutBufferUndefined: Self = StObject.set(x, "mouseOverOutBuffer", js.undefined)
  }
}
