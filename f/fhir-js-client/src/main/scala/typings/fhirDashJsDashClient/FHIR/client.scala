package typings.fhirDashJsDashClient.FHIR

import typings.fhirDashJsDashClient.FHIR.SMART.Client
import typings.fhirDashJsDashClient.FHIR.SMART.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FHIR.client")
@js.native
object client extends js.Object {
  /**
    * Construct the SMART client directly without using the Oauth2 workflow
    * @param context Context required to construct the client.
    */
  def apply(context: Context): Client = js.native
}

