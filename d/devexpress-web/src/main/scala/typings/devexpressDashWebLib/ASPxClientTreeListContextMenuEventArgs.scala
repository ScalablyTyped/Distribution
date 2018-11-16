package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the ContextMenu event.
 */

trait ASPxClientTreeListContextMenuEventArgs extends ASPxClientEventArgs {
  /**
       * Gets or sets whether to invoke the browser's context menu.
       * Value: true to hide the browser's context menu; otherwise, false.
       */
  var cancel: scala.Boolean
  /**
       * Gets a DHTML event object that relates to the processed event.
       * Value: An object that relates to the processed event.
       */
  var htmlEvent: js.Object
  /**
       * Gets a value that identifies the right-clicked object.
       * Value: The right-clicked object's identifier.
       */
  var objectKey: js.Object
  /**
       * Identifies which tree list element has been right-clicked.
       * Value: A string value that identifies which tree list element ('Header' or 'Node') has been right-clicked.
       */
  var objectType: java.lang.String
}

