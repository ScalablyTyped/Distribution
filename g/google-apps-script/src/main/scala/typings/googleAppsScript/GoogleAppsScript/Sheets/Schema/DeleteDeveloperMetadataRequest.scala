package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeveloperMetadataRequest extends js.Object {
  
  var dataFilter: js.UndefOr[DataFilter] = js.native
}
object DeleteDeveloperMetadataRequest {
  
  @scala.inline
  def apply(): DeleteDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeveloperMetadataRequest]
  }
  
  @scala.inline
  implicit class DeleteDeveloperMetadataRequestOps[Self <: DeleteDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    
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
    def setDataFilter(value: DataFilter): Self = this.set("dataFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFilter: Self = this.set("dataFilter", js.undefined)
  }
}
