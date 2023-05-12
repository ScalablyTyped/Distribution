package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.preactMod.Component
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PureComponent[Props, State] extends Component[Props, State] {
  
  @JSName("context")
  var context_PureComponent: ViewContext = js.native
  
  var debug: Boolean = js.native
  
  var propEquality: EqualityFuncs[Props] = js.native
  
  def safeSetState(newState: Partial[State]): Unit = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MPureComponent(nextProps: Props, nextState: State): Boolean = js.native
  
  var stateEquality: EqualityFuncs[State] = js.native
}
