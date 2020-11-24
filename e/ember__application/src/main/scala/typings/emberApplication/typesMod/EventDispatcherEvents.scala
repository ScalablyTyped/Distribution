package typings.emberApplication.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDispatcherEvents
  extends /* event */ StringDictionary[js.UndefOr[String | Null]] {
  
  var change: js.UndefOr[String | Null] = js.native
  
  var click: js.UndefOr[String | Null] = js.native
  
  var contextmenu: js.UndefOr[String | Null] = js.native
  
  var dblclick: js.UndefOr[String | Null] = js.native
  
  var drag: js.UndefOr[String | Null] = js.native
  
  var dragend: js.UndefOr[String | Null] = js.native
  
  var dragenter: js.UndefOr[String | Null] = js.native
  
  var dragleave: js.UndefOr[String | Null] = js.native
  
  var dragover: js.UndefOr[String | Null] = js.native
  
  var dragstart: js.UndefOr[String | Null] = js.native
  
  var drop: js.UndefOr[String | Null] = js.native
  
  var focusin: js.UndefOr[String | Null] = js.native
  
  var focusout: js.UndefOr[String | Null] = js.native
  
  var input: js.UndefOr[String | Null] = js.native
  
  var keydown: js.UndefOr[String | Null] = js.native
  
  var keypress: js.UndefOr[String | Null] = js.native
  
  var keyup: js.UndefOr[String | Null] = js.native
  
  var mousedown: js.UndefOr[String | Null] = js.native
  
  var mouseenter: js.UndefOr[String | Null] = js.native
  
  var mouseleave: js.UndefOr[String | Null] = js.native
  
  var mousemove: js.UndefOr[String | Null] = js.native
  
  var mouseup: js.UndefOr[String | Null] = js.native
  
  var submit: js.UndefOr[String | Null] = js.native
  
  var touchcancel: js.UndefOr[String | Null] = js.native
  
  var touchend: js.UndefOr[String | Null] = js.native
  
  var touchmove: js.UndefOr[String | Null] = js.native
  
  var touchstart: js.UndefOr[String | Null] = js.native
}
object EventDispatcherEvents {
  
  @scala.inline
  def apply(): EventDispatcherEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDispatcherEvents]
  }
  
  @scala.inline
  implicit class EventDispatcherEventsOps[Self <: EventDispatcherEvents] (val x: Self) extends AnyVal {
    
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
    def setChange(value: String): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setChangeNull: Self = this.set("change", null)
    
    @scala.inline
    def setClick(value: String): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setClickNull: Self = this.set("click", null)
    
    @scala.inline
    def setContextmenu(value: String): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextmenu: Self = this.set("contextmenu", js.undefined)
    
    @scala.inline
    def setContextmenuNull: Self = this.set("contextmenu", null)
    
    @scala.inline
    def setDblclick(value: String): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblclick: Self = this.set("dblclick", js.undefined)
    
    @scala.inline
    def setDblclickNull: Self = this.set("dblclick", null)
    
    @scala.inline
    def setDrag(value: String): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragNull: Self = this.set("drag", null)
    
    @scala.inline
    def setDragend(value: String): Self = this.set("dragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    
    @scala.inline
    def setDragendNull: Self = this.set("dragend", null)
    
    @scala.inline
    def setDragenter(value: String): Self = this.set("dragenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragenter: Self = this.set("dragenter", js.undefined)
    
    @scala.inline
    def setDragenterNull: Self = this.set("dragenter", null)
    
    @scala.inline
    def setDragleave(value: String): Self = this.set("dragleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragleave: Self = this.set("dragleave", js.undefined)
    
    @scala.inline
    def setDragleaveNull: Self = this.set("dragleave", null)
    
    @scala.inline
    def setDragover(value: String): Self = this.set("dragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragover: Self = this.set("dragover", js.undefined)
    
    @scala.inline
    def setDragoverNull: Self = this.set("dragover", null)
    
    @scala.inline
    def setDragstart(value: String): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    
    @scala.inline
    def setDragstartNull: Self = this.set("dragstart", null)
    
    @scala.inline
    def setDrop(value: String): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setDropNull: Self = this.set("drop", null)
    
    @scala.inline
    def setFocusin(value: String): Self = this.set("focusin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusin: Self = this.set("focusin", js.undefined)
    
    @scala.inline
    def setFocusinNull: Self = this.set("focusin", null)
    
    @scala.inline
    def setFocusout(value: String): Self = this.set("focusout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusout: Self = this.set("focusout", js.undefined)
    
    @scala.inline
    def setFocusoutNull: Self = this.set("focusout", null)
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputNull: Self = this.set("input", null)
    
    @scala.inline
    def setKeydown(value: String): Self = this.set("keydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setKeydownNull: Self = this.set("keydown", null)
    
    @scala.inline
    def setKeypress(value: String): Self = this.set("keypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeypress: Self = this.set("keypress", js.undefined)
    
    @scala.inline
    def setKeypressNull: Self = this.set("keypress", null)
    
    @scala.inline
    def setKeyup(value: String): Self = this.set("keyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyup: Self = this.set("keyup", js.undefined)
    
    @scala.inline
    def setKeyupNull: Self = this.set("keyup", null)
    
    @scala.inline
    def setMousedown(value: String): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousedown: Self = this.set("mousedown", js.undefined)
    
    @scala.inline
    def setMousedownNull: Self = this.set("mousedown", null)
    
    @scala.inline
    def setMouseenter(value: String): Self = this.set("mouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseenter: Self = this.set("mouseenter", js.undefined)
    
    @scala.inline
    def setMouseenterNull: Self = this.set("mouseenter", null)
    
    @scala.inline
    def setMouseleave(value: String): Self = this.set("mouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseleave: Self = this.set("mouseleave", js.undefined)
    
    @scala.inline
    def setMouseleaveNull: Self = this.set("mouseleave", null)
    
    @scala.inline
    def setMousemove(value: String): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousemove: Self = this.set("mousemove", js.undefined)
    
    @scala.inline
    def setMousemoveNull: Self = this.set("mousemove", null)
    
    @scala.inline
    def setMouseup(value: String): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseup: Self = this.set("mouseup", js.undefined)
    
    @scala.inline
    def setMouseupNull: Self = this.set("mouseup", null)
    
    @scala.inline
    def setSubmit(value: String): Self = this.set("submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    
    @scala.inline
    def setSubmitNull: Self = this.set("submit", null)
    
    @scala.inline
    def setTouchcancel(value: String): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchcancel: Self = this.set("touchcancel", js.undefined)
    
    @scala.inline
    def setTouchcancelNull: Self = this.set("touchcancel", null)
    
    @scala.inline
    def setTouchend(value: String): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchend: Self = this.set("touchend", js.undefined)
    
    @scala.inline
    def setTouchendNull: Self = this.set("touchend", null)
    
    @scala.inline
    def setTouchmove(value: String): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchmove: Self = this.set("touchmove", js.undefined)
    
    @scala.inline
    def setTouchmoveNull: Self = this.set("touchmove", null)
    
    @scala.inline
    def setTouchstart(value: String): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchstart: Self = this.set("touchstart", js.undefined)
    
    @scala.inline
    def setTouchstartNull: Self = this.set("touchstart", null)
  }
}
