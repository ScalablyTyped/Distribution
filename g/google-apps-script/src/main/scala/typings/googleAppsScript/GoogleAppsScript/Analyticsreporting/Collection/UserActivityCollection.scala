package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityRequest
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserActivityCollection extends js.Object {
  
  // Returns User Activity data.
  def search(resource: SearchUserActivityRequest): SearchUserActivityResponse = js.native
}
object UserActivityCollection {
  
  @scala.inline
  def apply(search: SearchUserActivityRequest => SearchUserActivityResponse): UserActivityCollection = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[UserActivityCollection]
  }
  
  @scala.inline
  implicit class UserActivityCollectionOps[Self <: UserActivityCollection] (val x: Self) extends AnyVal {
    
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
    def setSearch(value: SearchUserActivityRequest => SearchUserActivityResponse): Self = this.set("search", js.Any.fromFunction1(value))
  }
}
