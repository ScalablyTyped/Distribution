package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcObjectsSignalEventMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("facebook-nodejs-business-sdk", "SignalEvent")
@js.native
open class SignalEvent protected () extends default {
  def this(
    event_name: String,
    event_time: Double,
    event_source_url: String,
    user_data: typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default,
    custom_data: typings.facebookNodejsBusinessSdk.srcObjectsSignalCustomDataMod.default,
    event_id: String,
    opt_out: Boolean,
    action_source: String,
    data_processing_options: js.Array[String],
    data_processing_options_country: Double,
    data_processing_options_state: Double
  ) = this()
}
