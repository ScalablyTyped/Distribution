package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableRowPropertiesRequest extends js.Object {
  
  var fields: js.UndefOr[String] = js.native
  
  var objectId: js.UndefOr[String] = js.native
  
  var rowIndices: js.UndefOr[js.Array[Double]] = js.native
  
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.native
}
object UpdateTableRowPropertiesRequest {
  
  @scala.inline
  def apply(): UpdateTableRowPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableRowPropertiesRequest]
  }
  
  @scala.inline
  implicit class UpdateTableRowPropertiesRequestOps[Self <: UpdateTableRowPropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setRowIndicesVarargs(value: Double*): Self = this.set("rowIndices", js.Array(value :_*))
    
    @scala.inline
    def setRowIndices(value: js.Array[Double]): Self = this.set("rowIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndices: Self = this.set("rowIndices", js.undefined)
    
    @scala.inline
    def setTableRowProperties(value: TableRowProperties): Self = this.set("tableRowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRowProperties: Self = this.set("tableRowProperties", js.undefined)
  }
}
