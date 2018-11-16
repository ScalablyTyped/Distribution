package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ElectionsResource extends js.Object {
  /** List of available elections to query. */
  def electionQuery(request: gapiDotClientDotCivicinfoLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ElectionsQueryResponse]
  /** Looks up information relevant to a voter based on the voter's registered address. */
  def voterInfoQuery(request: gapiDotClientDotCivicinfoLib.Anon_ReturnAllAvailableData): gapiDotClientLib.gapiNs.clientNs.Request[VoterInfoResponse]
}

