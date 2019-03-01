package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeLoadEventArgs extends js.Object {
  /** returns the AJAX settings object
    */
  var AjaxOptions: js.UndefOr[js.Any] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeLoadEventArgs {
  @scala.inline
  def apply(
    AjaxOptions: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    `type`: java.lang.String = null
  ): BeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (AjaxOptions != null) __obj.updateDynamic("AjaxOptions")(AjaxOptions)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeLoadEventArgs]
  }
}

