package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a voter info lookup query.
  */
trait SchemaVoterInfoResponse extends StObject {
  
  /**
    * Contests that will appear on the voter&#39;s ballot.
    */
  var contests: js.UndefOr[js.Array[SchemaContest]] = js.undefined
  
  /**
    * Locations where a voter is eligible to drop off a completed ballot. The
    * voter must have received and completed a ballot prior to arriving at the
    * location. The location may not have ballots available on the premises.
    * These locations could be open on or before election day as indicated in
    * the pollingHours field.
    */
  var dropOffLocations: js.UndefOr[js.Array[SchemaPollingLocation]] = js.undefined
  
  /**
    * Locations where the voter is eligible to vote early, prior to election
    * day.
    */
  var earlyVoteSites: js.UndefOr[js.Array[SchemaPollingLocation]] = js.undefined
  
  /**
    * The election that was queried.
    */
  var election: js.UndefOr[SchemaElection] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#voterInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether voters in the precinct vote only by mailing their
    * ballots (with the possible option of dropping off their ballots as well).
    */
  var mailOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The normalized version of the requested address
    */
  var normalizedInput: js.UndefOr[SchemaSimpleAddressType] = js.undefined
  
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
  var otherElections: js.UndefOr[js.Array[SchemaElection]] = js.undefined
  
  /**
    * Locations where the voter is eligible to vote on election day.
    */
  var pollingLocations: js.UndefOr[js.Array[SchemaPollingLocation]] = js.undefined
  
  var precinctId: js.UndefOr[String] = js.undefined
  
  var segments: js.UndefOr[js.Array[SchemaStreetSegment]] = js.undefined
  
  /**
    * Local Election Information for the state that the voter votes in. For the
    * US, there will only be one element in this array.
    */
  var state: js.UndefOr[js.Array[SchemaAdministrationRegion]] = js.undefined
}
object SchemaVoterInfoResponse {
  
  @scala.inline
  def apply(): SchemaVoterInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoterInfoResponse]
  }
  
  @scala.inline
  implicit class SchemaVoterInfoResponseMutableBuilder[Self <: SchemaVoterInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContests(value: js.Array[SchemaContest]): Self = StObject.set(x, "contests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContestsUndefined: Self = StObject.set(x, "contests", js.undefined)
    
    @scala.inline
    def setContestsVarargs(value: SchemaContest*): Self = StObject.set(x, "contests", js.Array(value :_*))
    
    @scala.inline
    def setDropOffLocations(value: js.Array[SchemaPollingLocation]): Self = StObject.set(x, "dropOffLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropOffLocationsUndefined: Self = StObject.set(x, "dropOffLocations", js.undefined)
    
    @scala.inline
    def setDropOffLocationsVarargs(value: SchemaPollingLocation*): Self = StObject.set(x, "dropOffLocations", js.Array(value :_*))
    
    @scala.inline
    def setEarlyVoteSites(value: js.Array[SchemaPollingLocation]): Self = StObject.set(x, "earlyVoteSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlyVoteSitesUndefined: Self = StObject.set(x, "earlyVoteSites", js.undefined)
    
    @scala.inline
    def setEarlyVoteSitesVarargs(value: SchemaPollingLocation*): Self = StObject.set(x, "earlyVoteSites", js.Array(value :_*))
    
    @scala.inline
    def setElection(value: SchemaElection): Self = StObject.set(x, "election", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionUndefined: Self = StObject.set(x, "election", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMailOnly(value: Boolean): Self = StObject.set(x, "mailOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailOnlyUndefined: Self = StObject.set(x, "mailOnly", js.undefined)
    
    @scala.inline
    def setNormalizedInput(value: SchemaSimpleAddressType): Self = StObject.set(x, "normalizedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedInputUndefined: Self = StObject.set(x, "normalizedInput", js.undefined)
    
    @scala.inline
    def setOtherElections(value: js.Array[SchemaElection]): Self = StObject.set(x, "otherElections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherElectionsUndefined: Self = StObject.set(x, "otherElections", js.undefined)
    
    @scala.inline
    def setOtherElectionsVarargs(value: SchemaElection*): Self = StObject.set(x, "otherElections", js.Array(value :_*))
    
    @scala.inline
    def setPollingLocations(value: js.Array[SchemaPollingLocation]): Self = StObject.set(x, "pollingLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingLocationsUndefined: Self = StObject.set(x, "pollingLocations", js.undefined)
    
    @scala.inline
    def setPollingLocationsVarargs(value: SchemaPollingLocation*): Self = StObject.set(x, "pollingLocations", js.Array(value :_*))
    
    @scala.inline
    def setPrecinctId(value: String): Self = StObject.set(x, "precinctId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecinctIdUndefined: Self = StObject.set(x, "precinctId", js.undefined)
    
    @scala.inline
    def setSegments(value: js.Array[SchemaStreetSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SchemaStreetSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setState(value: js.Array[SchemaAdministrationRegion]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStateVarargs(value: SchemaAdministrationRegion*): Self = StObject.set(x, "state", js.Array(value :_*))
  }
}
