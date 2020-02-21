package typings.emojiMart.sharedPropsMod

import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIcons extends js.Object {
  var categories: Record[CategoryName, js.Function0[ReactNode]]
}

object CustomIcons {
  @scala.inline
  def apply(categories: Record[CategoryName, js.Function0[ReactNode]]): CustomIcons = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomIcons]
  }
}

