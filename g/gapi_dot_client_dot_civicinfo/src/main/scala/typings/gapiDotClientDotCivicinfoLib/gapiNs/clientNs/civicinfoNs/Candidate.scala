package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Candidate extends js.Object {
  /** The URL for the candidate's campaign web site. */
  var candidateUrl: js.UndefOr[java.lang.String] = js.undefined
  /** A list of known (social) media channels for this candidate. */
  var channels: js.UndefOr[js.Array[Channel]] = js.undefined
  /** The email address for the candidate's campaign. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The candidate's name. If this is a joint ticket it will indicate the name of the candidate at the top of a ticket followed by a / and that name of
               * candidate at the bottom of the ticket. e.g. "Mitt Romney / Paul Ryan"
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The order the candidate appears on the ballot for this contest. */
  var orderOnBallot: js.UndefOr[java.lang.String] = js.undefined
  /** The full name of the party the candidate is a member of. */
  var party: js.UndefOr[java.lang.String] = js.undefined
  /** The voice phone number for the candidate's campaign office. */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  /** A URL for a photo of the candidate. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
}

