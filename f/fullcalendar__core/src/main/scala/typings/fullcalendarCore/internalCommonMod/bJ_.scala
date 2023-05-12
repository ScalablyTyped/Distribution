package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StringDictionary
import typings.fullcalendarCore.anon.BusinessHours
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@fullcalendar/core/internal-common", "bJ")
@js.native
open class bJ_[PropsType /* <: SplittableProps */] ()
  extends StObject
     with Splitter[PropsType] {
  
  /* private */ /* CompleteClass */
  var _getKeysForEventDefs: Any = js.native
  
  /* private */ /* CompleteClass */
  var _splitDateSpan: Any = js.native
  
  /* private */ /* CompleteClass */
  var _splitEventStore: Any = js.native
  
  /* private */ /* CompleteClass */
  var _splitIndividualUi: Any = js.native
  
  /* private */ /* CompleteClass */
  var _splitInteraction: Any = js.native
  
  /* private */ /* CompleteClass */
  var eventUiBuilders: Any = js.native
  
  /* CompleteClass */
  override def getKeyInfo(props: PropsType): StringDictionary[BusinessHours] = js.native
  
  /* CompleteClass */
  override def getKeysForDateSpan(dateSpan: DateSpan): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getKeysForEventDef(eventDef: EventDef): js.Array[String] = js.native
  
  /* private */ /* CompleteClass */
  var getKeysForEventDefs: Any = js.native
  
  /* private */ /* CompleteClass */
  var splitDateSelection: Any = js.native
  
  /* private */ /* CompleteClass */
  var splitEventDrag: Any = js.native
  
  /* private */ /* CompleteClass */
  var splitEventResize: Any = js.native
  
  /* private */ /* CompleteClass */
  var splitEventStore: Any = js.native
  
  /* private */ /* CompleteClass */
  var splitIndividualUi: Any = js.native
  
  /* CompleteClass */
  override def splitProps(props: PropsType): StringDictionary[SplittableProps] = js.native
}
