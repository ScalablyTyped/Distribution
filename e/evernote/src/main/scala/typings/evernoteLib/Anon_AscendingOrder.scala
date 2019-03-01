package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingOrder extends js.Object {
  var ascending: js.UndefOr[scala.Boolean] = js.undefined
  var order: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.NoteSortOrder] = js.undefined
  var publicDescription: js.UndefOr[java.lang.String] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AscendingOrder {
  @scala.inline
  def apply(
    ascending: js.UndefOr[scala.Boolean] = js.undefined,
    order: evernoteLib.evernoteMod.EvernoteNs.NoteSortOrder = null,
    publicDescription: java.lang.String = null,
    uri: java.lang.String = null
  ): Anon_AscendingOrder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (order != null) __obj.updateDynamic("order")(order)
    if (publicDescription != null) __obj.updateDynamic("publicDescription")(publicDescription)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_AscendingOrder]
  }
}

