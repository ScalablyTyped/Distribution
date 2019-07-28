package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticQueryProps extends js.Object {
  var children: js.UndefOr[RenderCallback] = js.undefined
  var query: js.Any
  var render: js.UndefOr[RenderCallback] = js.undefined
}

object StaticQueryProps {
  @scala.inline
  def apply(query: js.Any, children: RenderCallback = null, render: RenderCallback = null): StaticQueryProps = {
    val __obj = js.Dynamic.literal(query = query)
    if (children != null) __obj.updateDynamic("children")(children)
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[StaticQueryProps]
  }
}

