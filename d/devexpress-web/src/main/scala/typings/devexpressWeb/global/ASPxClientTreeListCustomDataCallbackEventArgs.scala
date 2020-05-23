package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.CustomDataCallback event.
  */
@JSGlobal("ASPxClientTreeListCustomDataCallbackEventArgs")
@js.native
class ASPxClientTreeListCustomDataCallbackEventArgs ()
  extends typings.devexpressWeb.ASPxClientTreeListCustomDataCallbackEventArgs {
  /**
    * Gets the information that has been collected on the client-side and sent to the  server-side ASPxClientTreeList.CustomDataCallback event.
    */
  /* CompleteClass */
  override var arg: String = js.native
  /**
    * Gets the information passed from the server-side ASPxTreeList.CustomDataCallback event.
    */
  /* CompleteClass */
  override var result: js.Any = js.native
}

