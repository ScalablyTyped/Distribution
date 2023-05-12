package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSource[Meta] extends StObject {
  
  var _raw: Any
  
  var defaultAllDay: Boolean | Null
  
  def eventDataTransform(input: EventInput): EventInput
  @JSName("eventDataTransform")
  var eventDataTransform_Original: EventInputTransformer
  
  var extendedProps: Dictionary
  
  var failure: EventSourceErrorResponseHandler | Null
  
  var fetchRange: DateRange | Null
  
  var isFetching: Boolean
  
  var latestFetchId: String
  
  var meta: Meta
  
  var publicId: String
  
  var sourceDefId: Double
  
  var sourceId: String
  
  var success: EventSourceSuccessResponseHandler | Null
  
  var ui: EventUi
}
object EventSource {
  
  inline def apply[Meta](
    _raw: Any,
    eventDataTransform: /* input */ EventInput => EventInput,
    extendedProps: Dictionary,
    isFetching: Boolean,
    latestFetchId: String,
    meta: Meta,
    publicId: String,
    sourceDefId: Double,
    sourceId: String,
    ui: EventUi
  ): EventSource[Meta] = {
    val __obj = js.Dynamic.literal(_raw = _raw.asInstanceOf[js.Any], eventDataTransform = js.Any.fromFunction1(eventDataTransform), extendedProps = extendedProps.asInstanceOf[js.Any], isFetching = isFetching.asInstanceOf[js.Any], latestFetchId = latestFetchId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], sourceDefId = sourceDefId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], defaultAllDay = null, failure = null, fetchRange = null, success = null)
    __obj.asInstanceOf[EventSource[Meta]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSource[?], Meta] (val x: Self & EventSource[Meta]) extends AnyVal {
    
    inline def setDefaultAllDay(value: Boolean): Self = StObject.set(x, "defaultAllDay", value.asInstanceOf[js.Any])
    
    inline def setDefaultAllDayNull: Self = StObject.set(x, "defaultAllDay", null)
    
    inline def setEventDataTransform(value: /* input */ EventInput => EventInput): Self = StObject.set(x, "eventDataTransform", js.Any.fromFunction1(value))
    
    inline def setExtendedProps(value: Dictionary): Self = StObject.set(x, "extendedProps", value.asInstanceOf[js.Any])
    
    inline def setFailure(value: /* error */ js.Error => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setFailureNull: Self = StObject.set(x, "failure", null)
    
    inline def setFetchRange(value: DateRange): Self = StObject.set(x, "fetchRange", value.asInstanceOf[js.Any])
    
    inline def setFetchRangeNull: Self = StObject.set(x, "fetchRange", null)
    
    inline def setIsFetching(value: Boolean): Self = StObject.set(x, "isFetching", value.asInstanceOf[js.Any])
    
    inline def setLatestFetchId(value: String): Self = StObject.set(x, "latestFetchId", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setSourceDefId(value: Double): Self = StObject.set(x, "sourceDefId", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: EventSourceSuccessResponseHandler): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setUi(value: EventUi): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def set_raw(value: Any): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
  }
}
