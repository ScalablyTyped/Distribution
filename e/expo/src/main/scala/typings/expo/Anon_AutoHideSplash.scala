package typings.expo

import typings.expo.buildLaunchAppLoadingMod.Props
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHideSplash extends Props {
  var autoHideSplash: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  var startAsync: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}

object Anon_AutoHideSplash {
  @scala.inline
  def apply(
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ Error => Unit = null,
    onFinish: () => Unit = null,
    startAsync: () => js.Promise[Unit] = null
  ): Anon_AutoHideSplash = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (startAsync != null) __obj.updateDynamic("startAsync")(js.Any.fromFunction0(startAsync))
    __obj.asInstanceOf[Anon_AutoHideSplash]
  }
}

