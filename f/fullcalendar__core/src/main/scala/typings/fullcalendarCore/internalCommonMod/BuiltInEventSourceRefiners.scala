package typings.fullcalendarCore.internalCommonMod

import typings.std.BooleanConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInEventSourceRefiners extends StObject {
  
  /* standard es5 */
  def defaultAllDay[T](): Boolean
  def defaultAllDay[T](value: T): Boolean
  @JSName("defaultAllDay")
  var defaultAllDay_Original: BooleanConstructor
  
  /* standard es5 */
  def endParam(): String
  def endParam(value: Any): String
  @JSName("endParam")
  var endParam_Original: StringConstructor
  
  def eventDataTransform(raw: EventInputTransformer): EventInputTransformer
  @JSName("eventDataTransform")
  var eventDataTransform_Original: Identity[EventInputTransformer]
  
  def events(raw: js.Array[EventInput]): js.Array[EventInput] | EventSourceFunc
  def events(raw: EventSourceFunc): js.Array[EventInput] | EventSourceFunc
  @JSName("events")
  var events_Original: Identity[js.Array[EventInput] | EventSourceFunc]
  
  def extraParams(raw: js.Function0[Dictionary]): Dictionary | js.Function0[Dictionary]
  def extraParams(raw: Dictionary): Dictionary | js.Function0[Dictionary]
  @JSName("extraParams")
  var extraParams_Original: Identity[Dictionary | js.Function0[Dictionary]]
  
  def failure(raw: EventSourceErrorResponseHandler): EventSourceErrorResponseHandler
  @JSName("failure")
  var failure_Original: Identity[EventSourceErrorResponseHandler]
  
  /* standard es5 */
  def format(): String
  def format(value: Any): String
  @JSName("format")
  var format_Original: StringConstructor
  
  /* standard es5 */
  def id(): String
  def id(value: Any): String
  @JSName("id")
  var id_Original: StringConstructor
  
  /* standard es5 */
  def method(): String
  def method(value: Any): String
  @JSName("method")
  var method_Original: StringConstructor
  
  /* standard es5 */
  def startParam(): String
  def startParam(value: Any): String
  @JSName("startParam")
  var startParam_Original: StringConstructor
  
  def success(raw: EventSourceSuccessResponseHandler): EventSourceSuccessResponseHandler
  @JSName("success")
  var success_Original: Identity[EventSourceSuccessResponseHandler]
  
  /* standard es5 */
  def timeZoneParam(): String
  def timeZoneParam(value: Any): String
  @JSName("timeZoneParam")
  var timeZoneParam_Original: StringConstructor
  
  /* standard es5 */
  def url(): String
  def url(value: Any): String
  @JSName("url")
  var url_Original: StringConstructor
}
object BuiltInEventSourceRefiners {
  
  inline def apply(
    defaultAllDay: BooleanConstructor,
    endParam: StringConstructor,
    eventDataTransform: EventInputTransformer => EventInputTransformer,
    events: js.Array[EventInput] | EventSourceFunc => js.Array[EventInput] | EventSourceFunc,
    extraParams: Dictionary | js.Function0[Dictionary] => Dictionary | js.Function0[Dictionary],
    failure: EventSourceErrorResponseHandler => EventSourceErrorResponseHandler,
    format: StringConstructor,
    id: StringConstructor,
    method: StringConstructor,
    startParam: StringConstructor,
    success: EventSourceSuccessResponseHandler => EventSourceSuccessResponseHandler,
    timeZoneParam: StringConstructor,
    url: StringConstructor
  ): BuiltInEventSourceRefiners = {
    val __obj = js.Dynamic.literal(defaultAllDay = defaultAllDay.asInstanceOf[js.Any], endParam = endParam.asInstanceOf[js.Any], eventDataTransform = js.Any.fromFunction1(eventDataTransform), events = js.Any.fromFunction1(events), extraParams = js.Any.fromFunction1(extraParams), failure = js.Any.fromFunction1(failure), format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], startParam = startParam.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), timeZoneParam = timeZoneParam.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInEventSourceRefiners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuiltInEventSourceRefiners] (val x: Self) extends AnyVal {
    
    inline def setDefaultAllDay(value: BooleanConstructor): Self = StObject.set(x, "defaultAllDay", value.asInstanceOf[js.Any])
    
    inline def setEndParam(value: StringConstructor): Self = StObject.set(x, "endParam", value.asInstanceOf[js.Any])
    
    inline def setEventDataTransform(value: EventInputTransformer => EventInputTransformer): Self = StObject.set(x, "eventDataTransform", js.Any.fromFunction1(value))
    
    inline def setEvents(value: js.Array[EventInput] | EventSourceFunc => js.Array[EventInput] | EventSourceFunc): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
    
    inline def setExtraParams(value: Dictionary | js.Function0[Dictionary] => Dictionary | js.Function0[Dictionary]): Self = StObject.set(x, "extraParams", js.Any.fromFunction1(value))
    
    inline def setFailure(value: EventSourceErrorResponseHandler => EventSourceErrorResponseHandler): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setFormat(value: StringConstructor): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setId(value: StringConstructor): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: StringConstructor): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setStartParam(value: StringConstructor): Self = StObject.set(x, "startParam", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: EventSourceSuccessResponseHandler => EventSourceSuccessResponseHandler): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setTimeZoneParam(value: StringConstructor): Self = StObject.set(x, "timeZoneParam", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: StringConstructor): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
