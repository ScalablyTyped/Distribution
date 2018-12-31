package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ToolbarItemClick event.
  */
trait ASPxClientTreeListToolbarItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the clicked menu item
    * Value: An ASPxClientMenu value that is the menu item.
    */
  var item: ASPxClientMenuItem
  /**
    * Gets the toolbar index related to the event.
    * Value: An integer value that is the toolbar index.
    */
  var toolbarIndex: scala.Double
  /**
    * Gets the toolbar name.
    * Value: A string object that is the toolbar name.
    */
  var toolbarName: java.lang.String
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    * Value: true to perform the round trip to the server side via postback; false to perform the round trip to the server side via callback.
    */
  var usePostBack: scala.Boolean
}

