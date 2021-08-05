package typings.enzymeRedux

import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme-redux", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mountWithState[P](Component: ReactElement, state: js.Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithState")(Component.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, js.Object, Component[js.Object, js.Object, js.Any]]]
  
  inline def mountWithStore[P](Component: ReactElement, store: js.Any): ReactWrapper[P, js.Object, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithStore")(Component.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, js.Object, Component[js.Object, js.Object, js.Any]]]
  
  inline def shallowWithState[P](Component: ReactElement, state: js.Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithState")(Component.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, js.Object, Component[js.Object, js.Object, js.Any]]]
  
  inline def shallowWithStore[P](Component: ReactElement, store: js.Any): ShallowWrapper[P, js.Object, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithStore")(Component.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, js.Object, Component[js.Object, js.Object, js.Any]]]
}
