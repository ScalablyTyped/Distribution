package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a voter info lookup query.
  */
@js.native
trait Schema$VoterInfoResponse extends js.Object {
  /**
    * Contests that will appear on the voter&#39;s ballot.
    */
  var contests: js.UndefOr[js.Array[Schema$Contest]] = js.native
  /**
    * Locations where a voter is eligible to drop off a completed ballot. The
    * voter must have received and completed a ballot prior to arriving at the
    * location. The location may not have ballots available on the premises.
    * These locations could be open on or before election day as indicated in
    * the pollingHours field.
    */
  var dropOffLocations: js.UndefOr[js.Array[Schema$PollingLocation]] = js.native
  /**
    * Locations where the voter is eligible to vote early, prior to election
    * day.
    */
  var earlyVoteSites: js.UndefOr[js.Array[Schema$PollingLocation]] = js.native
  /**
    * The election that was queried.
    */
  var election: js.UndefOr[Schema$Election] = js.native
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
  var normalizedInput: js.UndefOr[Schema$SimpleAddressType] = js.native
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
  var otherElections: js.UndefOr[js.Array[Schema$Election]] = js.native
  /**
    * Locations where the voter is eligible to vote on election day.
    */
  var pollingLocations: js.UndefOr[js.Array[Schema$PollingLocation]] = js.native
  var precinctId: js.UndefOr[String] = js.native
  var segments: js.UndefOr[js.Array[Schema$StreetSegment]] = js.native
  /**
    * Local Election Information for the state that the voter votes in. For the
    * US, there will only be one element in this array.
    */
  var state: js.UndefOr[js.Array[Schema$AdministrationRegion]] = js.native
}

object Schema$VoterInfoResponse {
  @scala.inline
  def apply(
    contests: js.Array[Schema$Contest] = null,
    dropOffLocations: js.Array[Schema$PollingLocation] = null,
    earlyVoteSites: js.Array[Schema$PollingLocation] = null,
    election: Schema$Election = null,
    kind: String = null,
    mailOnly: js.UndefOr[Boolean] = js.undefined,
    normalizedInput: Schema$SimpleAddressType = null,
    otherElections: js.Array[Schema$Election] = null,
    pollingLocations: js.Array[Schema$PollingLocation] = null,
    precinctId: String = null,
    segments: js.Array[Schema$StreetSegment] = null,
    state: js.Array[Schema$AdministrationRegion] = null
  ): Schema$VoterInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (contests != null) __obj.updateDynamic("contests")(contests.asInstanceOf[js.Any])
    if (dropOffLocations != null) __obj.updateDynamic("dropOffLocations")(dropOffLocations.asInstanceOf[js.Any])
    if (earlyVoteSites != null) __obj.updateDynamic("earlyVoteSites")(earlyVoteSites.asInstanceOf[js.Any])
    if (election != null) __obj.updateDynamic("election")(election.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(mailOnly)) __obj.updateDynamic("mailOnly")(mailOnly.asInstanceOf[js.Any])
    if (normalizedInput != null) __obj.updateDynamic("normalizedInput")(normalizedInput.asInstanceOf[js.Any])
    if (otherElections != null) __obj.updateDynamic("otherElections")(otherElections.asInstanceOf[js.Any])
    if (pollingLocations != null) __obj.updateDynamic("pollingLocations")(pollingLocations.asInstanceOf[js.Any])
    if (precinctId != null) __obj.updateDynamic("precinctId")(precinctId.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VoterInfoResponse]
  }
}

