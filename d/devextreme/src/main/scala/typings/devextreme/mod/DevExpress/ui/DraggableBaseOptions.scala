package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Y
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableBaseOptions[T] extends DOMComponentOptions[T] {
  
  /**
    * [descr:DraggableBase.Options.autoScroll]
    */
  var autoScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:DraggableBase.Options.boundary]
    */
  var boundary: js.UndefOr[String | Element | JQuery] = js.native
  
  /**
    * [descr:DraggableBase.Options.container]
    */
  var container: js.UndefOr[String | Element | JQuery] = js.native
  
  /**
    * [descr:DraggableBase.Options.cursorOffset]
    */
  var cursorOffset: js.UndefOr[String | Y] = js.native
  
  /**
    * [descr:DraggableBase.Options.data]
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:DraggableBase.Options.dragDirection]
    */
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.native
  
  /**
    * [descr:DraggableBase.Options.group]
    */
  var group: js.UndefOr[String] = js.native
  
  /**
    * [descr:DraggableBase.Options.handle]
    */
  var handle: js.UndefOr[String] = js.native
  
  /**
    * [descr:DraggableBase.Options.scrollSensitivity]
    */
  var scrollSensitivity: js.UndefOr[Double] = js.native
  
  /**
    * [descr:DraggableBase.Options.scrollSpeed]
    */
  var scrollSpeed: js.UndefOr[Double] = js.native
}
object DraggableBaseOptions {
  
  @scala.inline
  def apply[T](): DraggableBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableBaseOptions[T]]
  }
  
  @scala.inline
  implicit class DraggableBaseOptionsOps[Self <: DraggableBaseOptions[_], T] (val x: Self with DraggableBaseOptions[T]) extends AnyVal {
    
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
    def setAutoScroll(value: Boolean): Self = this.set("autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScroll: Self = this.set("autoScroll", js.undefined)
    
    @scala.inline
    def setBoundary(value: String | Element | JQuery): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setContainer(value: String | Element | JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCursorOffset(value: String | Y): Self = this.set("cursorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorOffset: Self = this.set("cursorOffset", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDragDirection(value: both | horizontal | vertical): Self = this.set("dragDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDirection: Self = this.set("dragDirection", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setScrollSensitivity(value: Double): Self = this.set("scrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSensitivity: Self = this.set("scrollSensitivity", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
  }
}
