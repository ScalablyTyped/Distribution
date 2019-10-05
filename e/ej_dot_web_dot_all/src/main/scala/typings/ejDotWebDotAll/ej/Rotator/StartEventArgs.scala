package typings.ejDotWebDotAll.ej.Rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEventArgs extends js.Object {
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
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Rotator.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object StartEventArgs {
  @scala.inline
  def apply(
    activeItemIndex: Int | Double = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    itemId: String = null,
    model: typings.ejDotWebDotAll.ej.Rotator.Model = null,
    `type`: String = null
  ): StartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activeItemIndex != null) __obj.updateDynamic("activeItemIndex")(activeItemIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StartEventArgs]
  }
}

