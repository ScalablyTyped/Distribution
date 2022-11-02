package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBusinessdataapiEventResponseMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/businessdataapi/event-response", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventResponse {
    def this(events_received: Double, events_dropped: Double) = this()
    def this(events_received: Double, events_dropped: Double, message: js.Array[Record[String, Any]]) = this()
  }
  
  @js.native
  trait EventResponse extends StObject {
    
    var _events_dropped: Double = js.native
    
    var _events_received: Double = js.native
    
    var _message: js.Array[Record[String, Any]] = js.native
    
    def events_dropped: Double = js.native
    def events_dropped_=(events_dropped: Double): Unit = js.native
    
    def events_received: Double = js.native
    def events_received_=(events_received: Double): Unit = js.native
    
    def message: js.Array[Record[String, Any]] = js.native
    def message_=(message: js.Array[Record[String, Any]]): Unit = js.native
    
    def setEventsDropped(events_dropped: Double): EventResponse = js.native
    
    def setEventsReceived(events_received: Double): EventResponse = js.native
    
    def setMessage(message: js.Array[Record[String, Any]]): EventResponse = js.native
  }
}
