package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ContextMenuItemClick event.
  */
trait ASPxClientGridViewContextMenuItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Returns the processed element index.
    * Value: An integer value that specifies the processed element index.
    */
  var elementIndex: scala.Double
  /**
    * Specifies whether default context menu item click is handled manually, so no default processing is required.
    * Value: true if no default processing is required; otherwise false.
    */
  var handled: scala.Boolean
  /**
    * Gets the clicked context menu item.
    * Value: An <see cref="ASPxClientMenuItem" /> object, manipulations on which forced the event to be raised.
    */
  var item: ASPxClientMenuItem
  /**
    * Gets which grid element has been right clicked by the user.
    * Value: A String value that specifies the grid element.
    */
  var objectType: java.lang.String
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    * Value: true to perform the round trip to the server side via postback; false to perform the round trip to the server side via callback.
    */
  var usePostBack: scala.Boolean
}

object ASPxClientGridViewContextMenuItemClickEventArgs {
  @scala.inline
  def apply(
    elementIndex: scala.Double,
    handled: scala.Boolean,
    item: ASPxClientMenuItem,
    objectType: java.lang.String,
    processOnServer: scala.Boolean,
    usePostBack: scala.Boolean
  ): ASPxClientGridViewContextMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(elementIndex = elementIndex, handled = handled, item = item, objectType = objectType, processOnServer = processOnServer, usePostBack = usePostBack)
  
    __obj.asInstanceOf[ASPxClientGridViewContextMenuItemClickEventArgs]
  }
}

