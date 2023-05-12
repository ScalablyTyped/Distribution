package typings.firebaseAuth

import typings.firebaseAuth.distEsm5SrcApiMod.Endpoint
import typings.firebaseAuth.distEsm5TestHelpersMockFetchMod.Route
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5TestHelpersApiHelperMod {
  
  @JSImport("@firebase/auth/dist/esm5/test/helpers/api/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointUrl(endpoint: Endpoint): String = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointUrl")(endpoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def endpointUrlWithParams(endpoint: Endpoint, params: Record[String, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointUrlWithParams")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mockEndpoint(endpoint: Endpoint, response: js.Object): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("mockEndpoint")(endpoint.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def mockEndpoint(endpoint: Endpoint, response: js.Object, status: Double): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("mockEndpoint")(endpoint.asInstanceOf[js.Any], response.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Route]
  
  inline def mockEndpointWithParams(endpoint: Endpoint, params: Record[String, Any], response: js.Object): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("mockEndpointWithParams")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def mockEndpointWithParams(endpoint: Endpoint, params: Record[String, Any], response: js.Object, status: Double): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("mockEndpointWithParams")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any], response.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Route]
}
