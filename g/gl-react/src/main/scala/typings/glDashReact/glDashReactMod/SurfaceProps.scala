package typings.glDashReact.glDashReactMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoadError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
  var preload: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var visitor: js.UndefOr[Visitor] = js.undefined
}

object SurfaceProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onLoad: () => Unit = null,
    onLoadError: /* e */ Error => Unit = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: Visitor = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visitor != null) __obj.updateDynamic("visitor")(visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceProps]
  }
}

