package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticQueryProps[T] extends js.Object {
  var children: js.UndefOr[RenderCallback[T]] = js.undefined
  var query: js.Any
  var render: js.UndefOr[RenderCallback[T]] = js.undefined
}

object StaticQueryProps {
  @scala.inline
  def apply[T](query: js.Any, children: RenderCallback[T] = null, render: RenderCallback[T] = null): StaticQueryProps[T] = {
    val __obj = js.Dynamic.literal(query = query)
    if (children != null) __obj.updateDynamic("children")(children)
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[StaticQueryProps[T]]
  }
}

