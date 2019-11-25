package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsList extends js.Object {
  /** A list of accounts. */
  var items: js.UndefOr[js.Array[Account]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object AccountsList {
  @scala.inline
  def apply(items: js.Array[Account] = null, kind: String = null): AccountsList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsList]
  }
}

