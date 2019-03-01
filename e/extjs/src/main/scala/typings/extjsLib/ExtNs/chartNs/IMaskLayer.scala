package typings
package extjsLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaskLayer
  extends extjsLib.ExtNs.IComponent

object IMaskLayer {
  @scala.inline
  def apply(IComponent: extjsLib.ExtNs.IComponent = null, initComponent: js.Function0[scala.Unit] = null): IMaskLayer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    __obj.asInstanceOf[IMaskLayer]
  }
}

