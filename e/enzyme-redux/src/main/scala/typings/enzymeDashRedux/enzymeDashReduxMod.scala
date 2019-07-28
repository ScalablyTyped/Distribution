package typings.enzymeDashRedux

import typings.enzyme.enzymeMod.ReactWrapper
import typings.enzyme.enzymeMod.ShallowWrapper
import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-redux", JSImport.Namespace)
@js.native
object enzymeDashReduxMod extends js.Object {
  def mountWithState[P](Component: ReactElement, state: js.Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object, _]] = js.native
  def mountWithStore[P](Component: ReactElement, store: js.Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object, _]] = js.native
  def shallowWithState[P](Component: ReactElement, state: js.Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object, _]] = js.native
  def shallowWithStore[P](Component: ReactElement, store: js.Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object, _]] = js.native
}

