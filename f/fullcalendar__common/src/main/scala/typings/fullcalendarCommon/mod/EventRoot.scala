package typings.fullcalendarCommon.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "EventRoot")
@js.native
open class EventRoot ()
  extends StObject
     with BaseComponent[EventRootProps, Dictionary] {
  
  def componentDidMount(): Unit = js.native
  
  def componentDidUpdate(prevProps: EventRootProps): Unit = js.native
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  var elRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObject<HTMLElement> */ Any = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[EventRootProps] = js.native
  
  def render(): Any = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[Dictionary]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: EventRootProps, nextState: Dictionary): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[Dictionary] = js.native
}
