package typings.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockModel extends js.Object {
  
  var documentManagerNode: DockNode = js.native
  
  var rootNode: DockNode = js.native
}
object DockModel {
  
  @scala.inline
  def apply(documentManagerNode: DockNode, rootNode: DockNode): DockModel = {
    val __obj = js.Dynamic.literal(documentManagerNode = documentManagerNode.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockModel]
  }
  
  @scala.inline
  implicit class DockModelOps[Self <: DockModel] (val x: Self) extends AnyVal {
    
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
    def setDocumentManagerNode(value: DockNode): Self = this.set("documentManagerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNode(value: DockNode): Self = this.set("rootNode", value.asInstanceOf[js.Any])
  }
}
