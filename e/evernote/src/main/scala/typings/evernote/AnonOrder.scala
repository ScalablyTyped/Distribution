package typings.evernote

import typings.evernote.mod.Types.NoteSortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrder extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var order: js.UndefOr[NoteSortOrder] = js.undefined
  var publicDescription: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object AnonOrder {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    order: NoteSortOrder = null,
    publicDescription: String = null,
    uri: String = null
  ): AnonOrder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (publicDescription != null) __obj.updateDynamic("publicDescription")(publicDescription.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrder]
  }
}

