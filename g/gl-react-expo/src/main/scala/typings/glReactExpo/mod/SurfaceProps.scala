package typings.glReactExpo.mod

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.glReactExpo.glviewnativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate */ @js.native
trait SurfaceProps
  extends typings.glReact.mod.SurfaceProps {
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
}

object SurfaceProps {
  @scala.inline
  def apply(): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceProps]
  }
  @scala.inline
  implicit class SurfacePropsOps[Self <: SurfaceProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = this.set("onContextCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextCreate: Self = this.set("onContextCreate", js.undefined)
  }
  
}

