package typings.expo.expoMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppLoadingProps extends js.Object {
  /**  Whether to hide the native splash screen as soon as you unmount the AppLoading component. */
  var autoHideSplash: js.UndefOr[Boolean] = js.undefined
  /** If `startAsync` throws an error, it is caught and passed into the function provided to `onError`. */
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /** Required if you provide `startAsync`. Called when `startAsync` resolves or rejects. This should be used to set state and unmount the `AppLoading` component. */
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** A `function` that returns a `Promise`. The `Promise` should resolve when the app is done loading data and assets. */
  var startAsync: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}

object AppLoadingProps {
  @scala.inline
  def apply(
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ Error => Unit = null,
    onFinish: () => Unit = null,
    startAsync: () => js.Promise[Unit] = null
  ): AppLoadingProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (startAsync != null) __obj.updateDynamic("startAsync")(js.Any.fromFunction0(startAsync))
    __obj.asInstanceOf[AppLoadingProps]
  }
}

