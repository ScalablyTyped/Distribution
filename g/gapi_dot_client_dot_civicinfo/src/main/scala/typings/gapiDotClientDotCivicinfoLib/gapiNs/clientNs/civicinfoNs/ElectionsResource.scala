package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectionsResource extends js.Object {
  /** List of available elections to query. */
  def electionQuery(request: gapiDotClientDotCivicinfoLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ElectionsQueryResponse]
  /** Looks up information relevant to a voter based on the voter's registered address. */
  def voterInfoQuery(request: gapiDotClientDotCivicinfoLib.Anon_Address): gapiDotClientLib.gapiNs.clientNs.Request[VoterInfoResponse]
}

object ElectionsResource {
  @scala.inline
  def apply(
    electionQuery: gapiDotClientDotCivicinfoLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[ElectionsQueryResponse],
    voterInfoQuery: gapiDotClientDotCivicinfoLib.Anon_Address => gapiDotClientLib.gapiNs.clientNs.Request[VoterInfoResponse]
  ): ElectionsResource = {
    val __obj = js.Dynamic.literal(electionQuery = js.Any.fromFunction1(electionQuery), voterInfoQuery = js.Any.fromFunction1(voterInfoQuery))
  
    __obj.asInstanceOf[ElectionsResource]
  }
}

