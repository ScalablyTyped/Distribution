package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabRemoveEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the ribbon model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the removed index.
    */
  var removedIndex: js.UndefOr[Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TabRemoveEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    removedIndex: Int | Double = null,
    `type`: String = null
  ): TabRemoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (removedIndex != null) __obj.updateDynamic("removedIndex")(removedIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TabRemoveEventArgs]
  }
}

