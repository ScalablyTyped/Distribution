package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.Instantiable11
import typings.facebookNodejsBusinessSdk.mod.^
import typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("facebook-nodejs-business-sdk", "ServerEvent")
@js.native
open class ServerEvent protected () extends default {
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
object ServerEvent {
  
  inline def apply: Instantiable11[
    /* event_name */ String, 
    /* event_time */ Double, 
    /* event_source_url */ String, 
    /* user_data */ typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default, 
    /* custom_data */ typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default, 
    /* event_id */ String, 
    /* opt_out */ Boolean, 
    /* action_source */ String, 
    /* data_processing_options */ js.Array[String], 
    /* data_processing_options_country */ Double, 
    /* data_processing_options_state */ Double, 
    default
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("ServerEvent").asInstanceOf[Instantiable11[
    /* event_name */ String, 
    /* event_time */ Double, 
    /* event_source_url */ String, 
    /* user_data */ typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default, 
    /* custom_data */ typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default, 
    /* event_id */ String, 
    /* opt_out */ Boolean, 
    /* action_source */ String, 
    /* data_processing_options */ js.Array[String], 
    /* data_processing_options_country */ Double, 
    /* data_processing_options_state */ Double, 
    default
  ]]
}
