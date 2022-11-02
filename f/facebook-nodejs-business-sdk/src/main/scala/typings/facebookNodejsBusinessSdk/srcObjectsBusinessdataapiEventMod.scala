package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBusinessdataapiEventMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/businessdataapi/event", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Event {
    def this(
      event_name: String,
      event_time: Double,
      user_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default,
      custom_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiCustomDataMod.default,
      event_id: String,
      data_processing_options: js.Array[String],
      data_processing_options_country: Double,
      data_processing_options_state: Double
    ) = this()
  }
  
  @js.native
  trait Event extends StObject {
    
    var _custom_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiCustomDataMod.default = js.native
    
    var _data_processing_options: js.Array[String] = js.native
    
    var _data_processing_options_country: Double = js.native
    
    var _data_processing_options_state: Double = js.native
    
    var _event_id: String = js.native
    
    var _event_name: String = js.native
    
    var _event_time: Double = js.native
    
    var _user_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default = js.native
    
    def custom_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiCustomDataMod.default = js.native
    def custom_data_=(custom_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiCustomDataMod.default): Unit = js.native
    
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
    
    def event_time: Double = js.native
    def event_time_=(event_time: Double): Unit = js.native
    
    def toJson(): Record[String, Any] = js.native
    
    def user_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default = js.native
    def user_data_=(user_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default): Unit = js.native
  }
}
