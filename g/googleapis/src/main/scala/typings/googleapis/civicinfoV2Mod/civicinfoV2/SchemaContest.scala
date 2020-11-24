package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a contest that appears on a voter&#39;s ballot.
  */
@js.native
trait SchemaContest extends js.Object {
  
  /**
    * A number specifying the position of this contest on the voter&#39;s
    * ballot.
    */
  var ballotPlacement: js.UndefOr[String] = js.native
  
  /**
    * The official title on the ballot for this contest, only where available.
    */
  var ballotTitle: js.UndefOr[String] = js.native
  
  /**
    * The candidate choices for this contest.
    */
  var candidates: js.UndefOr[js.Array[SchemaCandidate]] = js.native
  
  /**
    * Information about the electoral district that this contest is in.
    */
  var district: js.UndefOr[SchemaElectoralDistrict] = js.native
  
  /**
    * A description of any additional eligibility requirements for voting in
    * this contest.
    */
  var electorateSpecifications: js.UndefOr[String] = js.native
  
  /**
    * An ID for this object. IDs may change in future requests and should not
    * be cached. Access to this field requires special access that can be
    * requested from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The levels of government of the office for this contest. There may be
    * more than one in cases where a jurisdiction effectively acts at two
    * different levels of government; for example, the mayor of the District of
    * Columbia acts at &quot;locality&quot; level, but also effectively at both
    * &quot;administrative-area-2&quot; and &quot;administrative-area-1&quot;.
    */
  var level: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The number of candidates that will be elected to office in this contest.
    */
  var numberElected: js.UndefOr[String] = js.native
  
  /**
    * The number of candidates that a voter may vote for in this contest.
    */
  var numberVotingFor: js.UndefOr[String] = js.native
  
  /**
    * The name of the office for this contest.
    */
  var office: js.UndefOr[String] = js.native
  
  /**
    * If this is a partisan election, the name of the party it is for.
    */
  var primaryParty: js.UndefOr[String] = js.native
  
  /**
    * The set of ballot responses for the referendum. A ballot response
    * represents a line on the ballot. Common examples might include
    * &quot;yes&quot; or &quot;no&quot; for referenda. This field is only
    * populated for contests of type &#39;Referendum&#39;.
    */
  var referendumBallotResponses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies a short summary of the referendum that is typically on the
    * ballot below the title but above the text. This field is only populated
    * for contests of type &#39;Referendum&#39;.
    */
  var referendumBrief: js.UndefOr[String] = js.native
  
  /**
    * A statement in opposition to the referendum. It does not necessarily
    * appear on the ballot. This field is only populated for contests of type
    * &#39;Referendum&#39;.
    */
  var referendumConStatement: js.UndefOr[String] = js.native
  
  /**
    * Specifies what effect abstaining (not voting) on the proposition will
    * have (i.e. whether abstaining is considered a vote against it). This
    * field is only populated for contests of type &#39;Referendum&#39;.
    */
  var referendumEffectOfAbstain: js.UndefOr[String] = js.native
  
  /**
    * The threshold of votes that the referendum needs in order to pass, e.g.
    * &quot;two-thirds&quot;. This field is only populated for contests of type
    * &#39;Referendum&#39;.
    */
  var referendumPassageThreshold: js.UndefOr[String] = js.native
  
  /**
    * A statement in favor of the referendum. It does not necessarily appear on
    * the ballot. This field is only populated for contests of type
    * &#39;Referendum&#39;.
    */
  var referendumProStatement: js.UndefOr[String] = js.native
  
  /**
    * A brief description of the referendum. This field is only populated for
    * contests of type &#39;Referendum&#39;.
    */
  var referendumSubtitle: js.UndefOr[String] = js.native
  
  /**
    * The full text of the referendum. This field is only populated for
    * contests of type &#39;Referendum&#39;.
    */
  var referendumText: js.UndefOr[String] = js.native
  
  /**
    * The title of the referendum (e.g. &#39;Proposition 42&#39;). This field
    * is only populated for contests of type &#39;Referendum&#39;.
    */
  var referendumTitle: js.UndefOr[String] = js.native
  
  /**
    * A link to the referendum. This field is only populated for contests of
    * type &#39;Referendum&#39;.
    */
  var referendumUrl: js.UndefOr[String] = js.native
  
