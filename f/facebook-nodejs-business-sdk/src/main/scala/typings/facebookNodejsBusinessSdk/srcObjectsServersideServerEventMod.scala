package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsServersideServerEventMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/serverside/server-event", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ServerEvent {
    def this(
      event_name: String,
      event_time: Double,
      event_source_url: String,
      user_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default,
      custom_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default,
      event_id: String,
      opt_out: Boolean,
      action_source: String,
      data_processing_options: js.Array[String],
      data_processing_options_country: Double,
      data_processing_options_state: Double
    ) = this()
  }
  
  @js.native
  trait ServerEvent extends StObject {
    
    var _action_source: String = js.native
    
    var _custom_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default = js.native
    
    var _data_processing_options: js.Array[String] = js.native
    
    var _data_processing_options_country: Double = js.native
    
    var _data_processing_options_state: Double = js.native
    
    var _event_id: String = js.native
    
    var _event_name: String = js.native
    
    var _event_source_url: String = js.native
    
    var _event_time: Double = js.native
    
    var _opt_out: Boolean = js.native
    
    var _user_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default = js.native
    
    def action_source: String = js.native
    def action_source_=(action_source: String): Unit = js.native
    
    def custom_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default = js.native
    def custom_data_=(custom_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default): Unit = js.native
    
    def data_processing_options: js.Array[String] = js.native
    def data_processing_options_=(data_processing_options: js.Array[String]): Unit = js.native
    
    def data_processing_options_country: Double = js.native
    def data_processing_options_country_=(data_processing_options_country: Double): Unit = js.native
    
    def data_processing_options_state: Double = js.native
    def data_processing_options_state_=(data_processing_options_state: Double): Unit = js.native
    
    def event_id: String = js.native
    def event_id_=(event_id: String): Unit = js.native
    
    def event_name: String = js.native
    def event_name_=(event_name: String): Unit = js.native
    
    def event_source_url: String = js.native
    def event_source_url_=(event_source_url: String): Unit = js.native
    
    def event_time: Double = js.native
    def event_time_=(event_time: Double): Unit = js.native
    
    def normalize(): Record[String, Any] = js.native
    
    def opt_out: Boolean = js.native
    def opt_out_=(opt_out: Boolean): Unit = js.native
    
    def setActionSource(action_source: String): ServerEvent = js.native
    
    def setCustomData(custom_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default): ServerEvent = js.native
    
    def setDataProcessingOptions(data_processing_options: js.Array[String]): ServerEvent = js.native
    
    def setDataProcessingOptionsCountry(data_processing_options_country: Double): ServerEvent = js.native
    
    def setDataProcessingOptionsState(data_processing_options_state: Double): ServerEvent = js.native
    
    def setEventId(event_id: String): ServerEvent = js.native
    
    def setEventName(event_name: String): ServerEvent = js.native
    
    def setEventSourceUrl(event_source_url: String): ServerEvent = js.native
    
    def setEventTime(event_time: Double): ServerEvent = js.native
    
    def setOptOut(opt_out: Boolean): ServerEvent = js.native
    
    def setUserData(user_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default): ServerEvent = js.native
    
    def user_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default = js.native
    def user_data_=(user_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default): Unit = js.native
  }
}
