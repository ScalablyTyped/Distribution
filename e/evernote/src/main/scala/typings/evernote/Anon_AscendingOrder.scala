package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.NoteSortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingOrder extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var order: js.UndefOr[NoteSortOrder] = js.undefined
  var publicDescription: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Anon_AscendingOrder {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    order: NoteSortOrder = null,
    publicDescription: String = null,
    uri: String = null
  ): Anon_AscendingOrder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (order != null) __obj.updateDynamic("order")(order)
    if (publicDescription != null) __obj.updateDynamic("publicDescription")(publicDescription)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_AscendingOrder]
  }
}

