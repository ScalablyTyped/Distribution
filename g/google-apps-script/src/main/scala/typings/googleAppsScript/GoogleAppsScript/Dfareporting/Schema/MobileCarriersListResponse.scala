package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileCarriersListResponse extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.native
}
object MobileCarriersListResponse {
  
  @scala.inline
  def apply(): MobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileCarriersListResponse]
  }
  
  @scala.inline
  implicit class MobileCarriersListResponseOps[Self <: MobileCarriersListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMobileCarriersVarargs(value: MobileCarrier*): Self = this.set("mobileCarriers", js.Array(value :_*))
    
    @scala.inline
    def setMobileCarriers(value: js.Array[MobileCarrier]): Self = this.set("mobileCarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileCarriers: Self = this.set("mobileCarriers", js.undefined)
  }
}
