package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesData extends js.Object {
  
  /** Defines whether the BPMN data object is a collection or not
    * @Default {false}
    */
  var collection: js.UndefOr[Boolean] = js.native
  
  /** Sets the type of the BPMN Data object
    * @Default {ej.datavisualization.Diagram.BPMNDataObjects.None}
    */
  var `type`: js.UndefOr[BPMNDataObjects | String] = js.native
}
object NodesData {
  
  @scala.inline
  def apply(): NodesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesData]
  }
  
  @scala.inline
  implicit class NodesDataOps[Self <: NodesData] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: Boolean): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    
    @scala.inline
    def setType(value: BPMNDataObjects | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
