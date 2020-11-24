package typings.extjs.Ext.draw

import typings.extjs.Ext.dd.IDragSource
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteDD extends IDragSource {
  
  /** [Method] Returns a reference to the actual element to drag
    * @param e Object
    * @returns HTMLElement the html element
    */
  @JSName("getDragEl")
  var getDragEl_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], HTMLElement]] = js.native
  
  /** [Method] Abstract method called during the onMouseMove event while dragging an object
    * @param e Object
    */
  @JSName("onDrag")
  var onDrag_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the drag element to the location of the mousedown or click event maintaining the cursor location relative to th  */
  @JSName("setDragElPos")
  var setDragElPos_ISpriteDD: js.UndefOr[js.Function0[Unit]] = js.native
}
object ISpriteDD {
  
  @scala.inline
  def apply(): ISpriteDD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpriteDD]
  }
  
  @scala.inline
  implicit class ISpriteDDOps[Self <: ISpriteDD] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setSetDragElPos(value: () => Unit): Self = this.set("setDragElPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetDragElPos: Self = this.set("setDragElPos", js.undefined)
  }
}
