package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recipient extends js.Object {
  var deliveryType: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Recipient {
  @scala.inline
  def apply(deliveryType: String = null, email: String = null, kind: String = null): Recipient = {
    val __obj = js.Dynamic.literal()
    if (deliveryType != null) __obj.updateDynamic("deliveryType")(deliveryType)
    if (email != null) __obj.updateDynamic("email")(email)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Recipient]
  }
}

