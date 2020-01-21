package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Collection.ActivityCollection
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.ConsolidationStrategy
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveActivity_ extends js.Object {
  var Activity: js.UndefOr[ActivityCollection] = js.undefined
  // Create a new instance of ConsolidationStrategy
  def newConsolidationStrategy(): ConsolidationStrategy
  // Create a new instance of Legacy
  def newLegacy(): js.Any
  // Create a new instance of NoConsolidation
  def newNoConsolidation(): js.Any
  // Create a new instance of QueryDriveActivityRequest
  def newQueryDriveActivityRequest(): QueryDriveActivityRequest
}

object DriveActivity_ {
  @scala.inline
  def apply(
    newConsolidationStrategy: () => ConsolidationStrategy,
    newLegacy: () => js.Any,
    newNoConsolidation: () => js.Any,
    newQueryDriveActivityRequest: () => QueryDriveActivityRequest,
    Activity: ActivityCollection = null
  ): DriveActivity_ = {
    val __obj = js.Dynamic.literal(newConsolidationStrategy = js.Any.fromFunction0(newConsolidationStrategy), newLegacy = js.Any.fromFunction0(newLegacy), newNoConsolidation = js.Any.fromFunction0(newNoConsolidation), newQueryDriveActivityRequest = js.Any.fromFunction0(newQueryDriveActivityRequest))
    if (Activity != null) __obj.updateDynamic("Activity")(Activity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveActivity_]
  }
}

