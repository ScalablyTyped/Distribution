package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.Instantiable11
import org.scalablytyped.runtime.Instantiable12
import typings.facebookNodejsBusinessSdk.mod.^
import typings.facebookNodejsBusinessSdk.srcObjectsServersideEventRequestMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("facebook-nodejs-business-sdk", "EventRequest")
@js.native
open class EventRequest protected () extends default {
  def this(
    access_token: String,
    pixel_id: String,
    events: js.UndefOr[
        js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]
      ],
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
object EventRequest {
  
  inline def apply: (Instantiable11[
    /* access_token */ String, 
    /* pixel_id */ String, 
    /* events */ js.UndefOr[
      js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]
    ], 
    /* partner_agent */ js.UndefOr[String | Null], 
    /* test_event_code */ js.UndefOr[String | Null], 
    /* namespace_id */ js.UndefOr[String | Null], 
    /* upload_id */ js.UndefOr[String | Null], 
    /* upload_tag */ js.UndefOr[String | Null], 
    /* upload_source */ js.UndefOr[String | Null], 
    /* debug_mode_flag */ js.UndefOr[Boolean], 
    /* http_service */ js.UndefOr[
      typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default | Null
    ], 
    default
  ]) & (Instantiable12[
    /* access_token */ String, 
    /* pixel_id */ String, 
    /* page_id */ String, 
    /* events */ js.UndefOr[js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalEventMod.default]], 
    /* partner_agent */ js.UndefOr[String | Null], 
    /* test_event_code */ js.UndefOr[String | Null], 
    /* namespace_id */ js.UndefOr[String | Null], 
    /* upload_id */ js.UndefOr[String | Null], 
    /* upload_tag */ js.UndefOr[String | Null], 
    /* upload_source */ js.UndefOr[String | Null], 
    /* debug_mode_flag */ js.UndefOr[Boolean], 
    /* http_service */ js.UndefOr[
      typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default | Null
    ], 
    typings.facebookNodejsBusinessSdk.srcObjectsSignalEventRequestMod.default
  ]) = ^.asInstanceOf[js.Dynamic].selectDynamic("EventRequest").asInstanceOf[(Instantiable11[
    /* access_token */ String, 
    /* pixel_id */ String, 
    /* events */ js.UndefOr[
      js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default]
    ], 
    /* partner_agent */ js.UndefOr[String | Null], 
    /* test_event_code */ js.UndefOr[String | Null], 
    /* namespace_id */ js.UndefOr[String | Null], 
    /* upload_id */ js.UndefOr[String | Null], 
    /* upload_tag */ js.UndefOr[String | Null], 
    /* upload_source */ js.UndefOr[String | Null], 
    /* debug_mode_flag */ js.UndefOr[Boolean], 
    /* http_service */ js.UndefOr[
      typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default | Null
    ], 
    default
  ]) & (Instantiable12[
    /* access_token */ String, 
    /* pixel_id */ String, 
    /* page_id */ String, 
    /* events */ js.UndefOr[js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalEventMod.default]], 
    /* partner_agent */ js.UndefOr[String | Null], 
    /* test_event_code */ js.UndefOr[String | Null], 
    /* namespace_id */ js.UndefOr[String | Null], 
    /* upload_id */ js.UndefOr[String | Null], 
    /* upload_tag */ js.UndefOr[String | Null], 
    /* upload_source */ js.UndefOr[String | Null], 
    /* debug_mode_flag */ js.UndefOr[Boolean], 
    /* http_service */ js.UndefOr[
      typings.facebookNodejsBusinessSdk.srcObjectsServersideHttpServiceInterfaceMod.default | Null
    ], 
    typings.facebookNodejsBusinessSdk.srcObjectsSignalEventRequestMod.default
  ])]
}
