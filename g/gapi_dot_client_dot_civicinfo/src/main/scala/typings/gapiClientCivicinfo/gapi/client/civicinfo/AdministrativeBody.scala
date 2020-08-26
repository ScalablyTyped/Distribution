package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdministrativeBody extends js.Object {
  /** A URL provided by this administrative body for information on absentee voting. */
  var absenteeVotingInfoUrl: js.UndefOr[String] = js.native
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  /** A URL provided by this administrative body to give contest information to the voter. */
  var ballotInfoUrl: js.UndefOr[String] = js.native
  /** The mailing address of this administrative body. */
  var correspondenceAddress: js.UndefOr[SimpleAddressType] = js.native
  /** A URL provided by this administrative body for looking up general election information. */
  var electionInfoUrl: js.UndefOr[String] = js.native
  /** The election officials for this election administrative body. */
  var electionOfficials: js.UndefOr[js.Array[ElectionOfficial]] = js.native
  /** A URL provided by this administrative body for confirming that the voter is registered to vote. */
  var electionRegistrationConfirmationUrl: js.UndefOr[String] = js.native
  /** A URL provided by this administrative body for looking up how to register to vote. */
  var electionRegistrationUrl: js.UndefOr[String] = js.native
  /** A URL provided by this administrative body describing election rules to the voter. */
  var electionRulesUrl: js.UndefOr[String] = js.native
  /** A description of the hours of operation for this administrative body. */
  var hoursOfOperation: js.UndefOr[String] = js.native
  /** The name of this election administrative body. */
  var name: js.UndefOr[String] = js.native
  /** The physical address of this administrative body. */
  var physicalAddress: js.UndefOr[SimpleAddressType] = js.native
  /** A description of the services this administrative body may provide. */
  var voter_services: js.UndefOr[js.Array[String]] = js.native
  /** A URL provided by this administrative body for looking up where to vote. */
  var votingLocationFinderUrl: js.UndefOr[String] = js.native
}

object AdministrativeBody {
  @scala.inline
  def apply(): AdministrativeBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeBody]
  }
  @scala.inline
  implicit class AdministrativeBodyOps[Self <: AdministrativeBody] (val x: Self) extends AnyVal {
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
    def setAbsenteeVotingInfoUrl(value: String): Self = this.set("absenteeVotingInfoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsenteeVotingInfoUrl: Self = this.set("absenteeVotingInfoUrl", js.undefined)
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = this.set("addressLines", js.Array(value :_*))
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = this.set("addressLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLines: Self = this.set("addressLines", js.undefined)
    @scala.inline
    def setBallotInfoUrl(value: String): Self = this.set("ballotInfoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBallotInfoUrl: Self = this.set("ballotInfoUrl", js.undefined)
    @scala.inline
    def setCorrespondenceAddress(value: SimpleAddressType): Self = this.set("correspondenceAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrespondenceAddress: Self = this.set("correspondenceAddress", js.undefined)
    @scala.inline
    def setElectionInfoUrl(value: String): Self = this.set("electionInfoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectionInfoUrl: Self = this.set("electionInfoUrl", js.undefined)
    @scala.inline
    def setElectionOfficialsVarargs(value: ElectionOfficial*): Self = this.set("electionOfficials", js.Array(value :_*))
    @scala.inline
    def setElectionOfficials(value: js.Array[ElectionOfficial]): Self = this.set("electionOfficials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectionOfficials: Self = this.set("electionOfficials", js.undefined)
    @scala.inline
    def setElectionRegistrationConfirmationUrl(value: String): Self = this.set("electionRegistrationConfirmationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectionRegistrationConfirmationUrl: Self = this.set("electionRegistrationConfirmationUrl", js.undefined)
    @scala.inline
    def setElectionRegistrationUrl(value: String): Self = this.set("electionRegistrationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectionRegistrationUrl: Self = this.set("electionRegistrationUrl", js.undefined)
    @scala.inline
    def setElectionRulesUrl(value: String): Self = this.set("electionRulesUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectionRulesUrl: Self = this.set("electionRulesUrl", js.undefined)
    @scala.inline
    def setHoursOfOperation(value: String): Self = this.set("hoursOfOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoursOfOperation: Self = this.set("hoursOfOperation", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhysicalAddress(value: SimpleAddressType): Self = this.set("physicalAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalAddress: Self = this.set("physicalAddress", js.undefined)
    @scala.inline
    def setVoter_servicesVarargs(value: String*): Self = this.set("voter_services", js.Array(value :_*))
    @scala.inline
    def setVoter_services(value: js.Array[String]): Self = this.set("voter_services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoter_services: Self = this.set("voter_services", js.undefined)
    @scala.inline
    def setVotingLocationFinderUrl(value: String): Self = this.set("votingLocationFinderUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVotingLocationFinderUrl: Self = this.set("votingLocationFinderUrl", js.undefined)
  }
  
}

