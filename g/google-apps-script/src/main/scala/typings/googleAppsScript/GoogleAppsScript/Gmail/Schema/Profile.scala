package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var emailAddress: js.UndefOr[String] = js.undefined
  var historyId: js.UndefOr[String] = js.undefined
  var messagesTotal: js.UndefOr[Double] = js.undefined
  var threadsTotal: js.UndefOr[Double] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    emailAddress: String = null,
    historyId: String = null,
    messagesTotal: js.UndefOr[Double] = js.undefined,
    threadsTotal: js.UndefOr[Double] = js.undefined
  ): Profile = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (!js.isUndefined(messagesTotal)) __obj.updateDynamic("messagesTotal")(messagesTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threadsTotal)) __obj.updateDynamic("threadsTotal")(threadsTotal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

