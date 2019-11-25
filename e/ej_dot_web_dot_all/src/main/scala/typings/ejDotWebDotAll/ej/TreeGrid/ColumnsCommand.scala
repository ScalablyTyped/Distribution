package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsCommand extends js.Object {
  /** Gets or sets an object to customize command button with available ejButton properties.
    */
  var buttonOptions: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that define the command column buttons to be displayed.
    */
  var `type`: js.UndefOr[UnboundType | String] = js.undefined
}

object ColumnsCommand {
  @scala.inline
  def apply(buttonOptions: js.Any = null, `type`: UnboundType | String = null): ColumnsCommand = {
    val __obj = js.Dynamic.literal()
    if (buttonOptions != null) __obj.updateDynamic("buttonOptions")(buttonOptions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsCommand]
  }
}

