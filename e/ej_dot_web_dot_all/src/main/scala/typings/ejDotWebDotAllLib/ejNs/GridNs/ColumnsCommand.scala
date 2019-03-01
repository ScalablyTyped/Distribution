package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsCommand extends js.Object {
  /** Gets or sets an object that indicates to define all the button options which are available in ejButton.
    */
  var buttonOptions: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates to add the command column button. See unboundType
    */
  var `type`: js.UndefOr[UnboundType | java.lang.String] = js.undefined
}

object ColumnsCommand {
  @scala.inline
  def apply(buttonOptions: js.Any = null, `type`: UnboundType | java.lang.String = null): ColumnsCommand = {
    val __obj = js.Dynamic.literal()
    if (buttonOptions != null) __obj.updateDynamic("buttonOptions")(buttonOptions)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsCommand]
  }
}

