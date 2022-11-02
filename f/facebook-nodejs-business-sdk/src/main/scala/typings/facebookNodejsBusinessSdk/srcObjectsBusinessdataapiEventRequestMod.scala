package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBusinessdataapiEventRequestMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/businessdataapi/event-request", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventRequest {
    def this(access_token: String, page_id: String) = this()
    def this(
      access_token: String,
      page_id: String,
      events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiEventMod.default]
    ) = this()
    def this(
      access_token: String,
      page_id: String,
      events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiEventMod.default],
      partner_agent: String
    ) = this()
    def this(access_token: String, page_id: String, events: Unit, partner_agent: String) = this()
  }
  
  @js.native
  trait EventRequest extends StObject {
    
    var _access_token: String = js.native
    
    var _api: Record[String, Any] = js.native
    
    var _events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiEventMod.default] = js.native
    
    var _page_id: String = js.native
    
    var _partner_agent: js.UndefOr[String | Null] = js.native
    
    def access_token: String = js.native
    def access_token_=(access_token: String): Unit = js.native
    
    def events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiEventMod.default] = js.native
    def events_=(events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiEventMod.default]): Unit = js.native
    
    def execute(): js.Promise[
        typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiEventResponseMod.default
      ] = js.native
    
    def page_id: String = js.native
    def page_id_=(page_id: String): Unit = js.native
    
    def partner_agent: js.UndefOr[String | Null] = js.native
    def partner_agent_=(partner_agent: js.UndefOr[String | Null]): Unit = js.native
    
    def setAccessToken(access_token: String): EventRequest = js.native
    
    def setEvents(events: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiEventMod.default]): EventRequest = js.native
    
    def setPageId(page_id: String): EventRequest = js.native
    
    def setPartnerAgent(partner_agent: String): EventRequest = js.native
  }
}
