package typings.electronNotify.mod

import typings.electron.Electron.BrowserWindowConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomConfig extends js.Object {
  var animateInParallel: js.UndefOr[Boolean] = js.native
  var animationStepMs: js.UndefOr[Double] = js.native
  var animationSteps: js.UndefOr[Double] = js.native
  var appIcon: js.UndefOr[String] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var defaultStyleAppIcon: js.UndefOr[js.Any] = js.native
  var defaultStyleClose: js.UndefOr[js.Any] = js.native
  var defaultStyleContainer: js.UndefOr[js.Any] = js.native
  var defaultStyleImage: js.UndefOr[js.Any] = js.native
  var defaultStyleText: js.UndefOr[js.Any] = js.native
  var defaultWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.native
  var displayTime: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[Double] = js.native
  var pathToModule: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ICustomConfig {
  @scala.inline
  def apply(): ICustomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomConfig]
  }
  @scala.inline
  implicit class ICustomConfigOps[Self <: ICustomConfig] (val x: Self) extends AnyVal {
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
    def setAnimateInParallel(value: Boolean): Self = this.set("animateInParallel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateInParallel: Self = this.set("animateInParallel", js.undefined)
    @scala.inline
    def setAnimationStepMs(value: Double): Self = this.set("animationStepMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationStepMs: Self = this.set("animationStepMs", js.undefined)
    @scala.inline
    def setAnimationSteps(value: Double): Self = this.set("animationSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationSteps: Self = this.set("animationSteps", js.undefined)
    @scala.inline
    def setAppIcon(value: String): Self = this.set("appIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppIcon: Self = this.set("appIcon", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setDefaultStyleAppIcon(value: js.Any): Self = this.set("defaultStyleAppIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyleAppIcon: Self = this.set("defaultStyleAppIcon", js.undefined)
    @scala.inline
    def setDefaultStyleClose(value: js.Any): Self = this.set("defaultStyleClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyleClose: Self = this.set("defaultStyleClose", js.undefined)
    @scala.inline
    def setDefaultStyleContainer(value: js.Any): Self = this.set("defaultStyleContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyleContainer: Self = this.set("defaultStyleContainer", js.undefined)
    @scala.inline
    def setDefaultStyleImage(value: js.Any): Self = this.set("defaultStyleImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyleImage: Self = this.set("defaultStyleImage", js.undefined)
    @scala.inline
    def setDefaultStyleText(value: js.Any): Self = this.set("defaultStyleText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyleText: Self = this.set("defaultStyleText", js.undefined)
    @scala.inline
    def setDefaultWindow(value: BrowserWindowConstructorOptions): Self = this.set("defaultWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWindow: Self = this.set("defaultWindow", js.undefined)
    @scala.inline
    def setDisplayTime(value: Double): Self = this.set("displayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayTime: Self = this.set("displayTime", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPathToModule(value: String): Self = this.set("pathToModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathToModule: Self = this.set("pathToModule", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

