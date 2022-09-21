package typings.fullcalendarCommon.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<Props, State> * / any */ trait PureComponent[Props, State] extends StObject {
  
  var context: ViewContext
  
  var debug: Boolean
  
  var propEquality: EqualityFuncs[Props]
  
  def safeSetState(newState: Partial[State]): Unit
  
  def shouldComponentUpdate(nextProps: Props, nextState: State): Boolean
  
  var stateEquality: EqualityFuncs[State]
}
object PureComponent {
  
  inline def apply[Props, State](
    context: ViewContext,
    debug: Boolean,
    propEquality: EqualityFuncs[Props],
    safeSetState: Partial[State] => Unit,
    shouldComponentUpdate: (Props, State) => Boolean,
    stateEquality: EqualityFuncs[State]
  ): PureComponent[Props, State] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], propEquality = propEquality.asInstanceOf[js.Any], safeSetState = js.Any.fromFunction1(safeSetState), shouldComponentUpdate = js.Any.fromFunction2(shouldComponentUpdate), stateEquality = stateEquality.asInstanceOf[js.Any])
    __obj.asInstanceOf[PureComponent[Props, State]]
  }
  
  extension [Self <: PureComponent[?, ?], Props, State](x: Self & (PureComponent[Props, State])) {
    
    inline def setContext(value: ViewContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setPropEquality(value: EqualityFuncs[Props]): Self = StObject.set(x, "propEquality", value.asInstanceOf[js.Any])
    
    inline def setSafeSetState(value: Partial[State] => Unit): Self = StObject.set(x, "safeSetState", js.Any.fromFunction1(value))
    
    inline def setShouldComponentUpdate(value: (Props, State) => Boolean): Self = StObject.set(x, "shouldComponentUpdate", js.Any.fromFunction2(value))
    
    inline def setStateEquality(value: EqualityFuncs[State]): Self = StObject.set(x, "stateEquality", value.asInstanceOf[js.Any])
  }
}
