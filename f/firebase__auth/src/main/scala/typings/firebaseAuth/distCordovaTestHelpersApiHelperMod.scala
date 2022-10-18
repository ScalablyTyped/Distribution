package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcApiMod.Endpoint
import typings.firebaseAuth.distCordovaTestHelpersMockFetchMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaTestHelpersApiHelperMod {
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/api/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointUrl(endpoint: Endpoint): String = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointUrl")(endpoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mockEndpoint(endpoint: Endpoint, response: js.Object): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("mockEndpoint")(endpoint.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def mockEndpoint(endpoint: Endpoint, response: js.Object, status: Double): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("mockEndpoint")(endpoint.asInstanceOf[js.Any], response.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Route]
}
