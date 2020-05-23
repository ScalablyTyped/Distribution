package typings.ejWebAll.ej.Print

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeStartEventArgs extends js.Object {
  /** Set this option as true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the printed element
    */
  var content: js.UndefOr[js.Any] = js.undefined
  /** Returns the Print model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the name of an event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    content: js.Any = null,
    model: Model = null,
    `type`: String = null
  ): BeforeStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeStartEventArgs]
  }
}

