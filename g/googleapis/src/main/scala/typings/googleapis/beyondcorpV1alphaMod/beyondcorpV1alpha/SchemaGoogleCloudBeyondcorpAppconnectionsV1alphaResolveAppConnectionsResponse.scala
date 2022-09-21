package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaResolveAppConnectionsResponse extends StObject {
  
  /**
    * A list of BeyondCorp AppConnections with details in the project.
    */
  var appConnectionDetails: js.UndefOr[
    js.Array[
      SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaResolveAppConnectionsResponseAppConnectionDetails
    ]
  ] = js.undefined
  
  /**
    * A token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaResolveAppConnectionsResponse {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaResolveAppConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaResolveAppConnectionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaResolveAppConnectionsResponse](x: Self) {
    
    inline def setAppConnectionDetails(
      value: js.Array[
          SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaResolveAppConnectionsResponseAppConnectionDetails
        ]
    ): Self = StObject.set(x, "appConnectionDetails", value.asInstanceOf[js.Any])
    
    inline def setAppConnectionDetailsUndefined: Self = StObject.set(x, "appConnectionDetails", js.undefined)
    
    inline def setAppConnectionDetailsVarargs(
      value: SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaResolveAppConnectionsResponseAppConnectionDetails*
    ): Self = StObject.set(x, "appConnectionDetails", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
