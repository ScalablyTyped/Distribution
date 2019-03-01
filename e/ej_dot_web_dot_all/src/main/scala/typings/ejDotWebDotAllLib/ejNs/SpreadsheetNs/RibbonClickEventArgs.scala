package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonClickEventArgs extends js.Object {
  /** Returns element Id.
    */
  var Id: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns isChecked in boolean.
    */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns target information.
    */
  var prop: js.UndefOr[js.Any] = js.undefined
  /** Returns status.
    */
  var status: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RibbonClickEventArgs {
  @scala.inline
  def apply(
    Id: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    isChecked: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    prop: js.Any = null,
    status: js.UndefOr[scala.Boolean] = js.undefined,
    target: stdLib.HTMLElement = null,
    `type`: java.lang.String = null
  ): RibbonClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prop != null) __obj.updateDynamic("prop")(prop)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RibbonClickEventArgs]
  }
}

