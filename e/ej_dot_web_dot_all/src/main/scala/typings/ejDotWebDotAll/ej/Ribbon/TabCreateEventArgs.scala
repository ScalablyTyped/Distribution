package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabCreateEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns current ribbon tab item index
    */
  var deleteIndex: js.UndefOr[Double] = js.undefined
  /** returns the ribbon model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TabCreateEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    deleteIndex: Int | Double = null,
    model: js.Any = null,
    `type`: String = null
  ): TabCreateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (deleteIndex != null) __obj.updateDynamic("deleteIndex")(deleteIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TabCreateEventArgs]
  }
}

