package typings
package extjsLib.ExtNs.resizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandle
  extends extjsLib.ExtNs.IComponent

object IHandle {
  @scala.inline
  def apply(IComponent: extjsLib.ExtNs.IComponent = null, region: js.Any = null): IHandle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[IHandle]
  }
}

