package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a candidate running for elected office.
  */
@js.native
trait Schema$Candidate extends js.Object {
  /**
    * The URL for the candidate&#39;s campaign web site.
    */
  var candidateUrl: js.UndefOr[String] = js.native
  /**
    * A list of known (social) media channels for this candidate.
    */
  var channels: js.UndefOr[js.Array[Schema$Channel]] = js.native
  /**
    * The email address for the candidate&#39;s campaign.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The candidate&#39;s name. If this is a joint ticket it will indicate the
    * name of the candidate at the top of a ticket followed by a / and that
    * name of candidate at the bottom of the ticket. e.g. &quot;Mitt Romney /
    * Paul Ryan&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The order the candidate appears on the ballot for this contest.
    */
  var orderOnBallot: js.UndefOr[String] = js.native
  /**
    * The full name of the party the candidate is a member of.
    */
  var party: js.UndefOr[String] = js.native
  /**
    * The voice phone number for the candidate&#39;s campaign office.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * A URL for a photo of the candidate.
    */
  var photoUrl: js.UndefOr[String] = js.native
}

object Schema$Candidate {
  @scala.inline
  def apply(
    candidateUrl: String = null,
    channels: js.Array[Schema$Channel] = null,
    email: String = null,
    name: String = null,
    orderOnBallot: String = null,
    party: String = null,
    phone: String = null,
    photoUrl: String = null
  ): Schema$Candidate = {
    val __obj = js.Dynamic.literal()
    if (candidateUrl != null) __obj.updateDynamic("candidateUrl")(candidateUrl.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orderOnBallot != null) __obj.updateDynamic("orderOnBallot")(orderOnBallot.asInstanceOf[js.Any])
    if (party != null) __obj.updateDynamic("party")(party.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Candidate]
  }
}

