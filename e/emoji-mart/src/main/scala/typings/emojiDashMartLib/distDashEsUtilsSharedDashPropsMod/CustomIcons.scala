package typings
package emojiDashMartLib.distDashEsUtilsSharedDashPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIcons extends js.Object {
  var categories: stdLib.Record[CategoryName, js.Function0[reactLib.reactMod.Component[js.Object, js.Object, _]]]
}

object CustomIcons {
  @scala.inline
  def apply(
    categories: stdLib.Record[CategoryName, js.Function0[reactLib.reactMod.Component[js.Object, js.Object, _]]]
  ): CustomIcons = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("categories")(categories)
    __obj.asInstanceOf[CustomIcons]
  }
}

