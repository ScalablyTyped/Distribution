package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSignalEventRequestMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/signal/event-request", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventRequest {
    def this(
      access_token: String,
      pixel_id: String,
      page_id: String,
      events: js.UndefOr[js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalEventMod.default]],
      partner_agent: js.UndefOr[String | Null],
      test_event_code: js.UndefOr[String | Null],
      namespace_id: js.UndefOr[String | Null],
      upload_id: js.UndefOr[String | Null],
      upload_tag: js.UndefOr[String | Null],
      upload_source: js.UndefOr[String | Null],
      debug_mode_flag: js.UndefOr[Boolean],
      http_service: js.UndefOr[
            typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default | Null
          ]
    ) = this()
  }
  
  @js.native
  trait EventRequest extends StObject {
    
    var _business_data_event_request: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiEventRequestMod.default = js.native
    
    var _server_event_request: typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default = js.native
    
    def access_token: String = js.native
    def access_token_=(access_token: String): Unit = js.native
    
    def debug_mode: Boolean = js.native
    def debug_mode_=(debug_mode: Boolean): Unit = js.native
    
    def events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalEventMod.default] = js.native
    def events_=(events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalEventMod.default]): Unit = js.native
    
    def execute(): js.Promise[Record[String, Any]] = js.native
    
    def http_service: typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default = js.native
    def http_service_=(
      http_service: typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default
    ): Unit = js.native
    
    def namespace_id: String = js.native
    def namespace_id_=(namespace_id: String): Unit = js.native
    
    def partner_agent: String = js.native
    def partner_agent_=(partner_agent: String): Unit = js.native
    
    def pixel_id: String = js.native
    def pixel_id_=(pixel_id: String): Unit = js.native
    
    def setAccessToken(access_token: String): EventRequest = js.native
    
    def setDebugMode(debug_mode: Boolean): EventRequest = js.native
    
    def setEvents(events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalEventMod.default]): EventRequest = js.native
    
    def setHttpService(
      http_service: typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default
    ): EventRequest = js.native
    
    def setNamespaceId(namespace_id: String): EventRequest = js.native
    
    def setPartnerAgent(partner_agent: String): EventRequest = js.native
    
    def setPixelId(pixel_id: String): EventRequest = js.native
    
    def setTestEventCode(test_event_code: String): EventRequest = js.native
    
    def setUploadId(upload_id: String): EventRequest = js.native
    
    def setUploadSource(upload_source: String): EventRequest = js.native
    
    def setUploadTag(upload_tag: String): EventRequest = js.native
    
    def test_event_code: String = js.native
    def test_event_code_=(test_event_code: String): Unit = js.native
    
    def upload_id: String = js.native
    def upload_id_=(upload_id: String): Unit = js.native
    
    def upload_source: String = js.native
    def upload_source_=(upload_source: String): Unit = js.native
    
    def upload_tag: String = js.native
    def upload_tag_=(upload_tag: String): Unit = js.native
  }
}
