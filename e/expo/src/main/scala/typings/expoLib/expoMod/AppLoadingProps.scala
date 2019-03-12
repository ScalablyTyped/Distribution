package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppLoadingProps extends js.Object {
  /**  Whether to hide the native splash screen as soon as you unmount the AppLoading component. */
  var autoHideSplash: js.UndefOr[scala.Boolean] = js.undefined
  /** If `startAsync` throws an error, it is caught and passed into the function provided to `onError`. */
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  /** Required if you provide `startAsync`. Called when `startAsync` resolves or rejects. This should be used to set state and unmount the `AppLoading` component. */
  var onFinish: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** A `function` that returns a `Promise`. The `Promise` should resolve when the app is done loading data and assets. */
  var startAsync: js.UndefOr[js.Function0[js.Promise[scala.Unit]]] = js.undefined
}

object AppLoadingProps {
  @scala.inline
  def apply(
    autoHideSplash: js.UndefOr[scala.Boolean] = js.undefined,
    onError: /* error */ stdLib.Error => scala.Unit = null,
    onFinish: () => scala.Unit = null,
    startAsync: () => js.Promise[scala.Unit] = null
  ): AppLoadingProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (startAsync != null) __obj.updateDynamic("startAsync")(js.Any.fromFunction0(startAsync))
    __obj.asInstanceOf[AppLoadingProps]
  }
}

