package typings.emojiMart

import typings.emojiMart.sharedPropsMod.CategoryName
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategories extends js.Object {
  var categories: Partial[Record[CategoryName, String]]
}

object AnonCategories {
  @scala.inline
  def apply(categories: Partial[Record[CategoryName, String]]): AnonCategories = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCategories]
  }
}

