package typings.extjs.Ext.tree.plugin

import typings.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITreeViewDragDrop extends IAbstractPlugin {
  
  /** [Config Option] (Boolean) */
  var allowContainerDrops: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var allowParentInserts: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var appendOnly: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.native
  
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
  
  /** [Config Option] (Number) */
  var expandDelay: js.UndefOr[Double] = js.native
  
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
    * @param view Object
    */
  @JSName("init")
  var init_ITreeViewDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var nodeHighlightColor: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var nodeHighlightOnDrop: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var nodeHighlightOnRepair: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var sortOnDrop: js.UndefOr[Boolean] = js.native
}
object ITreeViewDragDrop {
  
  @scala.inline
  def apply(): ITreeViewDragDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreeViewDragDrop]
  }
  
  @scala.inline
  implicit class ITreeViewDragDropOps[Self <: ITreeViewDragDrop] (val x: Self) extends AnyVal {
    
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
    def setAllowContainerDrops(value: Boolean): Self = this.set("allowContainerDrops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowContainerDrops: Self = this.set("allowContainerDrops", js.undefined)
    
    @scala.inline
    def setAllowParentInserts(value: Boolean): Self = this.set("allowParentInserts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowParentInserts: Self = this.set("allowParentInserts", js.undefined)
    
    @scala.inline
    def setAppendOnly(value: Boolean): Self = this.set("appendOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendOnly: Self = this.set("appendOnly", js.undefined)
    
    @scala.inline
    def setContainerScroll(value: js.Any): Self = this.set("containerScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerScroll: Self = this.set("containerScroll", js.undefined)
    
    @scala.inline
    def setDdGroup(value: String): Self = this.set("ddGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdGroup: Self = this.set("ddGroup", js.undefined)
    
    @scala.inline
    def setDisplayField(value: String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    
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
    def setExpandDelay(value: Double): Self = this.set("expandDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandDelay: Self = this.set("expandDelay", js.undefined)
    
    @scala.inline
    def setInit(value: /* view */ js.UndefOr[js.Any] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setNodeHighlightColor(value: String): Self = this.set("nodeHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeHighlightColor: Self = this.set("nodeHighlightColor", js.undefined)
    
    @scala.inline
    def setNodeHighlightOnDrop(value: Boolean): Self = this.set("nodeHighlightOnDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeHighlightOnDrop: Self = this.set("nodeHighlightOnDrop", js.undefined)
    
    @scala.inline
    def setNodeHighlightOnRepair(value: Boolean): Self = this.set("nodeHighlightOnRepair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeHighlightOnRepair: Self = this.set("nodeHighlightOnRepair", js.undefined)
    
    @scala.inline
    def setSortOnDrop(value: Boolean): Self = this.set("sortOnDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOnDrop: Self = this.set("sortOnDrop", js.undefined)
  }
}
