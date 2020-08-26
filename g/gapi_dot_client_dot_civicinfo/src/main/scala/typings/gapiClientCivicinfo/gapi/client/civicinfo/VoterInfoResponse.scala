package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoterInfoResponse extends js.Object {
  /** Contests that will appear on the voter's ballot. */
  var contests: js.UndefOr[js.Array[Contest]] = js.native
  /**
    * Locations where a voter is eligible to drop off a completed ballot. The voter must have received and completed a ballot prior to arriving at the
    * location. The location may not have ballots available on the premises. These locations could be open on or before election day as indicated in the
    * pollingHours field.
    */
  var dropOffLocations: js.UndefOr[js.Array[PollingLocation]] = js.native
  /** Locations where the voter is eligible to vote early, prior to election day. */
  var earlyVoteSites: js.UndefOr[js.Array[PollingLocation]] = js.native
  /** The election that was queried. */
  var election: js.UndefOr[Election] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#voterInfoResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Specifies whether voters in the precinct vote only by mailing their ballots (with the possible option of dropping off their ballots as well). */
  var mailOnly: js.UndefOr[Boolean] = js.native
  /** The normalized version of the requested address */
  var normalizedInput: js.UndefOr[SimpleAddressType] = js.native
  /**
    * If no election ID was specified in the query, and there was more than one election with data for the given voter, this will contain information about
    * the other elections that could apply.
    */
  var otherElections: js.UndefOr[js.Array[Election]] = js.native
  /** Locations where the voter is eligible to vote on election day. */
  var pollingLocations: js.UndefOr[js.Array[PollingLocation]] = js.native
  var precinctId: js.UndefOr[String] = js.native
  /** Local Election Information for the state that the voter votes in. For the US, there will only be one element in this array. */
  var state: js.UndefOr[js.Array[AdministrationRegion]] = js.native
}

object VoterInfoResponse {
  @scala.inline
  def apply(): VoterInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoterInfoResponse]
  }
  @scala.inline
  implicit class VoterInfoResponseOps[Self <: VoterInfoResponse] (val x: Self) extends AnyVal {
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
    def setContestsVarargs(value: Contest*): Self = this.set("contests", js.Array(value :_*))
    @scala.inline
    def setContests(value: js.Array[Contest]): Self = this.set("contests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContests: Self = this.set("contests", js.undefined)
    @scala.inline
    def setDropOffLocationsVarargs(value: PollingLocation*): Self = this.set("dropOffLocations", js.Array(value :_*))
    @scala.inline
    def setDropOffLocations(value: js.Array[PollingLocation]): Self = this.set("dropOffLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropOffLocations: Self = this.set("dropOffLocations", js.undefined)
    @scala.inline
    def setEarlyVoteSitesVarargs(value: PollingLocation*): Self = this.set("earlyVoteSites", js.Array(value :_*))
    @scala.inline
    def setEarlyVoteSites(value: js.Array[PollingLocation]): Self = this.set("earlyVoteSites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEarlyVoteSites: Self = this.set("earlyVoteSites", js.undefined)
    @scala.inline
    def setElection(value: Election): Self = this.set("election", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElection: Self = this.set("election", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMailOnly(value: Boolean): Self = this.set("mailOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailOnly: Self = this.set("mailOnly", js.undefined)
    @scala.inline
    def setNormalizedInput(value: SimpleAddressType): Self = this.set("normalizedInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizedInput: Self = this.set("normalizedInput", js.undefined)
    @scala.inline
    def setOtherElectionsVarargs(value: Election*): Self = this.set("otherElections", js.Array(value :_*))
    @scala.inline
    def setOtherElections(value: js.Array[Election]): Self = this.set("otherElections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherElections: Self = this.set("otherElections", js.undefined)
    @scala.inline
    def setPollingLocationsVarargs(value: PollingLocation*): Self = this.set("pollingLocations", js.Array(value :_*))
    @scala.inline
    def setPollingLocations(value: js.Array[PollingLocation]): Self = this.set("pollingLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingLocations: Self = this.set("pollingLocations", js.undefined)
    @scala.inline
    def setPrecinctId(value: String): Self = this.set("precinctId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecinctId: Self = this.set("precinctId", js.undefined)
    @scala.inline
    def setStateVarargs(value: AdministrationRegion*): Self = this.set("state", js.Array(value :_*))
    @scala.inline
    def setState(value: js.Array[AdministrationRegion]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

