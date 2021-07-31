package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an election administrative body (e.g. County Board of
  * Elections).
  */
trait SchemaAdministrativeBody extends StObject {
  
  /**
    * A URL provided by this administrative body for information on absentee
    * voting.
    */
  var absenteeVotingInfoUrl: js.UndefOr[String] = js.undefined
  
  var addressLines: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A URL provided by this administrative body to give contest information to
    * the voter.
    */
  var ballotInfoUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The mailing address of this administrative body.
    */
  var correspondenceAddress: js.UndefOr[SchemaSimpleAddressType] = js.undefined
  
  /**
    * A URL provided by this administrative body for looking up general
    * election information.
    */
  var electionInfoUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The election officials for this election administrative body.
    */
  var electionOfficials: js.UndefOr[js.Array[SchemaElectionOfficial]] = js.undefined
  
  /**
    * A URL provided by this administrative body for confirming that the voter
    * is registered to vote.
    */
  var electionRegistrationConfirmationUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A URL provided by this administrative body for looking up how to register
    * to vote.
    */
  var electionRegistrationUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A URL provided by this administrative body describing election rules to
    * the voter.
    */
  var electionRulesUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the hours of operation for this administrative body.
    */
  var hoursOfOperation: js.UndefOr[String] = js.undefined
  
  /**
    * The name of this election administrative body.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The physical address of this administrative body.
    */
  var physicalAddress: js.UndefOr[SchemaSimpleAddressType] = js.undefined
  
  /**
    * A description of the services this administrative body may provide.
    */
  var voter_services: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A URL provided by this administrative body for looking up where to vote.
    */
  var votingLocationFinderUrl: js.UndefOr[String] = js.undefined
}
object SchemaAdministrativeBody {
  
  @scala.inline
  def apply(): SchemaAdministrativeBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministrativeBody]
  }
  
  @scala.inline
  implicit class SchemaAdministrativeBodyMutableBuilder[Self <: SchemaAdministrativeBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsenteeVotingInfoUrl(value: String): Self = StObject.set(x, "absenteeVotingInfoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsenteeVotingInfoUrlUndefined: Self = StObject.set(x, "absenteeVotingInfoUrl", js.undefined)
    
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = StObject.set(x, "addressLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLinesUndefined: Self = StObject.set(x, "addressLines", js.undefined)
    
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = StObject.set(x, "addressLines", js.Array(value :_*))
    
    @scala.inline
    def setBallotInfoUrl(value: String): Self = StObject.set(x, "ballotInfoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBallotInfoUrlUndefined: Self = StObject.set(x, "ballotInfoUrl", js.undefined)
    
    @scala.inline
    def setCorrespondenceAddress(value: SchemaSimpleAddressType): Self = StObject.set(x, "correspondenceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrespondenceAddressUndefined: Self = StObject.set(x, "correspondenceAddress", js.undefined)
    
    @scala.inline
    def setElectionInfoUrl(value: String): Self = StObject.set(x, "electionInfoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionInfoUrlUndefined: Self = StObject.set(x, "electionInfoUrl", js.undefined)
    
    @scala.inline
    def setElectionOfficials(value: js.Array[SchemaElectionOfficial]): Self = StObject.set(x, "electionOfficials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionOfficialsUndefined: Self = StObject.set(x, "electionOfficials", js.undefined)
    
    @scala.inline
    def setElectionOfficialsVarargs(value: SchemaElectionOfficial*): Self = StObject.set(x, "electionOfficials", js.Array(value :_*))
    
    @scala.inline
    def setElectionRegistrationConfirmationUrl(value: String): Self = StObject.set(x, "electionRegistrationConfirmationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionRegistrationConfirmationUrlUndefined: Self = StObject.set(x, "electionRegistrationConfirmationUrl", js.undefined)
    
    @scala.inline
    def setElectionRegistrationUrl(value: String): Self = StObject.set(x, "electionRegistrationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionRegistrationUrlUndefined: Self = StObject.set(x, "electionRegistrationUrl", js.undefined)
    
    @scala.inline
    def setElectionRulesUrl(value: String): Self = StObject.set(x, "electionRulesUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionRulesUrlUndefined: Self = StObject.set(x, "electionRulesUrl", js.undefined)
    
    @scala.inline
    def setHoursOfOperation(value: String): Self = StObject.set(x, "hoursOfOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursOfOperationUndefined: Self = StObject.set(x, "hoursOfOperation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhysicalAddress(value: SchemaSimpleAddressType): Self = StObject.set(x, "physicalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalAddressUndefined: Self = StObject.set(x, "physicalAddress", js.undefined)
    
    @scala.inline
    def setVoter_services(value: js.Array[String]): Self = StObject.set(x, "voter_services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoter_servicesUndefined: Self = StObject.set(x, "voter_services", js.undefined)
    
    @scala.inline
    def setVoter_servicesVarargs(value: String*): Self = StObject.set(x, "voter_services", js.Array(value :_*))
    
    @scala.inline
    def setVotingLocationFinderUrl(value: String): Self = StObject.set(x, "votingLocationFinderUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVotingLocationFinderUrlUndefined: Self = StObject.set(x, "votingLocationFinderUrl", js.undefined)
  }
}
