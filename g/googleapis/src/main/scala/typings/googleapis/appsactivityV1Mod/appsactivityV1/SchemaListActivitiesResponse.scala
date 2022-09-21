package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListActivitiesResponse extends StObject {
  
  /**
    * List of activities.
    */
  var activities: js.UndefOr[js.Array[SchemaActivity]] = js.undefined
  
  /**
    * Token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListActivitiesResponse {
  
  inline def apply(): SchemaListActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListActivitiesResponse]
  }
  
  extension [Self <: SchemaListActivitiesResponse](x: Self) {
    
    inline def setActivities(value: js.Array[SchemaActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setActivitiesVarargs(value: SchemaActivity*): Self = StObject.set(x, "activities", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
