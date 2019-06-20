package typings
package enzymeDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-redux", JSImport.Namespace)
@js.native
object enzymeDashReduxMod extends js.Object {
  def mountWithState[P](Component: reactLib.reactMod.ReactElement, state: js.Any): enzymeLib.enzymeMod.ReactWrapper[P, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def mountWithStore[P](Component: reactLib.reactMod.ReactElement, store: js.Any): enzymeLib.enzymeMod.ReactWrapper[P, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def shallowWithState[P](Component: reactLib.reactMod.ReactElement, state: js.Any): enzymeLib.enzymeMod.ShallowWrapper[P, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def shallowWithStore[P](Component: reactLib.reactMod.ReactElement, store: js.Any): enzymeLib.enzymeMod.ShallowWrapper[P, js.Object, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
}

