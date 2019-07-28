package typings.glDashReact.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var index: Double
  var uniform: js.UndefOr[String] = js.undefined
}

object BusProps {
  @scala.inline
  def apply(index: Double, children: js.Any = null, uniform: String = null): BusProps = {
    val __obj = js.Dynamic.literal(index = index)
    if (children != null) __obj.updateDynamic("children")(children)
    if (uniform != null) __obj.updateDynamic("uniform")(uniform)
    __obj.asInstanceOf[BusProps]
  }
}

