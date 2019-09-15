package typings.expo.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.expo.buildLaunchAppLoadingMod.default
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppLoading
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.expo.buildLaunchAppLoadingMod.default].asInstanceOf[String | js.Object]
  def apply(
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ Error => Unit = null,
    onFinish: () => Unit = null,
    startAsync: () => js.Promise[Unit] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (startAsync != null) __obj.updateDynamic("startAsync")(js.Any.fromFunction0(startAsync))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typings.expo.buildLaunchAppLoadingMod.Props
}

