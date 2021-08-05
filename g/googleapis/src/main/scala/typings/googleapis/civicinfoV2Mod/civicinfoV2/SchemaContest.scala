package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a contest that appears on a voter&#39;s ballot.
  */
trait SchemaContest extends StObject {
  
  /**
    * A number specifying the position of this contest on the voter&#39;s
    * ballot.
    */
  var ballotPlacement: js.UndefOr[String] = js.undefined
  
  /**
    * The official title on the ballot for this contest, only where available.
    */
  var ballotTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The candidate choices for this contest.
    */
  var candidates: js.UndefOr[js.Array[SchemaCandidate]] = js.undefined
  
  /**
    * Information about the electoral district that this contest is in.
    */
  var district: js.UndefOr[SchemaElectoralDistrict] = js.undefined
  
  /**
    * A description of any additional eligibility requirements for voting in
    * this contest.
    */
  var electorateSpecifications: js.UndefOr[String] = js.undefined
  
  /**
    * An ID for this object. IDs may change in future requests and should not
    * be cached. Access to this field requires special access that can be
    * requested from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The levels of government of the office for this contest. There may be
    * more than one in cases where a jurisdiction effectively acts at two
    * different levels of government; for example, the mayor of the District of
    * Columbia acts at &quot;locality&quot; level, but also effectively at both
    * &quot;administrative-area-2&quot; and &quot;administrative-area-1&quot;.
    */
  var level: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The number of candidates that will be elected to office in this contest.
    */
  var numberElected: js.UndefOr[String] = js.undefined
  
  /**
    * The number of candidates that a voter may vote for in this contest.
    */
  var numberVotingFor: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the office for this contest.
    */
  var office: js.UndefOr[String] = js.undefined
  
  /**
    * If this is a partisan election, the name of the party it is for.
    */
  var primaryParty: js.UndefOr[String] = js.undefined
  
  /**
    * The set of ballot responses for the referendum. A ballot response
    * represents a line on the ballot. Common examples might include
    * &quot;yes&quot; or &quot;no&quot; for referenda. This field is only
    * populated for contests of type &#39;Referendum&#39;.
    */
  var referendumBallotResponses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies a short summary of the referendum that is typically on the
    * ballot below the title but above the text. This field is only populated
    * for contests of type &#39;Referendum&#39;.
    */
  var referendumBrief: js.UndefOr[String] = js.undefined
  
  /**
    * A statement in opposition to the referendum. It does not necessarily
    * appear on the ballot. This field is only populated for contests of type
    * &#39;Referendum&#39;.
    */
  var referendumConStatement: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies what effect abstaining (not voting) on the proposition will
    * have (i.e. whether abstaining is considered a vote against it). This
    * field is only populated for contests of type &#39;Referendum&#39;.
    */
  var referendumEffectOfAbstain: js.UndefOr[String] = js.undefined
  
  /**
    * The threshold of votes that the referendum needs in order to pass, e.g.
    * &quot;two-thirds&quot;. This field is only populated for contests of type
    * &#39;Referendum&#39;.
    */
  var referendumPassageThreshold: js.UndefOr[String] = js.undefined
  
  /**
    * A statement in favor of the referendum. It does not necessarily appear on
    * the ballot. This field is only populated for contests of type
    * &#39;Referendum&#39;.
    */
  var referendumProStatement: js.UndefOr[String] = js.undefined
  
  /**
    * A brief description of the referendum. This field is only populated for
    * contests of type &#39;Referendum&#39;.
    */
  var referendumSubtitle: js.UndefOr[String] = js.undefined
  
