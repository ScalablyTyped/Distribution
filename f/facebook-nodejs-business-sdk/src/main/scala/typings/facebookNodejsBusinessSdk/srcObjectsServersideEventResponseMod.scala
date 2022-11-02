package typings.facebookNodejsBusinessSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsServersideEventResponseMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/serverside/event-response", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventResponse {
    def this(
      events_received: Double,
      messages: js.Array[String],
      fbtrace_id: String,
      id: String,
      num_processed_entries: Double
    ) = this()
  }
  
  @js.native
  trait EventResponse extends StObject {
    
    var _events_received: Double = js.native
    
    var _fbtrace_id: String = js.native
    
    var _id: String = js.native
    
    var _messages: js.Array[String] = js.native
    
    var _num_processed_entries: Double = js.native
    
    def events_received: Double = js.native
    def events_received_=(events_received: Double): Unit = js.native
    
    def fbtrace_id: String = js.native
    def fbtrace_id_=(fbtrace_id: String): Unit = js.native
    
    def id: String = js.native
    def id_=(id: String): Unit = js.native
    
    def messages: js.Array[String] = js.native
    def messages_=(messages: js.Array[String]): Unit = js.native
    
    def num_processed_entries: Double = js.native
    def num_processed_entries_=(num_processed_entries: Double): Unit = js.native
    
    def setEventsReceived(events_received: Double): EventResponse = js.native
    
    def setFbtraceId(fbtrace_id: String): EventResponse = js.native
    
    def setMessages(messages: js.Array[String]): EventResponse = js.native
  }
}
