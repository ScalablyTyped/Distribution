package typings.extjs.ExtNs.toolbarNs

import typings.extjs.ExtNs.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpacer extends IComponent

object ISpacer {
  @scala.inline
  def apply(IComponent: IComponent = null, baseCls: java.lang.String = null): ISpacer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    __obj.asInstanceOf[ISpacer]
  }
}

