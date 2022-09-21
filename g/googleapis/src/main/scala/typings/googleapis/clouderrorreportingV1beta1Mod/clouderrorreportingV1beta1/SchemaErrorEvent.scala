package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaErrorEvent extends StObject {
  
  /**
    * Data about the context in which the error occurred.
    */
  var context: js.UndefOr[SchemaErrorContext] = js.undefined
  
  /**
    * Time when the event occurred as provided in the error report. If the report did not contain a timestamp, the time the error was received by the Error Reporting system is used.
    */
  var eventTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stack trace that was reported or logged by the service.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `ServiceContext` for which this error was reported.
    */
  var serviceContext: js.UndefOr[SchemaServiceContext] = js.undefined
}
object SchemaErrorEvent {
  
  inline def apply(): SchemaErrorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorEvent]
  }
  
  extension [Self <: SchemaErrorEvent](x: Self) {
    
    inline def setContext(value: SchemaErrorContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeNull: Self = StObject.set(x, "eventTime", null)
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setServiceContext(value: SchemaServiceContext): Self = StObject.set(x, "serviceContext", value.asInstanceOf[js.Any])
    
    inline def setServiceContextUndefined: Self = StObject.set(x, "serviceContext", js.undefined)
  }
}
