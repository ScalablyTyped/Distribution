package typings.fhirDashJsDashClient.FHIRNs

import typings.fhirDashJsDashClient.FHIRNs.SMARTNs.Client
import typings.fhirDashJsDashClient.FHIRNs.SMARTNs.Context
import typings.fhirDashJsDashClient.FHIRNs.SMARTNs.OAuth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FHIR")
@js.native
object ^ extends js.Object {
  /**
    * Property which exposes the OAUth2 specific workflow helpers
    */
  val oauth2: OAuth2 = js.native
  /**
    * Construct the SMART client directly without using the Oauth2 workflow
    * @param context Context required to construct the client.
    */
  def client(context: Context): Client = js.native
}

