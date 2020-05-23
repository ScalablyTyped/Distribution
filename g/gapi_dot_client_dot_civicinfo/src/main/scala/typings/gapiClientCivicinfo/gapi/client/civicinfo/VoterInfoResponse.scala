package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoterInfoResponse extends js.Object {
  /** Contests that will appear on the voter's ballot. */
  var contests: js.UndefOr[js.Array[Contest]] = js.undefined
  /**
    * Locations where a voter is eligible to drop off a completed ballot. The voter must have received and completed a ballot prior to arriving at the
    * location. The location may not have ballots available on the premises. These locations could be open on or before election day as indicated in the
    * pollingHours field.
    */
  var dropOffLocations: js.UndefOr[js.Array[PollingLocation]] = js.undefined
  /** Locations where the voter is eligible to vote early, prior to election day. */
  var earlyVoteSites: js.UndefOr[js.Array[PollingLocation]] = js.undefined
  /** The election that was queried. */
  var election: js.UndefOr[Election] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#voterInfoResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Specifies whether voters in the precinct vote only by mailing their ballots (with the possible option of dropping off their ballots as well). */
  var mailOnly: js.UndefOr[Boolean] = js.undefined
  /** The normalized version of the requested address */
  var normalizedInput: js.UndefOr[SimpleAddressType] = js.undefined
  /**
    * If no election ID was specified in the query, and there was more than one election with data for the given voter, this will contain information about
    * the other elections that could apply.
    */
  var otherElections: js.UndefOr[js.Array[Election]] = js.undefined
  /** Locations where the voter is eligible to vote on election day. */
  var pollingLocations: js.UndefOr[js.Array[PollingLocation]] = js.undefined
  var precinctId: js.UndefOr[String] = js.undefined
  /** Local Election Information for the state that the voter votes in. For the US, there will only be one element in this array. */
  var state: js.UndefOr[js.Array[AdministrationRegion]] = js.undefined
}

object VoterInfoResponse {
  @scala.inline
  def apply(
    contests: js.Array[Contest] = null,
    dropOffLocations: js.Array[PollingLocation] = null,
    earlyVoteSites: js.Array[PollingLocation] = null,
    election: Election = null,
    kind: String = null,
    mailOnly: js.UndefOr[Boolean] = js.undefined,
    normalizedInput: SimpleAddressType = null,
    otherElections: js.Array[Election] = null,
    pollingLocations: js.Array[PollingLocation] = null,
    precinctId: String = null,
    state: js.Array[AdministrationRegion] = null
  ): VoterInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (contests != null) __obj.updateDynamic("contests")(contests.asInstanceOf[js.Any])
    if (dropOffLocations != null) __obj.updateDynamic("dropOffLocations")(dropOffLocations.asInstanceOf[js.Any])
    if (earlyVoteSites != null) __obj.updateDynamic("earlyVoteSites")(earlyVoteSites.asInstanceOf[js.Any])
    if (election != null) __obj.updateDynamic("election")(election.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(mailOnly)) __obj.updateDynamic("mailOnly")(mailOnly.get.asInstanceOf[js.Any])
    if (normalizedInput != null) __obj.updateDynamic("normalizedInput")(normalizedInput.asInstanceOf[js.Any])
    if (otherElections != null) __obj.updateDynamic("otherElections")(otherElections.asInstanceOf[js.Any])
    if (pollingLocations != null) __obj.updateDynamic("pollingLocations")(pollingLocations.asInstanceOf[js.Any])
    if (precinctId != null) __obj.updateDynamic("precinctId")(precinctId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoterInfoResponse]
  }
}

