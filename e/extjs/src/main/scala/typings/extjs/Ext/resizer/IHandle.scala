package typings.extjs.Ext.resizer

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandle extends IComponent

object IHandle {
  @scala.inline
  def apply(IComponent: IComponent = null): IHandle = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    __obj.asInstanceOf[IHandle]
  }
}

