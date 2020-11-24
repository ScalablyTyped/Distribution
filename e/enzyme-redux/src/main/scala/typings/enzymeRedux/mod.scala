package typings.enzymeRedux

import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enzyme-redux", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def mountWithState[P](Component: ReactElement, state: js.Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object, _]] = js.native
  
  def mountWithStore[P](Component: ReactElement, store: js.Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object, _]] = js.native
  
  def shallowWithState[P](Component: ReactElement, state: js.Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object, _]] = js.native
  
  def shallowWithStore[P](Component: ReactElement, store: js.Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object, _]] = js.native
}
