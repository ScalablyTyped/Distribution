package typings.ejDotWebDotAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetUpdatingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current target element value.
    */
  var currentElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the previous target element value.
    */
  var previousElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the target html value.
    */
  var targetHtml: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TargetUpdatingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentElement: js.Any = null,
    model: Model = null,
    previousElement: js.Any = null,
    targetHtml: String = null,
    `type`: String = null
  ): TargetUpdatingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (previousElement != null) __obj.updateDynamic("previousElement")(previousElement.asInstanceOf[js.Any])
    if (targetHtml != null) __obj.updateDynamic("targetHtml")(targetHtml.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetUpdatingEventArgs]
  }
}

