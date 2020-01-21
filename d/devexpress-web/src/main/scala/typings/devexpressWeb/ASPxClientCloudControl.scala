package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxCloudControl control.
  */
@JSGlobal("ASPxClientCloudControl")
@js.native
class ASPxClientCloudControl () extends ASPxClientControl {
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientCloudControlItemEventHandler[ASPxClientCloudControl]] = js.native
}

/* static members */
@JSGlobal("ASPxClientCloudControl")
@js.native
object ASPxClientCloudControl extends js.Object {
  /**
    * Converts the specified object to the ASPxClientCloudControl type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientCloudControl = js.native
}

