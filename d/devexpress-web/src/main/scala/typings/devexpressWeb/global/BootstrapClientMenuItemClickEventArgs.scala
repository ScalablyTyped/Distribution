package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to clicking on the control's items.
  */
@JSGlobal("BootstrapClientMenuItemClickEventArgs")
@js.native
class BootstrapClientMenuItemClickEventArgs protected ()
  extends typings.devexpressWeb.BootstrapClientMenuItemClickEventArgs {
  /**
    * Initializes a new object of the BootstrapClientMenuItemClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param item An BootstrapClientMenuItem object that represents an item related to the event.
    * @param htmlElement An HTML object that contains the processed item.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    item: typings.devexpressWeb.BootstrapClientMenuItem,
    htmlElement: js.Any,
    htmlEvent: js.Any
  ) = this()
}
