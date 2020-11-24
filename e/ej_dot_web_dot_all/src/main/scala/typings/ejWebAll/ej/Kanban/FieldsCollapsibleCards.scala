package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsCollapsibleCards extends js.Object {
  
  /** It is used to specify the collapsible card's field mapping.
    * @Default {null}
    */
  var field: js.UndefOr[String] = js.native
  
  /** It is used to specify the collapsible card's key mapping which is available in datasource value of field mapped in collapsibleCards.field.
    * @Default {null}
    */
  var key: js.UndefOr[String] = js.native
}
object FieldsCollapsibleCards {
  
  @scala.inline
  def apply(): FieldsCollapsibleCards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsCollapsibleCards]
  }
  
  @scala.inline
  implicit class FieldsCollapsibleCardsOps[Self <: FieldsCollapsibleCards] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
