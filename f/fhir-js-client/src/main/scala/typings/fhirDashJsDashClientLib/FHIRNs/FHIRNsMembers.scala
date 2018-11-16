package typings
package fhirDashJsDashClientLib.FHIRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FHIR")
@js.native
object FHIRNsMembers extends js.Object {
  /**
       * Property which exposes the OAUth2 specific workflow helpers
       */
  val oauth2: fhirDashJsDashClientLib.FHIRNs.SMARTNs.OAuth2 = js.native
  /**
       * Construct the SMART client directly without using the Oauth2 workflow
       * @param context Context required to construct the client.
       */
  def client(context: fhirDashJsDashClientLib.FHIRNs.SMARTNs.Context): fhirDashJsDashClientLib.FHIRNs.SMARTNs.Client = js.native
}

