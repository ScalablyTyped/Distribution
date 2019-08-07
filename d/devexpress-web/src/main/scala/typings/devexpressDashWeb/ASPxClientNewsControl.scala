package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxNewsControl object.
  */
@JSGlobal("ASPxClientNewsControl")
@js.native
class ASPxClientNewsControl () extends ASPxClientDataView {
  /**
    * Fires after an item's tail has been clicked.
    */
  var TailClick: ASPxClientEvent[ASPxClientNewsControlItemEventHandler[ASPxClientNewsControl]] = js.native
}

/* static members */
@JSGlobal("ASPxClientNewsControl")
@js.native
object ASPxClientNewsControl extends js.Object {
  /**
    * Converts the specified object to the ASPxClientNewsControl type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientNewsControl = js.native
}

