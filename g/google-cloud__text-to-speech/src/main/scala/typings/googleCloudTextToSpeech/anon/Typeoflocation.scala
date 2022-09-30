package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.GetLocationRequest
import typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.ListLocationsRequest
import typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.ListLocationsResponse
import typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.Location
import typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.Locations
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflocation extends StObject {
  
  /** Represents a GetLocationRequest. */
  var GetLocationRequest: (Instantiable0[
    typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.GetLocationRequest
  ]) & TypeofGetLocationRequest
  
  /** Represents a ListLocationsRequest. */
  var ListLocationsRequest: (Instantiable0[
    typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.ListLocationsRequest
  ]) & TypeofListLocationsReques
  
  /** Represents a ListLocationsResponse. */
  var ListLocationsResponse: (Instantiable0[
    typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.ListLocationsResponse
  ]) & TypeofListLocationsRespon
  
  /** Represents a Location. */
  var Location: Instantiable0[typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.Location] & TypeofLocationDecode
  
  /** Represents a Locations */
  var Locations: (Instantiable1[
    /* rpcImpl */ RPCImpl, 
    typings.googleGax.mod.fallback.LocationProtos.google.cloud.location.Locations
  ]) & TypeofLocations
}
object Typeoflocation {
  
  inline def apply(
    GetLocationRequest: Instantiable0[GetLocationRequest] & TypeofGetLocationRequest,
    ListLocationsRequest: Instantiable0[ListLocationsRequest] & TypeofListLocationsReques,
    ListLocationsResponse: Instantiable0[ListLocationsResponse] & TypeofListLocationsRespon,
    Location: Instantiable0[Location] & TypeofLocationDecode,
    Locations: (Instantiable1[/* rpcImpl */ RPCImpl, Locations]) & TypeofLocations
  ): Typeoflocation = {
    val __obj = js.Dynamic.literal(GetLocationRequest = GetLocationRequest.asInstanceOf[js.Any], ListLocationsRequest = ListLocationsRequest.asInstanceOf[js.Any], ListLocationsResponse = ListLocationsResponse.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Locations = Locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflocation]
  }
  
  extension [Self <: Typeoflocation](x: Self) {
    
    inline def setGetLocationRequest(value: Instantiable0[GetLocationRequest] & TypeofGetLocationRequest): Self = StObject.set(x, "GetLocationRequest", value.asInstanceOf[js.Any])
    
    inline def setListLocationsRequest(value: Instantiable0[ListLocationsRequest] & TypeofListLocationsReques): Self = StObject.set(x, "ListLocationsRequest", value.asInstanceOf[js.Any])
    
    inline def setListLocationsResponse(value: Instantiable0[ListLocationsResponse] & TypeofListLocationsRespon): Self = StObject.set(x, "ListLocationsResponse", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Instantiable0[Location] & TypeofLocationDecode): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: (Instantiable1[/* rpcImpl */ RPCImpl, Locations]) & TypeofLocations): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
  }
}
