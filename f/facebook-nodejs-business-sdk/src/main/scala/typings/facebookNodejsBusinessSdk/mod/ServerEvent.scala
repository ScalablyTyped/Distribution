package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcObjectsServersideServerEventMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("facebook-nodejs-business-sdk", "ServerEvent")
@js.native
open class ServerEvent protected () extends default {
  def this(
    event_name: js.UndefOr[String],
    event_time: js.UndefOr[Double],
    event_source_url: js.UndefOr[String],
    user_data: js.UndefOr[typings.facebookNodejsBusinessSdk.srcObjectsServersideUserDataMod.default],
    custom_data: js.UndefOr[typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default],
    event_id: js.UndefOr[String],
    opt_out: js.UndefOr[Boolean],
    action_source: js.UndefOr[String],
    data_processing_options: js.UndefOr[js.Array[String]],
    data_processing_options_country: js.UndefOr[Double],
    data_processing_options_state: js.UndefOr[Double]
  ) = this()
}
