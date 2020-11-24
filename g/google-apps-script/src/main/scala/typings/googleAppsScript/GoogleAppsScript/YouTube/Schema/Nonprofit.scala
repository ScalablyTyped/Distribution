package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nonprofit extends js.Object {
  
  var nonprofitId: js.UndefOr[NonprofitId] = js.native
  
  var nonprofitLegalName: js.UndefOr[String] = js.native
}
object Nonprofit {
  
  @scala.inline
  def apply(): Nonprofit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nonprofit]
  }
  
  @scala.inline
  implicit class NonprofitOps[Self <: Nonprofit] (val x: Self) extends AnyVal {
    
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
    def setNonprofitId(value: NonprofitId): Self = this.set("nonprofitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonprofitId: Self = this.set("nonprofitId", js.undefined)
    
    @scala.inline
    def setNonprofitLegalName(value: String): Self = this.set("nonprofitLegalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonprofitLegalName: Self = this.set("nonprofitLegalName", js.undefined)
  }
}
