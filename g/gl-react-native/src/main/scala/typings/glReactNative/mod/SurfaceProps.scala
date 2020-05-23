package typings.glReactNative.mod

import typings.glReact.mod.Visitor
import typings.std.Error
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.glReactNative.glviewnativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate, onContextFailure */ trait SurfaceProps
  extends typings.glReact.mod.SurfaceProps {
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
}

object SurfaceProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onContextCreate: /* gl */ WebGLRenderingContext => Unit = null,
    onContextFailure: /* e */ Error => Unit = null,
    onLoad: () => Unit = null,
    onLoadError: /* e */ Error => Unit = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: Visitor = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1(onContextFailure))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visitor != null) __obj.updateDynamic("visitor")(visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceProps]
  }
}

