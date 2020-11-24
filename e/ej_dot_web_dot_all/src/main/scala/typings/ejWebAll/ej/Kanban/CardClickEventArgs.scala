package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardClickEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the Header text of the column corresponding to the selected card.
    */
  var columnName: js.UndefOr[String] = js.native
  
  /** Returns the current card to the Kanban.
    */
  var currentCard: js.UndefOr[String] = js.native
  
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns Kanban element.
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object CardClickEventArgs {
  
  @scala.inline
  def apply(): CardClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardClickEventArgs]
  }
  
  @scala.inline
  implicit class CardClickEventArgsOps[Self <: CardClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    
    @scala.inline
    def setCurrentCard(value: String): Self = this.set("currentCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentCard: Self = this.set("currentCard", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
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
