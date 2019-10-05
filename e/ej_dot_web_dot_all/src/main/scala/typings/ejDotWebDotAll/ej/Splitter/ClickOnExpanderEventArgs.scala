package typings.ejDotWebDotAll.ej.Splitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickOnExpanderEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the splitter model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Splitter.Model] = js.undefined
  /** returns the target element from which click action is triggered.
    */
  var targetElement: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ClickOnExpanderEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Splitter.Model = null,
    targetElement: js.Any = null,
    `type`: String = null
  ): ClickOnExpanderEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClickOnExpanderEventArgs]
  }
}

