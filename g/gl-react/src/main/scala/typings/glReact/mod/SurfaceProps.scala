package typings.glReact.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurfaceProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoadError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
  var preload: js.UndefOr[js.Array[_]] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var visitor: js.UndefOr[Visitor] = js.native
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
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadError(value: /* e */ Error => Unit): Self = this.set("onLoadError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadError: Self = this.set("onLoadError", js.undefined)
    @scala.inline
    def setPreloadVarargs(value: js.Any*): Self = this.set("preload", js.Array(value :_*))
    @scala.inline
    def setPreload(value: js.Array[_]): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVisitor(value: Visitor): Self = this.set("visitor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisitor: Self = this.set("visitor", js.undefined)
  }
  
}

