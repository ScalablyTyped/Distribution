package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

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
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether voters in the precinct vote only by mailing their ballots (with the possible option of dropping off their ballots as well). */
  var mailOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** The normalized version of the requested address */
  var normalizedInput: js.UndefOr[SimpleAddressType] = js.undefined
  /**
               * If no election ID was specified in the query, and there was more than one election with data for the given voter, this will contain information about
               * the other elections that could apply.
               */
  var otherElections: js.UndefOr[js.Array[Election]] = js.undefined
  /** Locations where the voter is eligible to vote on election day. */
  var pollingLocations: js.UndefOr[js.Array[PollingLocation]] = js.undefined
  var precinctId: js.UndefOr[java.lang.String] = js.undefined
  /** Local Election Information for the state that the voter votes in. For the US, there will only be one element in this array. */
  var state: js.UndefOr[js.Array[AdministrationRegion]] = js.undefined
}

