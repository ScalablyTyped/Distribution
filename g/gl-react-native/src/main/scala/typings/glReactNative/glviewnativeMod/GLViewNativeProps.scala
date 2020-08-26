package typings.glReactNative.glviewnativeMod

import typings.std.Error
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GLViewNativeProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.native
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
  var onContextFailure: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
  var style: js.UndefOr[js.Any] = js.native
}

object GLViewNativeProps {
  @scala.inline
  def apply(): GLViewNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GLViewNativeProps]
  }
  @scala.inline
  implicit class GLViewNativePropsOps[Self <: GLViewNativeProps] (val x: Self) extends AnyVal {
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
    def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = this.set("onContextCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextCreate: Self = this.set("onContextCreate", js.undefined)
    @scala.inline
    def setOnContextFailure(value: /* e */ Error => Unit): Self = this.set("onContextFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextFailure: Self = this.set("onContextFailure", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

