package typings.extjs.Ext.dd

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDD extends IDragDrop {
  
  /** [Method] Sets the element to the location of the mousedown or click event maintaining the cursor location relative to the loc
    * @param el HTMLElement the element to move
    * @param iPageX Number the X coordinate of the mousedown or drag event
    * @param iPageY Number the Y coordinate of the mousedown or drag event
    */
  var alignElWithMouse: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[HTMLElement], 
      /* iPageX */ js.UndefOr[Double], 
      /* iPageY */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Sets the pointer offset to the distance between the linked element s top left corner and the location the element was
    * @param iPageX Number the X coordinate of the click
    * @param iPageY Number the Y coordinate of the click
    */
  var autoOffset: js.UndefOr[
    js.Function2[/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /** [Method] Event that fires prior to the onDrag event
    * @param e Object
    */
  var b4Drag: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Event that fires prior to the onMouseDown event
    * @param e Object
    */
  var b4MouseDown: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Saves the most recent position so that we can reset the constraints and tick marks on demand
    * @param iPageX Number the current x position (this just makes it so we don't have to look it up again)
    * @param iPageY Number the current y position (this just makes it so we don't have to look it up again)
    */
  var cachePosition: js.UndefOr[
    js.Function2[/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /** [Property] (Boolean) */
  var scroll: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the pointer offset
    * @param iDeltaX Number the distance from the left
    * @param iDeltaY Number the distance from the top
    */
  var setDelta: js.UndefOr[
    js.Function2[/* iDeltaX */ js.UndefOr[Double], /* iDeltaY */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /** [Method] Sets the drag element to the location of the mousedown or click event maintaining the cursor location relative to th
    * @param iPageX Number the X coordinate of the mousedown or drag event
    * @param iPageY Number the Y coordinate of the mousedown or drag event
    */
  var setDragElPos: js.UndefOr[
    js.Function2[/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /** [Method] toString method
    * @returns String string representation of the dd obj
    */
  @JSName("toString")
  var toString_FIDD: js.UndefOr[js.Function0[String]] = js.native
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
    def setAlignElWithMouse(
      value: (/* el */ js.UndefOr[HTMLElement], /* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit
    ): Self = this.set("alignElWithMouse", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAlignElWithMouse: Self = this.set("alignElWithMouse", js.undefined)
    
    @scala.inline
    def setAutoOffset(value: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit): Self = this.set("autoOffset", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAutoOffset: Self = this.set("autoOffset", js.undefined)
    
    @scala.inline
    def setB4Drag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("b4Drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteB4Drag: Self = this.set("b4Drag", js.undefined)
    
    @scala.inline
    def setB4MouseDown(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("b4MouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteB4MouseDown: Self = this.set("b4MouseDown", js.undefined)
    
    @scala.inline
    def setCachePosition(value: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit): Self = this.set("cachePosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCachePosition: Self = this.set("cachePosition", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSetDelta(value: (/* iDeltaX */ js.UndefOr[Double], /* iDeltaY */ js.UndefOr[Double]) => Unit): Self = this.set("setDelta", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetDelta: Self = this.set("setDelta", js.undefined)
    
    @scala.inline
    def setSetDragElPos(value: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Unit): Self = this.set("setDragElPos", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetDragElPos: Self = this.set("setDragElPos", js.undefined)
    
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
  }
}
