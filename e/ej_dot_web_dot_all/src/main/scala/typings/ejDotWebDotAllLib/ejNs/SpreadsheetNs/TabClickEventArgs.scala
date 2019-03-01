package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabClickEventArgs extends js.Object {
  /** Returns active tab header element.
    */
  var activeHeader: js.UndefOr[js.Any] = js.undefined
  /** Returns the active tab index.
    */
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns previous active tab header element.
    */
  var prevActiveHeader: js.UndefOr[js.Any] = js.undefined
  /** Returns previous active tab index.
    */
  var prevActiveIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TabClickEventArgs {
  @scala.inline
  def apply(
    activeHeader: js.Any = null,
    activeIndex: scala.Int | scala.Double = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    prevActiveHeader: js.Any = null,
    prevActiveIndex: scala.Int | scala.Double = null,
    target: stdLib.HTMLElement = null,
    `type`: java.lang.String = null
  ): TabClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activeHeader != null) __obj.updateDynamic("activeHeader")(activeHeader)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevActiveHeader != null) __obj.updateDynamic("prevActiveHeader")(prevActiveHeader)
    if (prevActiveIndex != null) __obj.updateDynamic("prevActiveIndex")(prevActiveIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TabClickEventArgs]
  }
}

