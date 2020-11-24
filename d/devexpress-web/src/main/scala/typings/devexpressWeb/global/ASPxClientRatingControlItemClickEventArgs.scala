package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRatingControl.ItemClick event.
  */
@JSGlobal("ASPxClientRatingControlItemClickEventArgs")
@js.native
class ASPxClientRatingControlItemClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRatingControlItemClickEventArgs {
  /**
    * Initializes a new ASPxClientRatingControlItemClickEventArgs class instance with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param index An integer value that represents the index of the clicked item.
    */
  def this(processOnServer: Boolean, index: Double) = this()
}
