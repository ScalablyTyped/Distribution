package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplicateFilterViewRequest extends js.Object {
  
  var filterId: js.UndefOr[Double] = js.native
}
object DuplicateFilterViewRequest {
  
  @scala.inline
  def apply(): DuplicateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateFilterViewRequest]
  }
  
  @scala.inline
  implicit class DuplicateFilterViewRequestOps[Self <: DuplicateFilterViewRequest] (val x: Self) extends AnyVal {
    
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
    def setFilterId(value: Double): Self = this.set("filterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterId: Self = this.set("filterId", js.undefined)
  }
}
