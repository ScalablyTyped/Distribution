package typings.extjs.ExtNs.chartNs

import typings.extjs.ExtNs.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaskLayer extends IComponent

object IMaskLayer {
  @scala.inline
  def apply(IComponent: IComponent = null, initComponent: () => Unit = null): IMaskLayer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    __obj.asInstanceOf[IMaskLayer]
  }
}

