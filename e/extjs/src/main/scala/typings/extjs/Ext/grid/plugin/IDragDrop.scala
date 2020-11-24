package typings.extjs.Ext.grid.plugin

import typings.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragDrop extends IAbstractPlugin {
  
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var dragGroup: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var dragText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var dropGroup: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var enableDrag: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var enableDrop: js.UndefOr[Boolean] = js.native
  
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
    * @param view Object
    */
  @JSName("init")
  var init_IDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], Unit]] = js.native
}
object IDragDrop {
  
  @scala.inline
  def apply(): IDragDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDrop]
  }
  
  @scala.inline
  implicit class IDragDropOps[Self <: IDragDrop] (val x: Self) extends AnyVal {
    
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
    def setContainerScroll(value: js.Any): Self = this.set("containerScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerScroll: Self = this.set("containerScroll", js.undefined)
    
    @scala.inline
    def setDdGroup(value: String): Self = this.set("ddGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdGroup: Self = this.set("ddGroup", js.undefined)
    
    @scala.inline
    def setDragGroup(value: String): Self = this.set("dragGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragGroup: Self = this.set("dragGroup", js.undefined)
    
    @scala.inline
    def setDragText(value: String): Self = this.set("dragText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragText: Self = this.set("dragText", js.undefined)
    
    @scala.inline
    def setDropGroup(value: String): Self = this.set("dropGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropGroup: Self = this.set("dropGroup", js.undefined)
    
    @scala.inline
    def setEnableDrag(value: Boolean): Self = this.set("enableDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDrag: Self = this.set("enableDrag", js.undefined)
    
    @scala.inline
    def setEnableDrop(value: Boolean): Self = this.set("enableDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDrop: Self = this.set("enableDrop", js.undefined)
    
    @scala.inline
    def setInit(value: /* view */ js.UndefOr[js.Any] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
  }
}
