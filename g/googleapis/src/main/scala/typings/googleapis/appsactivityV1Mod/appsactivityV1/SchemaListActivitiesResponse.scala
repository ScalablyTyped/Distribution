package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from the list request. Contains a list of activities and a
  * token to retrieve the next page of results.
  */
@js.native
trait SchemaListActivitiesResponse extends js.Object {
  
  /**
    * List of activities.
    */
  var activities: js.UndefOr[js.Array[SchemaActivity]] = js.native
  
  /**
    * Token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListActivitiesResponse {
  
  @scala.inline
  def apply(): SchemaListActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListActivitiesResponse]
  }
  
  @scala.inline
  implicit class SchemaListActivitiesResponseOps[Self <: SchemaListActivitiesResponse] (val x: Self) extends AnyVal {
    
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
    def setActivitiesVarargs(value: SchemaActivity*): Self = this.set("activities", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: js.Array[SchemaActivity]): Self = this.set("activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
