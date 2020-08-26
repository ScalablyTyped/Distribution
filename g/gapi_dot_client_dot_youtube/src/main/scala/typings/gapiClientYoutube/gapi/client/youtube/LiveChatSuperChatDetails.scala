package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatSuperChatDetails extends js.Object {
  /** A rendered string that displays the fund amount and currency to the user. */
  var amountDisplayString: js.UndefOr[String] = js.native
  /** The amount purchased by the user, in micros (1,750,000 micros = 1.75). */
  var amountMicros: js.UndefOr[String] = js.native
  /** The currency in which the purchase was made. */
  var currency: js.UndefOr[String] = js.native
  /** The tier in which the amount belongs to. Lower amounts belong to lower tiers. Starts at 1. */
  var tier: js.UndefOr[Double] = js.native
  /** The comment added by the user to this Super Chat event. */
  var userComment: js.UndefOr[String] = js.native
}

object LiveChatSuperChatDetails {
  @scala.inline
  def apply(): LiveChatSuperChatDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatSuperChatDetails]
  }
  @scala.inline
  implicit class LiveChatSuperChatDetailsOps[Self <: LiveChatSuperChatDetails] (val x: Self) extends AnyVal {
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
    def setAmountDisplayString(value: String): Self = this.set("amountDisplayString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmountDisplayString: Self = this.set("amountDisplayString", js.undefined)
    @scala.inline
    def setAmountMicros(value: String): Self = this.set("amountMicros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmountMicros: Self = this.set("amountMicros", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setTier(value: Double): Self = this.set("tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
    @scala.inline
    def setUserComment(value: String): Self = this.set("userComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserComment: Self = this.set("userComment", js.undefined)
  }
  
}

