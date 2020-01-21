package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabSelectEventArgs extends js.Object {
  /** Returns active tab header element.
    */
  var activeHeader: js.UndefOr[js.Any] = js.undefined
  /** Returns the active tab index.
    */
  var activeIndex: js.UndefOr[Double] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns previous active tab header element.
    */
  var prevActiveHeader: js.UndefOr[js.Any] = js.undefined
  /** Returns previous active tab index.
    */
  var prevActiveIndex: js.UndefOr[Double] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TabSelectEventArgs {
  @scala.inline
  def apply(
    activeHeader: js.Any = null,
    activeIndex: Int | Double = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    prevActiveHeader: js.Any = null,
    prevActiveIndex: Int | Double = null,
    target: HTMLElement = null,
    `type`: String = null
  ): TabSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activeHeader != null) __obj.updateDynamic("activeHeader")(activeHeader.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (prevActiveHeader != null) __obj.updateDynamic("prevActiveHeader")(prevActiveHeader.asInstanceOf[js.Any])
    if (prevActiveIndex != null) __obj.updateDynamic("prevActiveIndex")(prevActiveIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabSelectEventArgs]
  }
}