  /**
    * The full text of the referendum. This field is only populated for
    * contests of type &#39;Referendum&#39;.
    */
  var referendumText: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the referendum (e.g. &#39;Proposition 42&#39;). This field
    * is only populated for contests of type &#39;Referendum&#39;.
    */
  var referendumTitle: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the referendum. This field is only populated for contests of
    * type &#39;Referendum&#39;.
    */
  var referendumUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The roles which this office fulfills.
    */
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of sources for this contest. If multiple sources are listed, the
    * data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.undefined
  
  /**
    * &quot;Yes&quot; or &quot;No&quot; depending on whether this a contest
    * being held outside the normal election cycle.
    */
  var special: js.UndefOr[String] = js.undefined
  
  /**
    * The type of contest. Usually this will be &#39;General&#39;,
    * &#39;Primary&#39;, or &#39;Run-off&#39; for contests with candidates. For
    * referenda this will be &#39;Referendum&#39;. For Retention contests this
    * will typically be &#39;Retention&#39;.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaContest {
  
  inline def apply(): SchemaContest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContest]
  }
  
  extension [Self <: SchemaContest](x: Self) {
    
    inline def setBallotPlacement(value: String): Self = StObject.set(x, "ballotPlacement", value.asInstanceOf[js.Any])
    
    inline def setBallotPlacementUndefined: Self = StObject.set(x, "ballotPlacement", js.undefined)
    
    inline def setBallotTitle(value: String): Self = StObject.set(x, "ballotTitle", value.asInstanceOf[js.Any])
    
    inline def setBallotTitleUndefined: Self = StObject.set(x, "ballotTitle", js.undefined)
    
    inline def setCandidates(value: js.Array[SchemaCandidate]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: SchemaCandidate*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    
    inline def setDistrict(value: SchemaElectoralDistrict): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setDistrictUndefined: Self = StObject.set(x, "district", js.undefined)
    
    inline def setElectorateSpecifications(value: String): Self = StObject.set(x, "electorateSpecifications", value.asInstanceOf[js.Any])
    
    inline def setElectorateSpecificationsUndefined: Self = StObject.set(x, "electorateSpecifications", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLevel(value: js.Array[String]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLevelVarargs(value: String*): Self = StObject.set(x, "level", js.Array(value :_*))
    
    inline def setNumberElected(value: String): Self = StObject.set(x, "numberElected", value.asInstanceOf[js.Any])
    
    inline def setNumberElectedUndefined: Self = StObject.set(x, "numberElected", js.undefined)
    
    inline def setNumberVotingFor(value: String): Self = StObject.set(x, "numberVotingFor", value.asInstanceOf[js.Any])
    
    inline def setNumberVotingForUndefined: Self = StObject.set(x, "numberVotingFor", js.undefined)
    
    inline def setOffice(value: String): Self = StObject.set(x, "office", value.asInstanceOf[js.Any])
    
    inline def setOfficeUndefined: Self = StObject.set(x, "office", js.undefined)
    
    inline def setPrimaryParty(value: String): Self = StObject.set(x, "primaryParty", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPartyUndefined: Self = StObject.set(x, "primaryParty", js.undefined)
    
    inline def setReferendumBallotResponses(value: js.Array[String]): Self = StObject.set(x, "referendumBallotResponses", value.asInstanceOf[js.Any])
    
    inline def setReferendumBallotResponsesUndefined: Self = StObject.set(x, "referendumBallotResponses", js.undefined)
    
    inline def setReferendumBallotResponsesVarargs(value: String*): Self = StObject.set(x, "referendumBallotResponses", js.Array(value :_*))
    
    inline def setReferendumBrief(value: String): Self = StObject.set(x, "referendumBrief", value.asInstanceOf[js.Any])
    
    inline def setReferendumBriefUndefined: Self = StObject.set(x, "referendumBrief", js.undefined)
    
    inline def setReferendumConStatement(value: String): Self = StObject.set(x, "referendumConStatement", value.asInstanceOf[js.Any])
    
    inline def setReferendumConStatementUndefined: Self = StObject.set(x, "referendumConStatement", js.undefined)
    
    inline def setReferendumEffectOfAbstain(value: String): Self = StObject.set(x, "referendumEffectOfAbstain", value.asInstanceOf[js.Any])
    
    inline def setReferendumEffectOfAbstainUndefined: Self = StObject.set(x, "referendumEffectOfAbstain", js.undefined)
    
    inline def setReferendumPassageThreshold(value: String): Self = StObject.set(x, "referendumPassageThreshold", value.asInstanceOf[js.Any])
    
    inline def setReferendumPassageThresholdUndefined: Self = StObject.set(x, "referendumPassageThreshold", js.undefined)
    
    inline def setReferendumProStatement(value: String): Self = StObject.set(x, "referendumProStatement", value.asInstanceOf[js.Any])
    
    inline def setReferendumProStatementUndefined: Self = StObject.set(x, "referendumProStatement", js.undefined)
    
    inline def setReferendumSubtitle(value: String): Self = StObject.set(x, "referendumSubtitle", value.asInstanceOf[js.Any])
    
    inline def setReferendumSubtitleUndefined: Self = StObject.set(x, "referendumSubtitle", js.undefined)
    
    inline def setReferendumText(value: String): Self = StObject.set(x, "referendumText", value.asInstanceOf[js.Any])
    
    inline def setReferendumTextUndefined: Self = StObject.set(x, "referendumText", js.undefined)
    
    inline def setReferendumTitle(value: String): Self = StObject.set(x, "referendumTitle", value.asInstanceOf[js.Any])
    
    inline def setReferendumTitleUndefined: Self = StObject.set(x, "referendumTitle", js.undefined)
    
    inline def setReferendumUrl(value: String): Self = StObject.set(x, "referendumUrl", value.asInstanceOf[js.Any])
    
    inline def setReferendumUrlUndefined: Self = StObject.set(x, "referendumUrl", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    inline def setSources(value: js.Array[SchemaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SchemaSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    inline def setSpecial(value: String): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
    
    inline def setSpecialUndefined: Self = StObject.set(x, "special", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
