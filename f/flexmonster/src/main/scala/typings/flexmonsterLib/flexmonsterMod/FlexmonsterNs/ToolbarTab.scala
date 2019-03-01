package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android")(android)
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ios")(ios)
    __obj.updateDynamic("menu")(menu)
    __obj.updateDynamic("mobile")(mobile)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ToolbarTab]
  }
}

