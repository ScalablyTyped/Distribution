package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceQuotasRemaining extends js.Object {
  
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.native
  
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.native
}
object ResourceQuotasRemaining {
  
  @scala.inline
  def apply(): ResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotasRemaining]
  }
  
  @scala.inline
  implicit class ResourceQuotasRemainingOps[Self <: ResourceQuotasRemaining] (val x: Self) extends AnyVal {
    
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
    def setDailyQuotaTokensRemaining(value: Double): Self = this.set("dailyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailyQuotaTokensRemaining: Self = this.set("dailyQuotaTokensRemaining", js.undefined)
    
    @scala.inline
    def setHourlyQuotaTokensRemaining(value: Double): Self = this.set("hourlyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourlyQuotaTokensRemaining: Self = this.set("hourlyQuotaTokensRemaining", js.undefined)
  }
}
