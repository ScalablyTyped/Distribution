package typings.firebaseMessaging.tokenDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenDetails extends js.Object {
  var createTime: Double = js.native
  /** Does not exist in Safari since it's not using Push API. */
  var subscriptionOptions: js.UndefOr[SubscriptionOptions] = js.native
  var token: String = js.native
}

object TokenDetails {
  @scala.inline
  def apply(createTime: Double, token: String): TokenDetails = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDetails]
  }
  @scala.inline
  implicit class TokenDetailsOps[Self <: TokenDetails] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: Double): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionOptions(value: SubscriptionOptions): Self = this.set("subscriptionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionOptions: Self = this.set("subscriptionOptions", js.undefined)
  }
  
}

