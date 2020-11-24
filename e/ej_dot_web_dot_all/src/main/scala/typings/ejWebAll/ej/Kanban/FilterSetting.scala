package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterSetting extends js.Object {
  
  /** Gets or sets an object of tooltip to filter buttons.
    * @Default {null}
    */
  var description: js.UndefOr[String] = js.native
  
  /** Gets or sets an object that Queries to perform filtering
    * @Default {Object}
    */
  var query: js.UndefOr[js.Any] = js.native
  
  /** Gets or sets an object of display name to filter queries.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}
object FilterSetting {
  
  @scala.inline
  def apply(): FilterSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSetting]
  }
  
  @scala.inline
  implicit class FilterSettingOps[Self <: FilterSetting] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
