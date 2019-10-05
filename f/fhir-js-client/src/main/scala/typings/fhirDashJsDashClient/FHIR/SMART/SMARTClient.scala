package typings.fhirDashJsDashClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMARTClient extends Client {
  /**
    * OAuth2 configuration used in context
    */
  var state: OAuth2Configuration = js.native
  /**
    * OAuth2 Access Token response
    */
  var tokenResponse: js.UndefOr[js.Any] = js.native
  /**
    * Method to add the authorization headers based on the type of authorization Basic or Authorization
    * @param input
    * Returns: The object populated with Authorization header
    */
  def authenticated(input: js.Any): js.Any = js.native
}

