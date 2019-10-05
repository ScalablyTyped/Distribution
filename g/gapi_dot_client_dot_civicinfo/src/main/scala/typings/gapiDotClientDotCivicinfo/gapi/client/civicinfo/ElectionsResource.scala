package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCivicinfo.Anon_Address
import typings.gapiDotClientDotCivicinfo.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectionsResource extends js.Object {
  /** List of available elections to query. */
  def electionQuery(request: Anon_AltFields): Request[ElectionsQueryResponse]
  /** Looks up information relevant to a voter based on the voter's registered address. */
  def voterInfoQuery(request: Anon_Address): Request[VoterInfoResponse]
}

object ElectionsResource {
  @scala.inline
  def apply(
    electionQuery: Anon_AltFields => Request[ElectionsQueryResponse],
    voterInfoQuery: Anon_Address => Request[VoterInfoResponse]
  ): ElectionsResource = {
    val __obj = js.Dynamic.literal(electionQuery = js.Any.fromFunction1(electionQuery), voterInfoQuery = js.Any.fromFunction1(voterInfoQuery))
  
    __obj.asInstanceOf[ElectionsResource]
  }
}

