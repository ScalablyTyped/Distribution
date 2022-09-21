package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Options for the auth token fetcher.
  */
trait AuthTokenFetcherOptions extends StObject {
  
  /**
    * The auth token context. IDs specified in the context should be added to
    * the request sent to the JSON Web Token minting endpoint.
    */
  var context: AuthTokenContext
  
  /**
    * The Fleet Engine service type.
    */
  var serviceType: FleetEngineServiceType
}
object AuthTokenFetcherOptions {
  
  inline def apply(context: AuthTokenContext, serviceType: FleetEngineServiceType): AuthTokenFetcherOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthTokenFetcherOptions]
  }
  
  extension [Self <: AuthTokenFetcherOptions](x: Self) {
    
    inline def setContext(value: AuthTokenContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setServiceType(value: FleetEngineServiceType): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
  }
}
