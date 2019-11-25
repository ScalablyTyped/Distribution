package typings.extjs.Ext.toolbar

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpacer extends IComponent

object ISpacer {
  @scala.inline
  def apply(IComponent: IComponent = null): ISpacer = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    __obj.asInstanceOf[ISpacer]
  }
}

