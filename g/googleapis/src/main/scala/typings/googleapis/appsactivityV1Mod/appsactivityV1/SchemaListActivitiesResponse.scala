package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from the list request. Contains a list of activities and a
  * token to retrieve the next page of results.
  */
@js.native
trait SchemaListActivitiesResponse extends StObject {
  
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
  implicit class SchemaListActivitiesResponseMutableBuilder[Self <: SchemaListActivitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: js.Array[SchemaActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: SchemaActivity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
