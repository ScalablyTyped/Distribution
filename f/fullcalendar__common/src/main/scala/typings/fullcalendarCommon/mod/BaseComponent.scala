package typings.fullcalendarCommon.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "BaseComponent")
@js.native
abstract class BaseComponent[Props, State] ()
  extends StObject
     with PureComponent[Props, State] {
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[Props] = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[State]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: Props, nextState: State): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[State] = js.native
}
object BaseComponent {
  
  @JSImport("@fullcalendar/common", "BaseComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@fullcalendar/common", "BaseComponent.contextType")
  @js.native
  def contextType: Any = js.native
  inline def contextType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
}
