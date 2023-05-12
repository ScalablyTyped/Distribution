package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("facebook-nodejs-business-sdk", "EventResponse")
@js.native
open class EventResponse protected () extends default {
  def this(
    events_received: Double,
    messages: js.Array[String],
    fbtrace_id: String,
    id: String,
    num_processed_entries: Double
  ) = this()
}
