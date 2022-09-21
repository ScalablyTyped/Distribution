package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaListAppConnectorsResponse extends StObject {
  
  /**
    * A list of BeyondCorp AppConnectors in the project.
    */
  var appConnectors: js.UndefOr[js.Array[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnector]] = js.undefined
  
  /**
    * A token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaListAppConnectorsResponse {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaListAppConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaListAppConnectorsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaListAppConnectorsResponse](x: Self) {
    
    inline def setAppConnectors(value: js.Array[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnector]): Self = StObject.set(x, "appConnectors", value.asInstanceOf[js.Any])
    
    inline def setAppConnectorsUndefined: Self = StObject.set(x, "appConnectors", js.undefined)
    
    inline def setAppConnectorsVarargs(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnector*): Self = StObject.set(x, "appConnectors", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
