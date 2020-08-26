package typings.fluentBundle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluentBundleConstructorOptions extends js.Object {
  var functions: js.UndefOr[js.Object] = js.native
  var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var useIsolating: js.UndefOr[Boolean] = js.native
}

object FluentBundleConstructorOptions {
  @scala.inline
  def apply(): FluentBundleConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FluentBundleConstructorOptions]
  }
  @scala.inline
  implicit class FluentBundleConstructorOptionsOps[Self <: FluentBundleConstructorOptions] (val x: Self) extends AnyVal {
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
    def setFunctions(value: js.Object): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setTransform(value: /* repeated */ js.Any => _): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setUseIsolating(value: Boolean): Self = this.set("useIsolating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseIsolating: Self = this.set("useIsolating", js.undefined)
  }
  
}

