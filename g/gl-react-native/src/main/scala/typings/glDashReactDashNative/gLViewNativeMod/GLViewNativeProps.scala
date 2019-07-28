package typings.glDashReactDashNative.gLViewNativeMod

import typings.std.Error
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLViewNativeProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object GLViewNativeProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onContextCreate: /* gl */ WebGLRenderingContext => Unit = null,
    onContextFailure: /* e */ Error => Unit = null,
    style: js.Any = null
  ): GLViewNativeProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1(onContextFailure))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GLViewNativeProps]
  }
}

