package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientMenuActionHotKey extends js.Object {
  var ctrlKey: Boolean
  var keyCode: Double
}

object ASPxClientMenuActionHotKey {
  @scala.inline
  def apply(ctrlKey: Boolean, keyCode: Double): ASPxClientMenuActionHotKey = {
    val __obj = js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuActionHotKey]
  }
}

