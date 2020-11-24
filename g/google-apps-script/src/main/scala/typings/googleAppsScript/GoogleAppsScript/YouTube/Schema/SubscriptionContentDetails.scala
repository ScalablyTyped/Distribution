package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionContentDetails extends js.Object {
  
  var activityType: js.UndefOr[String] = js.native
  
  var newItemCount: js.UndefOr[Double] = js.native
  
  var totalItemCount: js.UndefOr[Double] = js.native
}
object SubscriptionContentDetails {
  
  @scala.inline
  def apply(): SubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionContentDetails]
  }
  
  @scala.inline
  implicit class SubscriptionContentDetailsOps[Self <: SubscriptionContentDetails] (val x: Self) extends AnyVal {
    
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
    def setActivityType(value: String): Self = this.set("activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityType: Self = this.set("activityType", js.undefined)
    
    @scala.inline
    def setNewItemCount(value: Double): Self = this.set("newItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewItemCount: Self = this.set("newItemCount", js.undefined)
    
    @scala.inline
    def setTotalItemCount(value: Double): Self = this.set("totalItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItemCount: Self = this.set("totalItemCount", js.undefined)
  }
}
