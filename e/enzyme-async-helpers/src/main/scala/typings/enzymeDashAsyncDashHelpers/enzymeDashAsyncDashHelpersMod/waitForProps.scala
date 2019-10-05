package typings.enzymeDashAsyncDashHelpers.enzymeDashAsyncDashHelpersMod

import typings.enzyme.enzymeMod.ReactWrapper
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-async-helpers", "waitForProps")
@js.native
object waitForProps extends js.Object {
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    propsValidationFn: js.Function1[/* props */ js.Object, Boolean]
  ): js.Promise[Unit] = js.native
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    propsValidationFn: js.Function1[/* props */ js.Object, Boolean],
    config: Config
  ): js.Promise[Unit] = js.native
}

