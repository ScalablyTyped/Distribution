package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the NavBar extension.
  */
@JSGlobal("MVCxClientNavBar")
@js.native
class MVCxClientNavBar () extends ASPxClientNavBar {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientNavBar: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientNavBar]] = js.native
}

/* static members */
@JSGlobal("MVCxClientNavBar")
@js.native
object MVCxClientNavBar extends js.Object {
  /**
    * Converts the specified object to the MVCxClientNavBar type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientNavBar = js.native
}