  /**
    * The roles which this office fulfills.
    */
  var roles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of sources for this contest. If multiple sources are listed, the
    * data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
  
  /**
    * &quot;Yes&quot; or &quot;No&quot; depending on whether this a contest
    * being held outside the normal election cycle.
    */
  var special: js.UndefOr[String] = js.native
  
  /**
    * The type of contest. Usually this will be &#39;General&#39;,
    * &#39;Primary&#39;, or &#39;Run-off&#39; for contests with candidates. For
    * referenda this will be &#39;Referendum&#39;. For Retention contests this
    * will typically be &#39;Retention&#39;.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaContest {
  
  @scala.inline
  def apply(): SchemaContest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContest]
  }
  
  @scala.inline
  implicit class SchemaContestOps[Self <: SchemaContest] (val x: Self) extends AnyVal {
    
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
    def setBallotPlacement(value: String): Self = this.set("ballotPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBallotPlacement: Self = this.set("ballotPlacement", js.undefined)
    
    @scala.inline
    def setBallotTitle(value: String): Self = this.set("ballotTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBallotTitle: Self = this.set("ballotTitle", js.undefined)
    
    @scala.inline
    def setCandidatesVarargs(value: SchemaCandidate*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[SchemaCandidate]): Self = this.set("candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandidates: Self = this.set("candidates", js.undefined)
    
    @scala.inline
    def setDistrict(value: SchemaElectoralDistrict): Self = this.set("district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistrict: Self = this.set("district", js.undefined)
    
    @scala.inline
    def setElectorateSpecifications(value: String): Self = this.set("electorateSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectorateSpecifications: Self = this.set("electorateSpecifications", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLevelVarargs(value: String*): Self = this.set("level", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: js.Array[String]): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setNumberElected(value: String): Self = this.set("numberElected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberElected: Self = this.set("numberElected", js.undefined)
    
    @scala.inline
    def setNumberVotingFor(value: String): Self = this.set("numberVotingFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberVotingFor: Self = this.set("numberVotingFor", js.undefined)
    
    @scala.inline
    def setOffice(value: String): Self = this.set("office", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffice: Self = this.set("office", js.undefined)
    
    @scala.inline
    def setPrimaryParty(value: String): Self = this.set("primaryParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryParty: Self = this.set("primaryParty", js.undefined)
    
    @scala.inline
    def setReferendumBallotResponsesVarargs(value: String*): Self = this.set("referendumBallotResponses", js.Array(value :_*))
    
    @scala.inline
    def setReferendumBallotResponses(value: js.Array[String]): Self = this.set("referendumBallotResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumBallotResponses: Self = this.set("referendumBallotResponses", js.undefined)
    
    @scala.inline
    def setReferendumBrief(value: String): Self = this.set("referendumBrief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumBrief: Self = this.set("referendumBrief", js.undefined)
    
    @scala.inline
    def setReferendumConStatement(value: String): Self = this.set("referendumConStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumConStatement: Self = this.set("referendumConStatement", js.undefined)
    
    @scala.inline
    def setReferendumEffectOfAbstain(value: String): Self = this.set("referendumEffectOfAbstain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumEffectOfAbstain: Self = this.set("referendumEffectOfAbstain", js.undefined)
    
    @scala.inline
    def setReferendumPassageThreshold(value: String): Self = this.set("referendumPassageThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumPassageThreshold: Self = this.set("referendumPassageThreshold", js.undefined)
    
    @scala.inline
    def setReferendumProStatement(value: String): Self = this.set("referendumProStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumProStatement: Self = this.set("referendumProStatement", js.undefined)
    
    @scala.inline
    def setReferendumSubtitle(value: String): Self = this.set("referendumSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumSubtitle: Self = this.set("referendumSubtitle", js.undefined)
    
    @scala.inline
    def setReferendumText(value: String): Self = this.set("referendumText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumText: Self = this.set("referendumText", js.undefined)
    
    @scala.inline
    def setReferendumTitle(value: String): Self = this.set("referendumTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumTitle: Self = this.set("referendumTitle", js.undefined)
    
    @scala.inline
    def setReferendumUrl(value: String): Self = this.set("referendumUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferendumUrl: Self = this.set("referendumUrl", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[String]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SchemaSource*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[SchemaSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    
    @scala.inline
    def setSpecial(value: String): Self = this.set("special", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecial: Self = this.set("special", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
