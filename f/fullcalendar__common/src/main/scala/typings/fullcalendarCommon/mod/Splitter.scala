package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fullcalendarCommon.anon.BusinessHours
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@fullcalendar/common", "Splitter")
@js.native
open class Splitter[PropsType /* <: SplittableProps */] () extends StObject {
  
  /* private */ var _getKeysForEventDefs: Any = js.native
  
  /* private */ var _splitDateSpan: Any = js.native
  
  /* private */ var _splitEventStore: Any = js.native
  
  /* private */ var _splitIndividualUi: Any = js.native
  
  /* private */ var _splitInteraction: Any = js.native
  
  /* private */ var eventUiBuilders: Any = js.native
  
  def getKeyInfo(props: PropsType): StringDictionary[BusinessHours] = js.native
  
  def getKeysForDateSpan(dateSpan: DateSpan): js.Array[String] = js.native
  
  def getKeysForEventDef(eventDef: EventDef): js.Array[String] = js.native
  
  /* private */ var getKeysForEventDefs: Any = js.native
  
  /* private */ var splitDateSelection: Any = js.native
  
  /* private */ var splitEventDrag: Any = js.native
  
  /* private */ var splitEventResize: Any = js.native
  
  /* private */ var splitEventStore: Any = js.native
  
  /* private */ var splitIndividualUi: Any = js.native
  
  def splitProps(props: PropsType): StringDictionary[SplittableProps] = js.native
}
