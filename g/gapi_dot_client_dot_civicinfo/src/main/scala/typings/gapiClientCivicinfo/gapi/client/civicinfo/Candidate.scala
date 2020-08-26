package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Candidate extends js.Object {
  /** The URL for the candidate's campaign web site. */
  var candidateUrl: js.UndefOr[String] = js.native
  /** A list of known (social) media channels for this candidate. */
  var channels: js.UndefOr[js.Array[Channel]] = js.native
  /** The email address for the candidate's campaign. */
  var email: js.UndefOr[String] = js.native
  /**
    * The candidate's name. If this is a joint ticket it will indicate the name of the candidate at the top of a ticket followed by a / and that name of
    * candidate at the bottom of the ticket. e.g. "Mitt Romney / Paul Ryan"
    */
  var name: js.UndefOr[String] = js.native
  /** The order the candidate appears on the ballot for this contest. */
  var orderOnBallot: js.UndefOr[String] = js.native
  /** The full name of the party the candidate is a member of. */
  var party: js.UndefOr[String] = js.native
  /** The voice phone number for the candidate's campaign office. */
  var phone: js.UndefOr[String] = js.native
  /** A URL for a photo of the candidate. */
  var photoUrl: js.UndefOr[String] = js.native
}

object Candidate {
  @scala.inline
  def apply(): Candidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Candidate]
  }
  @scala.inline
  implicit class CandidateOps[Self <: Candidate] (val x: Self) extends AnyVal {
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
    def setCandidateUrl(value: String): Self = this.set("candidateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandidateUrl: Self = this.set("candidateUrl", js.undefined)
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[Channel]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrderOnBallot(value: String): Self = this.set("orderOnBallot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderOnBallot: Self = this.set("orderOnBallot", js.undefined)
    @scala.inline
    def setParty(value: String): Self = this.set("party", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParty: Self = this.set("party", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
  }
  
}

