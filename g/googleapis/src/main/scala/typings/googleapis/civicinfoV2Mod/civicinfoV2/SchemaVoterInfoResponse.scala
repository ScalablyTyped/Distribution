package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a voter info lookup query.
  */
@js.native
trait SchemaVoterInfoResponse extends js.Object {
  /**
    * Contests that will appear on the voter&#39;s ballot.
    */
  var contests: js.UndefOr[js.Array[SchemaContest]] = js.native
  /**
    * Locations where a voter is eligible to drop off a completed ballot. The
    * voter must have received and completed a ballot prior to arriving at the
    * location. The location may not have ballots available on the premises.
    * These locations could be open on or before election day as indicated in
    * the pollingHours field.
    */
  var dropOffLocations: js.UndefOr[js.Array[SchemaPollingLocation]] = js.native
  /**
    * Locations where the voter is eligible to vote early, prior to election
    * day.
    */
  var earlyVoteSites: js.UndefOr[js.Array[SchemaPollingLocation]] = js.native
  /**
    * The election that was queried.
    */
  var election: js.UndefOr[SchemaElection] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#voterInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Specifies whether voters in the precinct vote only by mailing their
    * ballots (with the possible option of dropping off their ballots as well).
    */
  var mailOnly: js.UndefOr[Boolean] = js.native
  /**
    * The normalized version of the requested address
    */
  var normalizedInput: js.UndefOr[SchemaSimpleAddressType] = js.native
  /**
    * When there are multiple elections for a voter address, the otherElections
    * field is populated in the API response and there are two
    * possibilities: 1. If the earliest election is not the intended election,
    * specify the election ID of the desired election in a second API request
    * using the electionId field. 2. If these elections occur on the same day,
    * the API doesn?t return any polling location, contest, or election
    * official information to ensure that an additional query is made. For
    * user-facing applications, we recommend displaying these elections to the
    * user to disambiguate. A second API request using the electionId field
    * should be made for the election that is relevant to the user.
    */
  var otherElections: js.UndefOr[js.Array[SchemaElection]] = js.native
  /**
    * Locations where the voter is eligible to vote on election day.
    */
  var pollingLocations: js.UndefOr[js.Array[SchemaPollingLocation]] = js.native
  var precinctId: js.UndefOr[String] = js.native
  var segments: js.UndefOr[js.Array[SchemaStreetSegment]] = js.native
  /**
    * Local Election Information for the state that the voter votes in. For the
    * US, there will only be one element in this array.
    */
  var state: js.UndefOr[js.Array[SchemaAdministrationRegion]] = js.native
}

object SchemaVoterInfoResponse {
  @scala.inline
  def apply(): SchemaVoterInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoterInfoResponse]
  }
  @scala.inline
  implicit class SchemaVoterInfoResponseOps[Self <: SchemaVoterInfoResponse] (val x: Self) extends AnyVal {
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
    def setContestsVarargs(value: SchemaContest*): Self = this.set("contests", js.Array(value :_*))
    @scala.inline
    def setContests(value: js.Array[SchemaContest]): Self = this.set("contests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContests: Self = this.set("contests", js.undefined)
    @scala.inline
    def setDropOffLocationsVarargs(value: SchemaPollingLocation*): Self = this.set("dropOffLocations", js.Array(value :_*))
    @scala.inline
    def setDropOffLocations(value: js.Array[SchemaPollingLocation]): Self = this.set("dropOffLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropOffLocations: Self = this.set("dropOffLocations", js.undefined)
    @scala.inline
    def setEarlyVoteSitesVarargs(value: SchemaPollingLocation*): Self = this.set("earlyVoteSites", js.Array(value :_*))
    @scala.inline
    def setEarlyVoteSites(value: js.Array[SchemaPollingLocation]): Self = this.set("earlyVoteSites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEarlyVoteSites: Self = this.set("earlyVoteSites", js.undefined)
    @scala.inline
    def setElection(value: SchemaElection): Self = this.set("election", value.asInstanceOf[js.Any])
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
    def setNormalizedInput(value: SchemaSimpleAddressType): Self = this.set("normalizedInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizedInput: Self = this.set("normalizedInput", js.undefined)
    @scala.inline
    def setOtherElectionsVarargs(value: SchemaElection*): Self = this.set("otherElections", js.Array(value :_*))
    @scala.inline
    def setOtherElections(value: js.Array[SchemaElection]): Self = this.set("otherElections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherElections: Self = this.set("otherElections", js.undefined)
    @scala.inline
    def setPollingLocationsVarargs(value: SchemaPollingLocation*): Self = this.set("pollingLocations", js.Array(value :_*))
    @scala.inline
    def setPollingLocations(value: js.Array[SchemaPollingLocation]): Self = this.set("pollingLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingLocations: Self = this.set("pollingLocations", js.undefined)
    @scala.inline
    def setPrecinctId(value: String): Self = this.set("precinctId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecinctId: Self = this.set("precinctId", js.undefined)
    @scala.inline
    def setSegmentsVarargs(value: SchemaStreetSegment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[SchemaStreetSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    @scala.inline
    def setStateVarargs(value: SchemaAdministrationRegion*): Self = this.set("state", js.Array(value :_*))
    @scala.inline
    def setState(value: js.Array[SchemaAdministrationRegion]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

