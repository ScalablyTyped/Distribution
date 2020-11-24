package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderBy extends js.Object {
  
  var fieldName: js.UndefOr[String] = js.native
  
  var orderType: js.UndefOr[String] = js.native
  
  var sortOrder: js.UndefOr[String] = js.native
}
object OrderBy {
  
  @scala.inline
  def apply(): OrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderBy]
  }
  
  @scala.inline
  implicit class OrderByOps[Self <: OrderBy] (val x: Self) extends AnyVal {
    
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setOrderType(value: String): Self = this.set("orderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderType: Self = this.set("orderType", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
}
