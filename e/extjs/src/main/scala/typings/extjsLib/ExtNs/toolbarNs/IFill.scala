package typings
package extjsLib.ExtNs.toolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFill
  extends extjsLib.ExtNs.IComponent {
  /** [Property] (Boolean) */
  var isFill: js.UndefOr[scala.Boolean] = js.undefined
}

object IFill {
  @scala.inline
  def apply(IComponent: extjsLib.ExtNs.IComponent = null, isFill: js.UndefOr[scala.Boolean] = js.undefined): IFill = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(isFill)) __obj.updateDynamic("isFill")(isFill)
    __obj.asInstanceOf[IFill]
  }
}

