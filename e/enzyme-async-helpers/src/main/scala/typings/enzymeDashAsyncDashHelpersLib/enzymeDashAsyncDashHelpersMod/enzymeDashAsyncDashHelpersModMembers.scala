package typings
package enzymeDashAsyncDashHelpersLib.enzymeDashAsyncDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-async-helpers", JSImport.Namespace)
@js.native
object enzymeDashAsyncDashHelpersModMembers extends js.Object {
  def waitForElement(
    wrapper: enzymeLib.enzymeMod.ReactWrapper[js.Object, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]],
    elementSelector: enzymeLib.enzymeMod.EnzymeSelector
  ): js.Promise[scala.Unit] = js.native
  def waitForElement(
    wrapper: enzymeLib.enzymeMod.ReactWrapper[js.Object, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]],
    elementSelector: enzymeLib.enzymeMod.EnzymeSelector,
    config: Config
  ): js.Promise[scala.Unit] = js.native
  def waitForProps(
    wrapper: enzymeLib.enzymeMod.ReactWrapper[js.Object, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]],
    propsValidationFn: js.Function1[/* props */ js.Object, scala.Boolean]
  ): js.Promise[scala.Unit] = js.native
  def waitForProps(
    wrapper: enzymeLib.enzymeMod.ReactWrapper[js.Object, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]],
    propsValidationFn: js.Function1[/* props */ js.Object, scala.Boolean],
    config: Config
  ): js.Promise[scala.Unit] = js.native
  def waitForState(
    wrapper: enzymeLib.enzymeMod.ReactWrapper[js.Object, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]],
    stateValidationFn: js.Function1[/* state */ js.Object, scala.Boolean]
  ): js.Promise[scala.Unit] = js.native
  def waitForState(
    wrapper: enzymeLib.enzymeMod.ReactWrapper[js.Object, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]],
    stateValidationFn: js.Function1[/* state */ js.Object, scala.Boolean],
    config: Config
  ): js.Promise[scala.Unit] = js.native
}

