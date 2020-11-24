package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFreeBusyRequestItem extends js.Object {
  
  /**
    * The identifier of a calendar or a group.
    */
  var id: js.UndefOr[String] = js.native
}
object SchemaFreeBusyRequestItem {
  
  @scala.inline
  def apply(): SchemaFreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyRequestItem]
  }
  
  @scala.inline
  implicit class SchemaFreeBusyRequestItemOps[Self <: SchemaFreeBusyRequestItem] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
