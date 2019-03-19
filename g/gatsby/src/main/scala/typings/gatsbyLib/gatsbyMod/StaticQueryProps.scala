package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticQueryProps extends js.Object {
  var children: js.UndefOr[gatsbyLib.RenderCallback] = js.undefined
  var query: js.Any
  var render: js.UndefOr[gatsbyLib.RenderCallback] = js.undefined
}

object StaticQueryProps {
  @scala.inline
  def apply(query: js.Any, children: gatsbyLib.RenderCallback = null, render: gatsbyLib.RenderCallback = null): StaticQueryProps = {
    val __obj = js.Dynamic.literal(query = query)
    if (children != null) __obj.updateDynamic("children")(children)
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[StaticQueryProps]
  }
}

