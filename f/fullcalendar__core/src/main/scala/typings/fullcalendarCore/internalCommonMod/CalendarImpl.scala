package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarImpl
  extends StObject
     with CalendarApi {
  
  def addEvent(eventInput: EventInput, sourceInput: EventSourceImpl): EventImpl | Null = js.native
  
  def batchRendering(callback: js.Function0[Unit]): Unit = js.native
  
  var currentDataManager: js.UndefOr[CalendarDataManager] = js.native
  
  def dispatch(action: Action): Unit = js.native
  
  def getCurrentData(): CalendarData = js.native
  
  /* private */ var getUnitViewSpec: Any = js.native
  
  /* private */ var triggerEventAdd: Any = js.native
  
  def unselect(pev: PointerDragEvent): Unit = js.native
  
  @JSName("view")
  def view_MCalendarImpl: ViewImpl = js.native
}
