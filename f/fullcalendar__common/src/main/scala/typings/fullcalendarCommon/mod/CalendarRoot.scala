package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.anon.ForPrint
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "CalendarRoot")
@js.native
open class CalendarRoot ()
  extends StObject
     with BaseComponent[CalendarRootProps, CalendarRootState] {
  
  def componentDidMount(): Unit = js.native
  
  def componentWillUnmount(): Unit = js.native
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  def handleAfterPrint(): Unit = js.native
  
  def handleBeforePrint(): Unit = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[CalendarRootProps] = js.native
  
  def render(): Any = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[CalendarRootState]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: CalendarRootProps, nextState: CalendarRootState): Boolean = js.native
  
  var state: ForPrint = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[CalendarRootState] = js.native
}
