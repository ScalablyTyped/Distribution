package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Collection

import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityCollection extends js.Object {
  
  // Query past activity in Google Drive.
  def query(resource: QueryDriveActivityRequest): QueryDriveActivityResponse = js.native
}
object ActivityCollection {
  
  @scala.inline
  def apply(query: QueryDriveActivityRequest => QueryDriveActivityResponse): ActivityCollection = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[ActivityCollection]
  }
  
  @scala.inline
  implicit class ActivityCollectionOps[Self <: ActivityCollection] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: QueryDriveActivityRequest => QueryDriveActivityResponse): Self = this.set("query", js.Any.fromFunction1(value))
  }
}
