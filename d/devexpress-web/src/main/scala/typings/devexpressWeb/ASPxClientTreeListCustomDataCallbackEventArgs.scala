package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.CustomDataCallback event.
  */
trait ASPxClientTreeListCustomDataCallbackEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the information that has been collected on the client-side and sent to the  server-side ASPxClientTreeList.CustomDataCallback event.
    */
  var arg: String
  /**
    * Gets the information passed from the server-side ASPxTreeList.CustomDataCallback event.
    */
  var result: js.Any
}

object ASPxClientTreeListCustomDataCallbackEventArgs {
  @scala.inline
  def apply(arg: String, result: js.Any): ASPxClientTreeListCustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCustomDataCallbackEventArgs]
  }
}

