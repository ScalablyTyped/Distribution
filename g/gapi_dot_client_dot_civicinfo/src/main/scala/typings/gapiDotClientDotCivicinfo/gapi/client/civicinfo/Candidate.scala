package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Candidate extends js.Object {
  /** The URL for the candidate's campaign web site. */
  var candidateUrl: js.UndefOr[String] = js.undefined
  /** A list of known (social) media channels for this candidate. */
  var channels: js.UndefOr[js.Array[Channel]] = js.undefined
  /** The email address for the candidate's campaign. */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The candidate's name. If this is a joint ticket it will indicate the name of the candidate at the top of a ticket followed by a / and that name of
    * candidate at the bottom of the ticket. e.g. "Mitt Romney / Paul Ryan"
    */
  var name: js.UndefOr[String] = js.undefined
  /** The order the candidate appears on the ballot for this contest. */
  var orderOnBallot: js.UndefOr[String] = js.undefined
  /** The full name of the party the candidate is a member of. */
  var party: js.UndefOr[String] = js.undefined
  /** The voice phone number for the candidate's campaign office. */
  var phone: js.UndefOr[String] = js.undefined
  /** A URL for a photo of the candidate. */
  var photoUrl: js.UndefOr[String] = js.undefined
}

object Candidate {
  @scala.inline
  def apply(
    candidateUrl: String = null,
    channels: js.Array[Channel] = null,
    email: String = null,
    name: String = null,
    orderOnBallot: String = null,
    party: String = null,
    phone: String = null,
    photoUrl: String = null
  ): Candidate = {
    val __obj = js.Dynamic.literal()
    if (candidateUrl != null) __obj.updateDynamic("candidateUrl")(candidateUrl)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orderOnBallot != null) __obj.updateDynamic("orderOnBallot")(orderOnBallot)
    if (party != null) __obj.updateDynamic("party")(party)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    __obj.asInstanceOf[Candidate]
  }
}

