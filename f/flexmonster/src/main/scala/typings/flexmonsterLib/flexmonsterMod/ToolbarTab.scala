package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarTab extends js.Object {
  var android: scala.Boolean
  var args: js.Any
  var handler: js.Function0[scala.Unit] | java.lang.String
  var icon: java.lang.String
  var id: java.lang.String
  var ios: scala.Boolean
  var menu: js.Array[ToolbarTab]
  var mobile: scala.Boolean
  var title: java.lang.String
}

object ToolbarTab {
  @scala.inline
  def apply(
    android: scala.Boolean,
    args: js.Any,
    handler: js.Function0[scala.Unit] | java.lang.String,
    icon: java.lang.String,
    id: java.lang.String,
    ios: scala.Boolean,
    menu: js.Array[ToolbarTab],
    mobile: scala.Boolean,
    title: java.lang.String
  ): ToolbarTab = {
    val __obj = js.Dynamic.literal(android = android, args = args, handler = handler.asInstanceOf[js.Any], icon = icon, id = id, ios = ios, menu = menu, mobile = mobile, title = title)
  
    __obj.asInstanceOf[ToolbarTab]
  }
}

