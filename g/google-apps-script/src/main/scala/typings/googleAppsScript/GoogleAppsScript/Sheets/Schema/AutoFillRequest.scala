package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFillRequest extends js.Object {
  
  var range: js.UndefOr[GridRange] = js.native
  
  var sourceAndDestination: js.UndefOr[SourceAndDestination] = js.native
  
  var useAlternateSeries: js.UndefOr[Boolean] = js.native
}
object AutoFillRequest {
  
  @scala.inline
  def apply(): AutoFillRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFillRequest]
  }
  
  @scala.inline
  implicit class AutoFillRequestOps[Self <: AutoFillRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSourceAndDestination(value: SourceAndDestination): Self = this.set("sourceAndDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAndDestination: Self = this.set("sourceAndDestination", js.undefined)
    
    @scala.inline
    def setUseAlternateSeries(value: Boolean): Self = this.set("useAlternateSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAlternateSeries: Self = this.set("useAlternateSeries", js.undefined)
  }
}
