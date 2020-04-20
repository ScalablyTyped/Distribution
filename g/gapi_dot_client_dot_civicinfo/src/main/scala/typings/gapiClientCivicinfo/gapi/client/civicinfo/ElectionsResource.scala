package typings.gapiClientCivicinfo.gapi.client.civicinfo

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCivicinfo.AnonAddress
import typings.gapiClientCivicinfo.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectionsResource extends js.Object {
  /** List of available elections to query. */
  def electionQuery(request: AnonFields): Request_[ElectionsQueryResponse]
  /** Looks up information relevant to a voter based on the voter's registered address. */
  def voterInfoQuery(request: AnonAddress): Request_[VoterInfoResponse]
}

object ElectionsResource {
  @scala.inline
  def apply(
    electionQuery: AnonFields => Request_[ElectionsQueryResponse],
    voterInfoQuery: AnonAddress => Request_[VoterInfoResponse]
  ): ElectionsResource = {
    val __obj = js.Dynamic.literal(electionQuery = js.Any.fromFunction1(electionQuery), voterInfoQuery = js.Any.fromFunction1(voterInfoQuery))
    __obj.asInstanceOf[ElectionsResource]
  }
}

