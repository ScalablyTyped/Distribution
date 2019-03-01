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

object AdministrativeBody {
  @scala.inline
  def apply(
    absenteeVotingInfoUrl: java.lang.String = null,
    addressLines: js.Array[java.lang.String] = null,
    ballotInfoUrl: java.lang.String = null,
    correspondenceAddress: SimpleAddressType = null,
    electionInfoUrl: java.lang.String = null,
    electionOfficials: js.Array[ElectionOfficial] = null,
    electionRegistrationConfirmationUrl: java.lang.String = null,
    electionRegistrationUrl: java.lang.String = null,
    electionRulesUrl: java.lang.String = null,
    hoursOfOperation: java.lang.String = null,
    name: java.lang.String = null,
    physicalAddress: SimpleAddressType = null,
    voter_services: js.Array[java.lang.String] = null,
    votingLocationFinderUrl: java.lang.String = null
  ): AdministrativeBody = {
    val __obj = js.Dynamic.literal()
    if (absenteeVotingInfoUrl != null) __obj.updateDynamic("absenteeVotingInfoUrl")(absenteeVotingInfoUrl)
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines)
    if (ballotInfoUrl != null) __obj.updateDynamic("ballotInfoUrl")(ballotInfoUrl)
    if (correspondenceAddress != null) __obj.updateDynamic("correspondenceAddress")(correspondenceAddress)
    if (electionInfoUrl != null) __obj.updateDynamic("electionInfoUrl")(electionInfoUrl)
    if (electionOfficials != null) __obj.updateDynamic("electionOfficials")(electionOfficials)
    if (electionRegistrationConfirmationUrl != null) __obj.updateDynamic("electionRegistrationConfirmationUrl")(electionRegistrationConfirmationUrl)
    if (electionRegistrationUrl != null) __obj.updateDynamic("electionRegistrationUrl")(electionRegistrationUrl)
    if (electionRulesUrl != null) __obj.updateDynamic("electionRulesUrl")(electionRulesUrl)
    if (hoursOfOperation != null) __obj.updateDynamic("hoursOfOperation")(hoursOfOperation)
    if (name != null) __obj.updateDynamic("name")(name)
    if (physicalAddress != null) __obj.updateDynamic("physicalAddress")(physicalAddress)
    if (voter_services != null) __obj.updateDynamic("voter_services")(voter_services)
    if (votingLocationFinderUrl != null) __obj.updateDynamic("votingLocationFinderUrl")(votingLocationFinderUrl)
    __obj.asInstanceOf[AdministrativeBody]
  }
}

