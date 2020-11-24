package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBandingRequest extends js.Object {
  
  var bandedRange: js.UndefOr[BandedRange] = js.native
  
  var fields: js.UndefOr[String] = js.native
}
object UpdateBandingRequest {
  
  @scala.inline
  def apply(): UpdateBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBandingRequest]
  }
  
  @scala.inline
  implicit class UpdateBandingRequestOps[Self <: UpdateBandingRequest] (val x: Self) extends AnyVal {
    
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
    def setBandedRange(value: BandedRange): Self = this.set("bandedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandedRange: Self = this.set("bandedRange", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
}
