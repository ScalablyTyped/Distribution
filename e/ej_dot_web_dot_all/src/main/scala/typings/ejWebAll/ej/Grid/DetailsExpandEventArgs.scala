package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailsExpandEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns detail row element.
    */
  var detailsRow: js.UndefOr[js.Any] = js.native
  
  /** Returns the foreign key record object (JSON).
    */
  var foreignKeyData: js.UndefOr[js.Any] = js.native
  
  /** Returns master row of detail row record object (JSON).
    */
  var masterData: js.UndefOr[js.Any] = js.native
  
  /** Returns master row element.
    */
  var masterRow: js.UndefOr[js.Any] = js.native
  
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object DetailsExpandEventArgs {
  
  @scala.inline
  def apply(): DetailsExpandEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsExpandEventArgs]
  }
  
  @scala.inline
  implicit class DetailsExpandEventArgsOps[Self <: DetailsExpandEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDetailsRow(value: js.Any): Self = this.set("detailsRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailsRow: Self = this.set("detailsRow", js.undefined)
    
    @scala.inline
    def setForeignKeyData(value: js.Any): Self = this.set("foreignKeyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKeyData: Self = this.set("foreignKeyData", js.undefined)
    
    @scala.inline
    def setMasterData(value: js.Any): Self = this.set("masterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterData: Self = this.set("masterData", js.undefined)
    
    @scala.inline
    def setMasterRow(value: js.Any): Self = this.set("masterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterRow: Self = this.set("masterRow", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
