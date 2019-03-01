package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetUpdatingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
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
  var targetHtml: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TargetUpdatingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentElement: js.Any = null,
    model: Model = null,
    previousElement: js.Any = null,
    targetHtml: java.lang.String = null,
    `type`: java.lang.String = null
  ): TargetUpdatingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentElement != null) __obj.updateDynamic("currentElement")(currentElement)
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousElement != null) __obj.updateDynamic("previousElement")(previousElement)
    if (targetHtml != null) __obj.updateDynamic("targetHtml")(targetHtml)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TargetUpdatingEventArgs]
  }
}

