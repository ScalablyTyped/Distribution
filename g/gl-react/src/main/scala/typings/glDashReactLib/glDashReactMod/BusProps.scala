package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var index: scala.Double
  var uniform: js.UndefOr[java.lang.String] = js.undefined
}

object BusProps {
  @scala.inline
  def apply(index: scala.Double, children: js.Any = null, uniform: java.lang.String = null): BusProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    if (children != null) __obj.updateDynamic("children")(children)
    if (uniform != null) __obj.updateDynamic("uniform")(uniform)
    __obj.asInstanceOf[BusProps]
  }
}

