package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable2
import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import typings.googleGax.buildSrcGrpcMod.GrpcClient
import typings.googleGax.buildSrcIamServiceMod.IamClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIamClient
  extends StObject
     with Instantiable2[/* gaxGrpc */ GrpcClient, /* options */ ClientOptions, IamClient] {
  
  /**
    * The DNS address for this API service - same as servicePath(),
    * exists for compatibility reasons.
    */
  def apiEndpoint: String = js.native
  
  /**
    * The port for this API service.
    */
  def port: Double = js.native
  
  /**
    * The scopes needed to make gRPC calls for every method defined
    * in this service.
    */
  def scopes: js.Array[String] = js.native
  
  /**
    * The DNS address for this API service.
    */
  def servicePath: String = js.native
}
