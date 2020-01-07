package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a contest that appears on a voter&#39;s ballot.
  */
@js.native
trait Schema$Contest extends js.Object {
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
  var candidates: js.UndefOr[js.Array[Schema$Candidate]] = js.native
  /**
    * Information about the electoral district that this contest is in.
    */
  var district: js.UndefOr[Schema$ElectoralDistrict] = js.native
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
  var sources: js.UndefOr[js.Array[Schema$Source]] = js.native
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

object Schema$Contest {
  @scala.inline
  def apply(
    ballotPlacement: String = null,
    ballotTitle: String = null,
    candidates: js.Array[Schema$Candidate] = null,
    district: Schema$ElectoralDistrict = null,
    electorateSpecifications: String = null,
    id: String = null,
    level: js.Array[String] = null,
    numberElected: String = null,
    numberVotingFor: String = null,
    office: String = null,
    primaryParty: String = null,
    referendumBallotResponses: js.Array[String] = null,
    referendumBrief: String = null,
    referendumConStatement: String = null,
    referendumEffectOfAbstain: String = null,
    referendumPassageThreshold: String = null,
    referendumProStatement: String = null,
    referendumSubtitle: String = null,
    referendumText: String = null,
    referendumTitle: String = null,
    referendumUrl: String = null,
    roles: js.Array[String] = null,
    sources: js.Array[Schema$Source] = null,
    special: String = null,
    `type`: String = null
  ): Schema$Contest = {
    val __obj = js.Dynamic.literal()
    if (ballotPlacement != null) __obj.updateDynamic("ballotPlacement")(ballotPlacement.asInstanceOf[js.Any])
    if (ballotTitle != null) __obj.updateDynamic("ballotTitle")(ballotTitle.asInstanceOf[js.Any])
    if (candidates != null) __obj.updateDynamic("candidates")(candidates.asInstanceOf[js.Any])
    if (district != null) __obj.updateDynamic("district")(district.asInstanceOf[js.Any])
    if (electorateSpecifications != null) __obj.updateDynamic("electorateSpecifications")(electorateSpecifications.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (numberElected != null) __obj.updateDynamic("numberElected")(numberElected.asInstanceOf[js.Any])
    if (numberVotingFor != null) __obj.updateDynamic("numberVotingFor")(numberVotingFor.asInstanceOf[js.Any])
    if (office != null) __obj.updateDynamic("office")(office.asInstanceOf[js.Any])
    if (primaryParty != null) __obj.updateDynamic("primaryParty")(primaryParty.asInstanceOf[js.Any])
    if (referendumBallotResponses != null) __obj.updateDynamic("referendumBallotResponses")(referendumBallotResponses.asInstanceOf[js.Any])
    if (referendumBrief != null) __obj.updateDynamic("referendumBrief")(referendumBrief.asInstanceOf[js.Any])
    if (referendumConStatement != null) __obj.updateDynamic("referendumConStatement")(referendumConStatement.asInstanceOf[js.Any])
    if (referendumEffectOfAbstain != null) __obj.updateDynamic("referendumEffectOfAbstain")(referendumEffectOfAbstain.asInstanceOf[js.Any])
    if (referendumPassageThreshold != null) __obj.updateDynamic("referendumPassageThreshold")(referendumPassageThreshold.asInstanceOf[js.Any])
    if (referendumProStatement != null) __obj.updateDynamic("referendumProStatement")(referendumProStatement.asInstanceOf[js.Any])
    if (referendumSubtitle != null) __obj.updateDynamic("referendumSubtitle")(referendumSubtitle.asInstanceOf[js.Any])
    if (referendumText != null) __obj.updateDynamic("referendumText")(referendumText.asInstanceOf[js.Any])
    if (referendumTitle != null) __obj.updateDynamic("referendumTitle")(referendumTitle.asInstanceOf[js.Any])
    if (referendumUrl != null) __obj.updateDynamic("referendumUrl")(referendumUrl.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (special != null) __obj.updateDynamic("special")(special.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Contest]
  }
}

