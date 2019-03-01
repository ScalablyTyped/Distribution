package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomDataCallback event.
  */
trait ASPxClientTreeListCustomDataCallbackEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the information that has been collected on the client-side and sent to the  server-side CustomDataCallback event.
    * Value: A string value that represents the information that has been collected on the client-side and sent to the server-side CustomDataCallback event.
    */
  var arg: java.lang.String
  /**
    * Gets the information passed from the server-side CustomDataCallback event.
    * Value: An object that represents the information passed from the server-side CustomDataCallback event.
    */
  var result: js.Object
}

object ASPxClientTreeListCustomDataCallbackEventArgs {
  @scala.inline
  def apply(arg: java.lang.String, result: js.Object): ASPxClientTreeListCustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arg")(arg)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[ASPxClientTreeListCustomDataCallbackEventArgs]
  }
}

