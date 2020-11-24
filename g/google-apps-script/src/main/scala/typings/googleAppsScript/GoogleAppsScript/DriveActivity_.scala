package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Collection.ActivityCollection
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.ConsolidationStrategy
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveActivity_ extends js.Object {
  
  var Activity: js.UndefOr[ActivityCollection] = js.native
  
  // Create a new instance of ConsolidationStrategy
  def newConsolidationStrategy(): ConsolidationStrategy = js.native
  
  // Create a new instance of Legacy
  def newLegacy(): js.Any = js.native
  
  // Create a new instance of NoConsolidation
  def newNoConsolidation(): js.Any = js.native
  
  // Create a new instance of QueryDriveActivityRequest
  def newQueryDriveActivityRequest(): QueryDriveActivityRequest = js.native
}
object DriveActivity_ {
  
  @scala.inline
  def apply(
    newConsolidationStrategy: () => ConsolidationStrategy,
    newLegacy: () => js.Any,
    newNoConsolidation: () => js.Any,
    newQueryDriveActivityRequest: () => QueryDriveActivityRequest
  ): DriveActivity_ = {
    val __obj = js.Dynamic.literal(newConsolidationStrategy = js.Any.fromFunction0(newConsolidationStrategy), newLegacy = js.Any.fromFunction0(newLegacy), newNoConsolidation = js.Any.fromFunction0(newNoConsolidation), newQueryDriveActivityRequest = js.Any.fromFunction0(newQueryDriveActivityRequest))
    __obj.asInstanceOf[DriveActivity_]
  }
  
  @scala.inline
  implicit class DriveActivity_Ops[Self <: DriveActivity_] (val x: Self) extends AnyVal {
    
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
    def setNewConsolidationStrategy(value: () => ConsolidationStrategy): Self = this.set("newConsolidationStrategy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLegacy(value: () => js.Any): Self = this.set("newLegacy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNoConsolidation(value: () => js.Any): Self = this.set("newNoConsolidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewQueryDriveActivityRequest(value: () => QueryDriveActivityRequest): Self = this.set("newQueryDriveActivityRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setActivity(value: ActivityCollection): Self = this.set("Activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivity: Self = this.set("Activity", js.undefined)
  }
}
