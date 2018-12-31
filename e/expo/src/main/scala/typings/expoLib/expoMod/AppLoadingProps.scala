package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppLoadingProps extends js.Object {
  /** If `startAsync` throws an error, it is caught and passed into the function provided to `onError`. */
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  /** Required if you provide `startAsync`. Called when `startAsync` resolves or rejects. This should be used to set state and unmount the `AppLoading` component. */
  var onFinish: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** A `function` that returns a `Promise`. The `Promise` should resolve when the app is done loading data and assets. */
  var startAsync: js.UndefOr[js.Function0[js.Promise[scala.Unit]]] = js.undefined
}

