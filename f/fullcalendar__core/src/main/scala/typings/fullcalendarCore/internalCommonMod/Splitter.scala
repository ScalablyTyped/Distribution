package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StringDictionary
import typings.fullcalendarCore.anon.BusinessHours
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Splitter[PropsType /* <: SplittableProps */] extends StObject {
  
  /* private */ var _getKeysForEventDefs: Any
  
  /* private */ var _splitDateSpan: Any
  
  /* private */ var _splitEventStore: Any
  
  /* private */ var _splitIndividualUi: Any
  
  /* private */ var _splitInteraction: Any
  
  /* private */ var eventUiBuilders: Any
  
  def getKeyInfo(props: PropsType): StringDictionary[BusinessHours]
  
  def getKeysForDateSpan(dateSpan: DateSpan): js.Array[String]
  
  def getKeysForEventDef(eventDef: EventDef): js.Array[String]
  
  /* private */ var getKeysForEventDefs: Any
  
  /* private */ var splitDateSelection: Any
  
  /* private */ var splitEventDrag: Any
  
  /* private */ var splitEventResize: Any
  
  /* private */ var splitEventStore: Any
  
  /* private */ var splitIndividualUi: Any
  
  def splitProps(props: PropsType): StringDictionary[SplittableProps]
}
object Splitter {
  
  inline def apply[PropsType /* <: SplittableProps */](
    _getKeysForEventDefs: Any,
    _splitDateSpan: Any,
    _splitEventStore: Any,
    _splitIndividualUi: Any,
    _splitInteraction: Any,
    eventUiBuilders: Any,
    getKeyInfo: PropsType => StringDictionary[BusinessHours],
    getKeysForDateSpan: DateSpan => js.Array[String],
    getKeysForEventDef: EventDef => js.Array[String],
    getKeysForEventDefs: Any,
    splitDateSelection: Any,
    splitEventDrag: Any,
    splitEventResize: Any,
    splitEventStore: Any,
    splitIndividualUi: Any,
    splitProps: PropsType => StringDictionary[SplittableProps]
  ): Splitter[PropsType] = {
    val __obj = js.Dynamic.literal(_getKeysForEventDefs = _getKeysForEventDefs.asInstanceOf[js.Any], _splitDateSpan = _splitDateSpan.asInstanceOf[js.Any], _splitEventStore = _splitEventStore.asInstanceOf[js.Any], _splitIndividualUi = _splitIndividualUi.asInstanceOf[js.Any], _splitInteraction = _splitInteraction.asInstanceOf[js.Any], eventUiBuilders = eventUiBuilders.asInstanceOf[js.Any], getKeyInfo = js.Any.fromFunction1(getKeyInfo), getKeysForDateSpan = js.Any.fromFunction1(getKeysForDateSpan), getKeysForEventDef = js.Any.fromFunction1(getKeysForEventDef), getKeysForEventDefs = getKeysForEventDefs.asInstanceOf[js.Any], splitDateSelection = splitDateSelection.asInstanceOf[js.Any], splitEventDrag = splitEventDrag.asInstanceOf[js.Any], splitEventResize = splitEventResize.asInstanceOf[js.Any], splitEventStore = splitEventStore.asInstanceOf[js.Any], splitIndividualUi = splitIndividualUi.asInstanceOf[js.Any], splitProps = js.Any.fromFunction1(splitProps))
    __obj.asInstanceOf[Splitter[PropsType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Splitter[?], PropsType /* <: SplittableProps */] (val x: Self & Splitter[PropsType]) extends AnyVal {
    
    inline def setEventUiBuilders(value: Any): Self = StObject.set(x, "eventUiBuilders", value.asInstanceOf[js.Any])
    
    inline def setGetKeyInfo(value: PropsType => StringDictionary[BusinessHours]): Self = StObject.set(x, "getKeyInfo", js.Any.fromFunction1(value))
    
    inline def setGetKeysForDateSpan(value: DateSpan => js.Array[String]): Self = StObject.set(x, "getKeysForDateSpan", js.Any.fromFunction1(value))
    
    inline def setGetKeysForEventDef(value: EventDef => js.Array[String]): Self = StObject.set(x, "getKeysForEventDef", js.Any.fromFunction1(value))
    
    inline def setGetKeysForEventDefs(value: Any): Self = StObject.set(x, "getKeysForEventDefs", value.asInstanceOf[js.Any])
    
    inline def setSplitDateSelection(value: Any): Self = StObject.set(x, "splitDateSelection", value.asInstanceOf[js.Any])
    
    inline def setSplitEventDrag(value: Any): Self = StObject.set(x, "splitEventDrag", value.asInstanceOf[js.Any])
    
    inline def setSplitEventResize(value: Any): Self = StObject.set(x, "splitEventResize", value.asInstanceOf[js.Any])
    
    inline def setSplitEventStore(value: Any): Self = StObject.set(x, "splitEventStore", value.asInstanceOf[js.Any])
    
    inline def setSplitIndividualUi(value: Any): Self = StObject.set(x, "splitIndividualUi", value.asInstanceOf[js.Any])
    
    inline def setSplitProps(value: PropsType => StringDictionary[SplittableProps]): Self = StObject.set(x, "splitProps", js.Any.fromFunction1(value))
    
    inline def set_getKeysForEventDefs(value: Any): Self = StObject.set(x, "_getKeysForEventDefs", value.asInstanceOf[js.Any])
    
    inline def set_splitDateSpan(value: Any): Self = StObject.set(x, "_splitDateSpan", value.asInstanceOf[js.Any])
    
    inline def set_splitEventStore(value: Any): Self = StObject.set(x, "_splitEventStore", value.asInstanceOf[js.Any])
    
    inline def set_splitIndividualUi(value: Any): Self = StObject.set(x, "_splitIndividualUi", value.asInstanceOf[js.Any])
    
    inline def set_splitInteraction(value: Any): Self = StObject.set(x, "_splitInteraction", value.asInstanceOf[js.Any])
  }
}
