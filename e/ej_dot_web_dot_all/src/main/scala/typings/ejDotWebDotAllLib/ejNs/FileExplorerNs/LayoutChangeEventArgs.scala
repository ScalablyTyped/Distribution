package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutChangeEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** return true when we change the layout via interaction, else false.
    */
  var isInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current view type.
    */
  var layoutType: js.UndefOr[java.lang.String] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LayoutChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    isInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    layoutType: java.lang.String = null,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): LayoutChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (layoutType != null) __obj.updateDynamic("layoutType")(layoutType)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LayoutChangeEventArgs]
  }
}

