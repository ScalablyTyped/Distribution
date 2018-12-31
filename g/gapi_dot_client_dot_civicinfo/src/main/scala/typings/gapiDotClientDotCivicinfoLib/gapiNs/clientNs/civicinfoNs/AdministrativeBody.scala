package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdministrativeBody extends js.Object {
  /** A URL provided by this administrative body for information on absentee voting. */
  var absenteeVotingInfoUrl: js.UndefOr[java.lang.String] = js.undefined
  var addressLines: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A URL provided by this administrative body to give contest information to the voter. */
  var ballotInfoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The mailing address of this administrative body. */
  var correspondenceAddress: js.UndefOr[SimpleAddressType] = js.undefined
  /** A URL provided by this administrative body for looking up general election information. */
  var electionInfoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The election officials for this election administrative body. */
  var electionOfficials: js.UndefOr[js.Array[ElectionOfficial]] = js.undefined
  /** A URL provided by this administrative body for confirming that the voter is registered to vote. */
  var electionRegistrationConfirmationUrl: js.UndefOr[java.lang.String] = js.undefined
  /** A URL provided by this administrative body for looking up how to register to vote. */
  var electionRegistrationUrl: js.UndefOr[java.lang.String] = js.undefined
  /** A URL provided by this administrative body describing election rules to the voter. */
  var electionRulesUrl: js.UndefOr[java.lang.String] = js.undefined
  /** A description of the hours of operation for this administrative body. */
  var hoursOfOperation: js.UndefOr[java.lang.String] = js.undefined
  /** The name of this election administrative body. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The physical address of this administrative body. */
  var physicalAddress: js.UndefOr[SimpleAddressType] = js.undefined
  /** A description of the services this administrative body may provide. */
  var voter_services: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A URL provided by this administrative body for looking up where to vote. */
  var votingLocationFinderUrl: js.UndefOr[java.lang.String] = js.undefined
}

