package typings.extjs.Ext.dd

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDropElement extends js.Object {
  /** [Method] Returns the X position of an html element
    * @param el HTMLElement the element for which to get the position
    * @returns Number the X coordinate
    */
  var getPosX: js.UndefOr[js.Function1[/* el */ js.UndefOr[HTMLElement], Double]] = js.native
  /** [Method] Returns the Y position of an html element
    * @param el HTMLElement the element for which to get the position
    * @returns Number the Y coordinate
    */
  var getPosY: js.UndefOr[js.Function1[/* el */ js.UndefOr[HTMLElement], Double]] = js.native
  /** [Method] Gets the scrollLeft
    * @returns Number the document's scrollTop
    */
  var getScrollLeft: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the scrollTop
    * @returns Number the document's scrollTop
    */
  var getScrollTop: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the specified element style property
    * @param el HTMLElement the element
    * @param styleProp String the style property
    * @returns String The value of the style property
    */
  var getStyle: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[HTMLElement], /* styleProp */ js.UndefOr[String], String]
  ] = js.native
  /** [Method] Recursively searches the immediate parent and all child nodes for the handle element in order to determine wheter or
    * @param node HTMLElement the html element to inspect
    */
  var handleWasClicked: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], Unit]] = js.native
  /** [Method] Sets the x y position of an element to the location of the target element
    * @param moveEl HTMLElement The element to move
    * @param targetEl HTMLElement The position reference element
    */
  var moveToEl: js.UndefOr[
    js.Function2[/* moveEl */ js.UndefOr[HTMLElement], /* targetEl */ js.UndefOr[HTMLElement], Unit]
  ] = js.native
  /** [Method] Numeric array sort function
    * @param a Number
    * @param b Number
    * @returns Number positive, negative or 0
    */
  var numericSort: js.UndefOr[js.Function2[/* a */ js.UndefOr[Double], /* b */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Swap two nodes
    * @param n1 HTMLElement the first node to swap
    * @param n2 HTMLElement the other node to swap
    */
  var swapNode: js.UndefOr[
    js.Function2[/* n1 */ js.UndefOr[HTMLElement], /* n2 */ js.UndefOr[HTMLElement], Unit]
  ] = js.native
}

object IDragDropElement {
  @scala.inline
  def apply(): IDragDropElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDropElement]
  }
  @scala.inline
  implicit class IDragDropElementOps[Self <: IDragDropElement] (val x: Self) extends AnyVal {
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
    def setGetPosX(value: /* el */ js.UndefOr[HTMLElement] => Double): Self = this.set("getPosX", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPosX: Self = this.set("getPosX", js.undefined)
    @scala.inline
    def setGetPosY(value: /* el */ js.UndefOr[HTMLElement] => Double): Self = this.set("getPosY", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPosY: Self = this.set("getPosY", js.undefined)
    @scala.inline
    def setGetScrollLeft(value: () => Double): Self = this.set("getScrollLeft", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScrollLeft: Self = this.set("getScrollLeft", js.undefined)
    @scala.inline
    def setGetScrollTop(value: () => Double): Self = this.set("getScrollTop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScrollTop: Self = this.set("getScrollTop", js.undefined)
    @scala.inline
    def setGetStyle(value: (/* el */ js.UndefOr[HTMLElement], /* styleProp */ js.UndefOr[String]) => String): Self = this.set("getStyle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetStyle: Self = this.set("getStyle", js.undefined)
    @scala.inline
    def setHandleWasClicked(value: /* node */ js.UndefOr[HTMLElement] => Unit): Self = this.set("handleWasClicked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleWasClicked: Self = this.set("handleWasClicked", js.undefined)
    @scala.inline
    def setMoveToEl(value: (/* moveEl */ js.UndefOr[HTMLElement], /* targetEl */ js.UndefOr[HTMLElement]) => Unit): Self = this.set("moveToEl", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMoveToEl: Self = this.set("moveToEl", js.undefined)
    @scala.inline
    def setNumericSort(value: (/* a */ js.UndefOr[Double], /* b */ js.UndefOr[Double]) => Double): Self = this.set("numericSort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNumericSort: Self = this.set("numericSort", js.undefined)
    @scala.inline
    def setSwapNode(value: (/* n1 */ js.UndefOr[HTMLElement], /* n2 */ js.UndefOr[HTMLElement]) => Unit): Self = this.set("swapNode", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSwapNode: Self = this.set("swapNode", js.undefined)
  }
  
}

