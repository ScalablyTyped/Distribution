package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<CalendarDataProviderProps, CalendarData> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<CalendarDataProviderProps, CalendarData> * / any */ @JSImport("@fullcalendar/common", "CalendarDataProvider")
@js.native
open class CalendarDataProvider protected () extends StObject {
  def this(props: CalendarDataProviderProps) = this()
  
  def componentDidUpdate(prevProps: CalendarDataProviderProps): Unit = js.native
  
  var dataManager: CalendarDataManager = js.native
  
  def handleData(data: CalendarData): Unit = js.native
  
  def render(): Any = js.native
}
