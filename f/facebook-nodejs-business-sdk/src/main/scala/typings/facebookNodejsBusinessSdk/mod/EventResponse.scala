package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.Instantiable5
import typings.facebookNodejsBusinessSdk.mod.^
import typings.facebookNodejsBusinessSdk.srcObjectsServersideEventResponseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
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
object EventResponse {
  
  inline def apply: Instantiable5[
    /* events_received */ Double, 
    /* messages */ js.Array[String], 
    /* fbtrace_id */ String, 
    /* id */ String, 
    /* num_processed_entries */ Double, 
    default
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("EventResponse").asInstanceOf[Instantiable5[
    /* events_received */ Double, 
    /* messages */ js.Array[String], 
    /* fbtrace_id */ String, 
    /* id */ String, 
    /* num_processed_entries */ Double, 
    default
  ]]
}
