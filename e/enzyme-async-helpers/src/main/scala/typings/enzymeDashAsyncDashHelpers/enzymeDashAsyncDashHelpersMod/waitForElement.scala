package typings.enzymeDashAsyncDashHelpers.enzymeDashAsyncDashHelpersMod

import typings.enzyme.enzymeMod.EnzymeSelector
import typings.enzyme.enzymeMod.ReactWrapper
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-async-helpers", "waitForElement")
@js.native
object waitForElement extends js.Object {
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    elementSelector: EnzymeSelector
  ): js.Promise[Unit] = js.native
  def apply(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    elementSelector: EnzymeSelector,
    config: Config
  ): js.Promise[Unit] = js.native
}

