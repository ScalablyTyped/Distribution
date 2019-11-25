package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarTab extends js.Object {
  var android: Boolean
  var args: js.Any
  var handler: js.Function0[Unit] | String
  var icon: String
  var id: String
  var ios: Boolean
  var menu: js.Array[ToolbarTab]
  var mobile: Boolean
  var title: String
}

object ToolbarTab {
  @scala.inline
  def apply(
    android: Boolean,
    args: js.Any,
    handler: js.Function0[Unit] | String,
    icon: String,
    id: String,
    ios: Boolean,
    menu: js.Array[ToolbarTab],
    mobile: Boolean,
    title: String
  ): ToolbarTab = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToolbarTab]
  }
}

