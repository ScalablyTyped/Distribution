package typings.extjs.Ext.dd

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDragDropElement extends StObject {
  
  /** [Method] Returns the X position of an html element
    * @param el HTMLElement the element for which to get the position
    * @returns Number the X coordinate
    */
  var getPosX: js.UndefOr[js.Function1[/* el */ js.UndefOr[HTMLElement], Double]] = js.undefined
  
  /** [Method] Returns the Y position of an html element
    * @param el HTMLElement the element for which to get the position
    * @returns Number the Y coordinate
    */
  var getPosY: js.UndefOr[js.Function1[/* el */ js.UndefOr[HTMLElement], Double]] = js.undefined
  
  /** [Method] Gets the scrollLeft
    * @returns Number the document's scrollTop
    */
  var getScrollLeft: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Gets the scrollTop
    * @returns Number the document's scrollTop
    */
  var getScrollTop: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the specified element style property
    * @param el HTMLElement the element
    * @param styleProp String the style property
    * @returns String The value of the style property
    */
  var getStyle: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[HTMLElement], /* styleProp */ js.UndefOr[String], String]
  ] = js.undefined
  
  /** [Method] Recursively searches the immediate parent and all child nodes for the handle element in order to determine wheter or
    * @param node HTMLElement the html element to inspect
    */
  var handleWasClicked: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  
  /** [Method] Sets the x y position of an element to the location of the target element
    * @param moveEl HTMLElement The element to move
    * @param targetEl HTMLElement The position reference element
    */
  var moveToEl: js.UndefOr[
    js.Function2[/* moveEl */ js.UndefOr[HTMLElement], /* targetEl */ js.UndefOr[HTMLElement], Unit]
  ] = js.undefined
  
  /** [Method] Numeric array sort function
    * @param a Number
    * @param b Number
    * @returns Number positive, negative or 0
    */
  var numericSort: js.UndefOr[js.Function2[/* a */ js.UndefOr[Double], /* b */ js.UndefOr[Double], Double]] = js.undefined
  
  /** [Method] Swap two nodes
    * @param n1 HTMLElement the first node to swap
    * @param n2 HTMLElement the other node to swap
    */
  var swapNode: js.UndefOr[
    js.Function2[/* n1 */ js.UndefOr[HTMLElement], /* n2 */ js.UndefOr[HTMLElement], Unit]
  ] = js.undefined
}
object IDragDropElement {
  
  inline def apply(): IDragDropElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDropElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDragDropElement] (val x: Self) extends AnyVal {
    
    inline def setGetPosX(value: /* el */ js.UndefOr[HTMLElement] => Double): Self = StObject.set(x, "getPosX", js.Any.fromFunction1(value))
    
    inline def setGetPosXUndefined: Self = StObject.set(x, "getPosX", js.undefined)
    
    inline def setGetPosY(value: /* el */ js.UndefOr[HTMLElement] => Double): Self = StObject.set(x, "getPosY", js.Any.fromFunction1(value))
    
    inline def setGetPosYUndefined: Self = StObject.set(x, "getPosY", js.undefined)
    
    inline def setGetScrollLeft(value: () => Double): Self = StObject.set(x, "getScrollLeft", js.Any.fromFunction0(value))
    
    inline def setGetScrollLeftUndefined: Self = StObject.set(x, "getScrollLeft", js.undefined)
    
    inline def setGetScrollTop(value: () => Double): Self = StObject.set(x, "getScrollTop", js.Any.fromFunction0(value))
    
    inline def setGetScrollTopUndefined: Self = StObject.set(x, "getScrollTop", js.undefined)
    
    inline def setGetStyle(value: (/* el */ js.UndefOr[HTMLElement], /* styleProp */ js.UndefOr[String]) => String): Self = StObject.set(x, "getStyle", js.Any.fromFunction2(value))
    
    inline def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
    
    inline def setHandleWasClicked(value: /* node */ js.UndefOr[HTMLElement] => Unit): Self = StObject.set(x, "handleWasClicked", js.Any.fromFunction1(value))
    
    inline def setHandleWasClickedUndefined: Self = StObject.set(x, "handleWasClicked", js.undefined)
    
    inline def setMoveToEl(value: (/* moveEl */ js.UndefOr[HTMLElement], /* targetEl */ js.UndefOr[HTMLElement]) => Unit): Self = StObject.set(x, "moveToEl", js.Any.fromFunction2(value))
    
    inline def setMoveToElUndefined: Self = StObject.set(x, "moveToEl", js.undefined)
    
    inline def setNumericSort(value: (/* a */ js.UndefOr[Double], /* b */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "numericSort", js.Any.fromFunction2(value))
    
    inline def setNumericSortUndefined: Self = StObject.set(x, "numericSort", js.undefined)
    
    inline def setSwapNode(value: (/* n1 */ js.UndefOr[HTMLElement], /* n2 */ js.UndefOr[HTMLElement]) => Unit): Self = StObject.set(x, "swapNode", js.Any.fromFunction2(value))
    
    inline def setSwapNodeUndefined: Self = StObject.set(x, "swapNode", js.undefined)
  }
}
