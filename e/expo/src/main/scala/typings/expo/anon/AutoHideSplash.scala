package typings.expo.anon

import typings.expo.appLoadingMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoHideSplash extends Props {
  var autoHideSplash: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ typings.std.Error, Unit]] = js.undefined
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  var startAsync: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}

object AutoHideSplash {
  @scala.inline
  def apply(
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ typings.std.Error => Unit = null,
    onFinish: () => Unit = null,
    startAsync: () => js.Promise[Unit] = null
  ): AutoHideSplash = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (startAsync != null) __obj.updateDynamic("startAsync")(js.Any.fromFunction0(startAsync))
    __obj.asInstanceOf[AutoHideSplash]
  }
}

