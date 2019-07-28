package typings.glDashReactDashExpo.glDashReactDashExpoMod

import typings.glDashReact.glDashReactMod.Visitor
import typings.std.Error
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.glDashReactDashExpo.gLViewNativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate */ trait SurfaceProps
  extends typings.glDashReact.glDashReactMod.SurfaceProps {
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
}

object SurfaceProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onContextCreate: /* gl */ WebGLRenderingContext => Unit = null,
    onLoad: () => Unit = null,
    onLoadError: /* e */ Error => Unit = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: Visitor = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (style != null) __obj.updateDynamic("style")(style)
    if (visitor != null) __obj.updateDynamic("visitor")(visitor)
    __obj.asInstanceOf[SurfaceProps]
  }
}

