package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a hot key used to perform an action assigned to a menu item.
  */
trait ASPxClientMenuActionHotKey extends js.Object {
  /**
    * Provides access to a value that specifies whether the CTRL key is used in combination with a hot key.
    * Value: true, if the CTRL key is included into the key combination; otherwise, false.
    */
  var ctrlKey: scala.Boolean
  /**
    * Provides access to a hot key code.
    * Value: An integer value that specifies the hot key code.
    */
  var keyCode: scala.Double
}

object ASPxClientMenuActionHotKey {
  @scala.inline
  def apply(ctrlKey: scala.Boolean, keyCode: scala.Double): ASPxClientMenuActionHotKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctrlKey")(ctrlKey)
    __obj.updateDynamic("keyCode")(keyCode)
    __obj.asInstanceOf[ASPxClientMenuActionHotKey]
  }
}

