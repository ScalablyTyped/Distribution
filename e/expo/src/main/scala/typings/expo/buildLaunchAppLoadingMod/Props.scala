package typings.expo.buildLaunchAppLoadingMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var autoHideSplash: js.UndefOr[Boolean] = js.native
  var onError: js.UndefOr[(js.Function1[/* error */ Error, Unit]) | Null] = js.native
  var onFinish: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var startAsync: js.UndefOr[js.Function0[js.Promise[Unit]] | Null] = js.native
}

