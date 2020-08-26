package typings.gapiClientCivicinfo.gapi.client.civicinfo

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCivicinfo.anon.Address
import typings.gapiClientCivicinfo.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectionsResource extends js.Object {
  /** List of available elections to query. */
  def electionQuery(request: Fields): Request[ElectionsQueryResponse] = js.native
  /** Looks up information relevant to a voter based on the voter's registered address. */
  def voterInfoQuery(request: Address): Request[VoterInfoResponse] = js.native
}

object ElectionsResource {
  @scala.inline
  def apply(
    electionQuery: Fields => Request[ElectionsQueryResponse],
    voterInfoQuery: Address => Request[VoterInfoResponse]
  ): ElectionsResource = {
    val __obj = js.Dynamic.literal(electionQuery = js.Any.fromFunction1(electionQuery), voterInfoQuery = js.Any.fromFunction1(voterInfoQuery))
    __obj.asInstanceOf[ElectionsResource]
  }
  @scala.inline
  implicit class ElectionsResourceOps[Self <: ElectionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElectionQuery(value: Fields => Request[ElectionsQueryResponse]): Self = this.set("electionQuery", js.Any.fromFunction1(value))
    @scala.inline
    def setVoterInfoQuery(value: Address => Request[VoterInfoResponse]): Self = this.set("voterInfoQuery", js.Any.fromFunction1(value))
  }
  
}

