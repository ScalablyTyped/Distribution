package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellClickEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the index of the cell.
    */
  var cellIndex: js.UndefOr[Double] = js.native
  
  /** Returns the end time of the clicked cell.
    */
  var endTime: js.UndefOr[js.Any] = js.native
  
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns day, date and time information.
    */
  var quickString: js.UndefOr[String] = js.native
  
  /** Returns the object of the resource.
    */
  var resources: js.UndefOr[js.Any] = js.native
  
  /** Returns the start time of the clicked cell.
    */
  var startTime: js.UndefOr[js.Any] = js.native
  
  /** Returns the target of the clicked cell.
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object CellClickEventArgs {
  
  @scala.inline
  def apply(): CellClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellClickEventArgs]
  }
  
  @scala.inline
  implicit class CellClickEventArgsOps[Self <: CellClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCellIndex(value: Double): Self = this.set("cellIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellIndex: Self = this.set("cellIndex", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Any): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setQuickString(value: String): Self = this.set("quickString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickString: Self = this.set("quickString", js.undefined)
    
    @scala.inline
    def setResources(value: js.Any): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Any): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
