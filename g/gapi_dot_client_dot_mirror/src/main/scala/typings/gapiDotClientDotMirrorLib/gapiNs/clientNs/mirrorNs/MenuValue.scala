package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuValue extends js.Object {
  /**
    * The name to display for the menu item. If you specify this property for a built-in menu item, the default contextual voice command for that menu item
    * is not shown.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** URL of an icon to display with the menu item. */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state that this value applies to. Allowed values are:
    * - DEFAULT - Default value shown when displayed in the menuItems list.
    * - PENDING - Value shown when the menuItem has been selected by the user but can still be cancelled.
    * - CONFIRMED - Value shown when the menuItem has been selected by the user and can no longer be cancelled.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

