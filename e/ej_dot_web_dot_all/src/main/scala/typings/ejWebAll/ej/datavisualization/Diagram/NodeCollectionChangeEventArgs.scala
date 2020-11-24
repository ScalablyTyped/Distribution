package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeCollectionChangeEventArgs extends js.Object {
  
  /** parameter defines whether to cancel the collection change or not
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** parameter returns whether the node is to be added or removed
    */
  var changeType: js.UndefOr[String] = js.native
  
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  
  /** parameter returns the node which needs to be added or deleted
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /** triggers before and after adding the node in the diagram which can be differentiated through `state` argument. We can cancel the event only before adding the node
    */
  var state: js.UndefOr[String] = js.native
}
object NodeCollectionChangeEventArgs {
  
  @scala.inline
  def apply(): NodeCollectionChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCollectionChangeEventArgs]
  }
  
  @scala.inline
  implicit class NodeCollectionChangeEventArgsOps[Self <: NodeCollectionChangeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
