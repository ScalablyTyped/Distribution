package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable2
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.grpcMod.GrpcClient
import typings.googleGax.locationServiceMod.LocationsClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLocationsClient
  extends StObject
     with Instantiable2[/* gaxGrpc */ GrpcClient, /* opts */ ClientOptions, LocationsClient] {
  
  /**
    * The DNS address for this API service - same as servicePath(),
    * exists for compatibility reasons.
    * @returns {string} The DNS address for this service.
    */
  def apiEndpoint: String = js.native
  
  /**
    * The port for this API service.
    * @returns {number} The default port for this service.
    */
  def port: Double = js.native
  
  /**
    * The scopes needed to make gRPC calls for every method defined
    * in this service.
    * @returns {string[]} List of default scopes.
    */
  def scopes: js.Array[String] = js.native
  
  /**
    * The DNS address for this API service.
    * @returns {string} The DNS address for this service.
    */
  def servicePath: String = js.native
}
