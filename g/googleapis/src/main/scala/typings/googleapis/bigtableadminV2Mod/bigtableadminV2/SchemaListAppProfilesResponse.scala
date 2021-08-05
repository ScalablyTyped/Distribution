package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for BigtableInstanceAdmin.ListAppProfiles.
  */
trait SchemaListAppProfilesResponse extends StObject {
  
  /**
    * The list of requested app profiles.
    */
  var appProfiles: js.UndefOr[js.Array[SchemaAppProfile]] = js.undefined
  
  /**
    * Locations from which AppProfile information could not be retrieved, due
    * to an outage or some other transient condition. AppProfiles from these
    * locations may be missing from `app_profiles`. Values are of the form
    * `projects/&lt;project&gt;/locations/&lt;zone_id&gt;`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Set if not all app profiles could be returned in a single response. Pass
    * this value to `page_token` in another request to get the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAppProfilesResponse {
  
  inline def apply(): SchemaListAppProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAppProfilesResponse]
  }
  
  extension [Self <: SchemaListAppProfilesResponse](x: Self) {
    
    inline def setAppProfiles(value: js.Array[SchemaAppProfile]): Self = StObject.set(x, "appProfiles", value.asInstanceOf[js.Any])
    
    inline def setAppProfilesUndefined: Self = StObject.set(x, "appProfiles", js.undefined)
    
    inline def setAppProfilesVarargs(value: SchemaAppProfile*): Self = StObject.set(x, "appProfiles", js.Array(value :_*))
    
    inline def setFailedLocations(value: js.Array[String]): Self = StObject.set(x, "failedLocations", value.asInstanceOf[js.Any])
    
    inline def setFailedLocationsUndefined: Self = StObject.set(x, "failedLocations", js.undefined)
    
    inline def setFailedLocationsVarargs(value: String*): Self = StObject.set(x, "failedLocations", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
