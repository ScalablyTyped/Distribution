package typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod

import typings.react.reactMod.Component
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIcons extends js.Object {
  var categories: Record[CategoryName, js.Function0[Component[js.Object, js.Object, _]]]
}

object CustomIcons {
  @scala.inline
  def apply(categories: Record[CategoryName, js.Function0[Component[js.Object, js.Object, _]]]): CustomIcons = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomIcons]
  }
}

