package typings.enzymeDashAsyncDashHelpers.enzymeDashAsyncDashHelpersMod

import typings.enzyme.enzymeMod.EnzymeSelector
import typings.enzyme.enzymeMod.ReactWrapper
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-async-helpers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def waitForElement(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    elementSelector: EnzymeSelector
  ): js.Promise[Unit] = js.native
  def waitForElement(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    elementSelector: EnzymeSelector,
    config: Config
  ): js.Promise[Unit] = js.native
  def waitForProps(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    propsValidationFn: js.Function1[/* props */ js.Object, Boolean]
  ): js.Promise[Unit] = js.native
  def waitForProps(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    propsValidationFn: js.Function1[/* props */ js.Object, Boolean],
    config: Config
  ): js.Promise[Unit] = js.native
  def waitForState(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    stateValidationFn: js.Function1[/* state */ js.Object, Boolean]
  ): js.Promise[Unit] = js.native
  def waitForState(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    stateValidationFn: js.Function1[/* state */ js.Object, Boolean],
    config: Config
  ): js.Promise[Unit] = js.native
}

