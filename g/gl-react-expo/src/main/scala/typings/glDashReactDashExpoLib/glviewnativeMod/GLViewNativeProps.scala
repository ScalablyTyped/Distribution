package typings
package glDashReactDashExpoLib.glviewnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLViewNativeProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object GLViewNativeProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onContextCreate: js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit] = null,
    style: js.Any = null
  ): GLViewNativeProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(onContextCreate)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GLViewNativeProps]
  }
}

