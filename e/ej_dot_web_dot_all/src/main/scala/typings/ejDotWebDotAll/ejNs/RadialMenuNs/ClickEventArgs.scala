package typings.ejDotWebDotAll.ejNs.RadialMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the item of element
    */
  var item: js.UndefOr[js.Any] = js.undefined
  /** returns the name of item
    */
  var itemName: js.UndefOr[String] = js.undefined
  /** returns the Radialmenu model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    item: js.Any = null,
    itemName: String = null,
    model: js.Any = null,
    `type`: String = null
  ): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (item != null) __obj.updateDynamic("item")(item)
    if (itemName != null) __obj.updateDynamic("itemName")(itemName)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClickEventArgs]
  }
}

