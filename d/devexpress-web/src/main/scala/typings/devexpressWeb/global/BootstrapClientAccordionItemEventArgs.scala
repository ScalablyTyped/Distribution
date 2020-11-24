package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on items.
  */
@JSGlobal("BootstrapClientAccordionItemEventArgs")
@js.native
class BootstrapClientAccordionItemEventArgs protected ()
  extends typings.devexpressWeb.BootstrapClientAccordionItemEventArgs {
  /**
    * Initializes a new object of the BootstrapClientAccordionItemEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param item An BootstrapClientAccordionItem object that represents an item related to the event.
    * @param htmlElement An HTML object that contains the processed navbar item.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    item: typings.devexpressWeb.BootstrapClientAccordionItem,
    htmlElement: js.Any,
    htmlEvent: js.Any
  ) = this()
}
