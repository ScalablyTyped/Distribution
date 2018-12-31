package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ContextMenu event.
  */
trait ASPxClientGridViewContextMenuEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the parameters associated with the ContextMenu event.
    * Value: An object that contains parameters associated with the event.
    */
  var htmlEvent: js.Object
  /**
    * Identifies the grid element being right clicked by the user.
    * Value: A zero-based integer index that identifies the grid element being clicked by the user.
    */
  var index: scala.Double
  /**
    * Gets the currently processed menu object.
    * Value: An object that is the currently processed menu.
    */
  var menu: js.Object
  /**
    * Gets which grid element has been right clicked by the user.
    * Value: A String value that specifies grid element.
    */
  var objectType: java.lang.String
  /**
    * Specifies whether a browser context menu should be displayed.
    * Value: true, to display a browser context menu; otherwise, false.    The default is false.
    */
  var showBrowserMenu: scala.Boolean
}

