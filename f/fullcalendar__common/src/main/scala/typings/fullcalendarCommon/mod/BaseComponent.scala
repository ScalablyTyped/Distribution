package typings.fullcalendarCommon.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseComponent[Props, State]
  extends StObject
     with PureComponent[Props, State]
object BaseComponent {
  
  inline def apply[Props, State](
    context: ViewContext,
    debug: Boolean,
    propEquality: EqualityFuncs[Props],
    safeSetState: Partial[State] => Unit,
    shouldComponentUpdate: (Props, State) => Boolean,
    stateEquality: EqualityFuncs[State]
  ): BaseComponent[Props, State] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], propEquality = propEquality.asInstanceOf[js.Any], safeSetState = js.Any.fromFunction1(safeSetState), shouldComponentUpdate = js.Any.fromFunction2(shouldComponentUpdate), stateEquality = stateEquality.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComponent[Props, State]]
  }
}
