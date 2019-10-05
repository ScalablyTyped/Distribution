package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityCollection extends js.Object {
  // Query past activity in Google Drive.
  def query(resource: QueryDriveActivityRequest): QueryDriveActivityResponse
}

object ActivityCollection {
  @scala.inline
  def apply(query: QueryDriveActivityRequest => QueryDriveActivityResponse): ActivityCollection = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[ActivityCollection]
  }
}

