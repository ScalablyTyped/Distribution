package typings.ejWebAll.ej.Rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopEventArgs extends js.Object {
  /** returns the current slide index.
    */
  var activeItemIndex: js.UndefOr[Double] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** the current rotator id.
    */
  var itemId: js.UndefOr[String] = js.undefined
  /** returns the rotator model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object StopEventArgs {
  @scala.inline
  def apply(
    activeItemIndex: js.UndefOr[Double] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    itemId: String = null,
    model: Model = null,
    `type`: String = null
  ): StopEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeItemIndex)) __obj.updateDynamic("activeItemIndex")(activeItemIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEventArgs]
  }
}

