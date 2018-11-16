package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for events concerning client manipulations on popup windows.
 */

trait ASPxClientPopupWindowEventArgs extends ASPxClientEventArgs {
  /**
       * Gets the popup window object related to the event.
       * Value: An ASPxClientPopupWindow object representing the popup window that was manipulated, causing the popup control to raise the event.
       */
  var window: ASPxClientPopupWindow
}

