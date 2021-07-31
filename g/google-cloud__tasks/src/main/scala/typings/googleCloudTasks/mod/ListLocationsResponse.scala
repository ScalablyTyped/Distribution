package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLocationsResponse extends StObject {
  
  var locations: js.Array[Location]
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLocationsResponse {
  
  @scala.inline
  def apply(locations: js.Array[Location]): ListLocationsResponse = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocationsResponse]
  }
  
  @scala.inline
  implicit class ListLocationsResponseMutableBuilder[Self <: ListLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
