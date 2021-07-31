package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMARTClient
  extends StObject
     with Client {
  
  /**
    * Method to add the authorization headers based on the type of authorization Basic or Authorization
    * @param input
    * Returns: The object populated with Authorization header
    */
  def authenticated(input: js.Any): js.Any = js.native
  
  /**
    * OAuth2 configuration used in context
    */
  var state: OAuth2Configuration = js.native
  
  /**
    * OAuth2 Access Token response
    */
  var tokenResponse: js.UndefOr[js.Any] = js.native
}
