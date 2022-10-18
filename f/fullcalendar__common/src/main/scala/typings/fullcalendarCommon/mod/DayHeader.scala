package typings.fullcalendarCommon.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "DayHeader")
@js.native
open class DayHeader ()
  extends StObject
     with BaseComponent[DayHeaderProps, Dictionary] {
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  def createDayHeaderFormatter(explicitFormat: DateFormatter, datesRepDistinctDays: Any, dateCnt: Any): DateFormatter = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[DayHeaderProps] = js.native
  
  def render(): Any = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[Dictionary]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: DayHeaderProps, nextState: Dictionary): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[Dictionary] = js.native
}
