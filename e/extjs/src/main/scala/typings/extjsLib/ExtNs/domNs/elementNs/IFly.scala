package typings
package extjsLib.ExtNs.domNs.elementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFly
  extends extjsLib.ExtNs.domNs.IElement {
  /** [Property] (Boolean) */
  var isFly: js.UndefOr[scala.Boolean] = js.undefined
}

object IFly {
  @scala.inline
  def apply(IElement: extjsLib.ExtNs.domNs.IElement = null, isFly: js.UndefOr[scala.Boolean] = js.undefined): IFly = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IElement)
    if (!js.isUndefined(isFly)) __obj.updateDynamic("isFly")(isFly)
    __obj.asInstanceOf[IFly]
  }
}

