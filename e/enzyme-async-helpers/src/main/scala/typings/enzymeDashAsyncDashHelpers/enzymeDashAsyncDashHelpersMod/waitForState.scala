package typings.enzymeDashAsyncDashHelpers.enzymeDashAsyncDashHelpersMod

import typings.enzyme.enzymeMod.ReactWrapper
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-async-helpers", "waitForState")
@js.native
object waitForState extends js.Object {
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    stateValidationFn: js.Function1[/* state */ js.Object, Boolean]
  ): js.Promise[Unit] = js.native
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    stateValidationFn: js.Function1[/* state */ js.Object, Boolean],
    config: Config
  ): js.Promise[Unit] = js.native
}

