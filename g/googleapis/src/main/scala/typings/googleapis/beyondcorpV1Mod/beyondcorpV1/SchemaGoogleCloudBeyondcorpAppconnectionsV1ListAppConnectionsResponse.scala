package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectionsV1ListAppConnectionsResponse extends StObject {
  
  /**
    * A list of BeyondCorp AppConnections in the project.
    */
  var appConnections: js.UndefOr[js.Array[SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnection]] = js.undefined
  
  /**
    * A token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectionsV1ListAppConnectionsResponse {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectionsV1ListAppConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectionsV1ListAppConnectionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectionsV1ListAppConnectionsResponse](x: Self) {
    
    inline def setAppConnections(value: js.Array[SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnection]): Self = StObject.set(x, "appConnections", value.asInstanceOf[js.Any])
    
    inline def setAppConnectionsUndefined: Self = StObject.set(x, "appConnections", js.undefined)
    
    inline def setAppConnectionsVarargs(value: SchemaGoogleCloudBeyondcorpAppconnectionsV1AppConnection*): Self = StObject.set(x, "appConnections", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
