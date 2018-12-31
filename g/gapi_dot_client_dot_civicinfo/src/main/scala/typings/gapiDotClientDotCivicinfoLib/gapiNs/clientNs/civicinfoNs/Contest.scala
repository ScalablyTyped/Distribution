package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contest extends js.Object {
  /** A number specifying the position of this contest on the voter's ballot. */
  var ballotPlacement: js.UndefOr[java.lang.String] = js.undefined
  /** The candidate choices for this contest. */
  var candidates: js.UndefOr[js.Array[Candidate]] = js.undefined
  /** Information about the electoral district that this contest is in. */
  var district: js.UndefOr[ElectoralDistrict] = js.undefined
  /** A description of any additional eligibility requirements for voting in this contest. */
  var electorateSpecifications: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An ID for this object. IDs may change in future requests and should not be cached. Access to this field requires special access that can be requested
    * from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The levels of government of the office for this contest. There may be more than one in cases where a jurisdiction effectively acts at two different
    * levels of government; for example, the mayor of the District of Columbia acts at "locality" level, but also effectively at both "administrative-area-2"
    * and "administrative-area-1".
    */
  var level: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The number of candidates that will be elected to office in this contest. */
  var numberElected: js.UndefOr[java.lang.String] = js.undefined
  /** The number of candidates that a voter may vote for in this contest. */
  var numberVotingFor: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the office for this contest. */
  var office: js.UndefOr[java.lang.String] = js.undefined
  /** If this is a partisan election, the name of the party it is for. */
  var primaryParty: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The set of ballot responses for the referendum. A ballot response represents a line on the ballot. Common examples might include "yes" or "no" for
    * referenda. This field is only populated for contests of type 'Referendum'.
    */
  var referendumBallotResponses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specifies a short summary of the referendum that is typically on the ballot below the title but above the text. This field is only populated for
    * contests of type 'Referendum'.
    */
  var referendumBrief: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A statement in opposition to the referendum. It does not necessarily appear on the ballot. This field is only populated for contests of type
    * 'Referendum'.
    */
  var referendumConStatement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies what effect abstaining (not voting) on the proposition will have (i.e. whether abstaining is considered a vote against it). This field is
    * only populated for contests of type 'Referendum'.
    */
  var referendumEffectOfAbstain: js.UndefOr[java.lang.String] = js.undefined
  /** The threshold of votes that the referendum needs in order to pass, e.g. "two-thirds". This field is only populated for contests of type 'Referendum'. */
  var referendumPassageThreshold: js.UndefOr[java.lang.String] = js.undefined
  /** A statement in favor of the referendum. It does not necessarily appear on the ballot. This field is only populated for contests of type 'Referendum'. */
  var referendumProStatement: js.UndefOr[java.lang.String] = js.undefined
  /** A brief description of the referendum. This field is only populated for contests of type 'Referendum'. */
  var referendumSubtitle: js.UndefOr[java.lang.String] = js.undefined
  /** The full text of the referendum. This field is only populated for contests of type 'Referendum'. */
  var referendumText: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the referendum (e.g. 'Proposition 42'). This field is only populated for contests of type 'Referendum'. */
  var referendumTitle: js.UndefOr[java.lang.String] = js.undefined
  /** A link to the referendum. This field is only populated for contests of type 'Referendum'. */
  var referendumUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The roles which this office fulfills. */
  var roles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of sources for this contest. If multiple sources are listed, the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  /** "Yes" or "No" depending on whether this a contest being held outside the normal election cycle. */
  var special: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of contest. Usually this will be 'General', 'Primary', or 'Run-off' for contests with candidates. For referenda this will be 'Referendum'. For
    * Retention contests this will typically be 'Retention'.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

