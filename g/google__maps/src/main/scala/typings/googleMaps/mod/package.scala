package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient(options: typings.googleMaps.mod.CreateClientOptions): typings.googleMaps.mod.GoogleMapsClient = typings.googleMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleMaps.mod.GoogleMapsClient]
inline def createClient(options: typings.googleMaps.mod.CreateClientOptionsWithPromise): typings.googleMaps.mod.GoogleMapsClientWithPromise = typings.googleMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleMaps.mod.GoogleMapsClientWithPromise]

type GoogleMapsClientEndpoint[Request, Response] = js.Function2[
/* query */ Request, 
/* callback */ js.UndefOr[typings.googleMaps.mod.ResponseCallback[Response]], 
typings.googleMaps.mod.RequestHandle[Response]]

type GoogleMapsClientEndpointWithPromise[Request, Response] = js.Function2[
/* query */ Request, 
/* callback */ js.UndefOr[typings.googleMaps.mod.ResponseCallback[Response]], 
typings.googleMaps.mod.RequestHandleWithPromise[Response]]

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.mod.LatLngArray
  - typings.googleMaps.mod.LatLngString
  - typings.googleMaps.mod.LatLngLiteral
  - typings.googleMaps.mod.LatLngLiteralVerbose
*/
type LatLng = typings.googleMaps.mod._LatLng | typings.googleMaps.mod.LatLngArray | typings.googleMaps.mod.LatLngString

type LatLngArray = js.Tuple2[scala.Double, scala.Double]

type LatLngString = java.lang.String

type PlaceDetailsAddressComponentType = typings.googleMaps.googleMapsStrings.street_number

type PlacePhotoResponse = java.lang.String

type ResponseCallback[T] = js.Function2[
/* err */ typings.googleMaps.googleMapsStrings.timeout | typings.googleMaps.mod.ClientResponse[T], 
/* response */ typings.googleMaps.mod.ClientResponse[T], 
scala.Unit]

type ReverseGeocodingResponse = typings.googleMaps.mod.GeocodingResponse[typings.googleMaps.mod.ReverseGeocodingResponseStatus]
