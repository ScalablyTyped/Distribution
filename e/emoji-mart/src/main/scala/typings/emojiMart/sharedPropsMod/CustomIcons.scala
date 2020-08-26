package typings.emojiMart.sharedPropsMod

import typings.emojiMart.anon.RecordCategoryNameReactNo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomIcons extends js.Object {
  var categories: RecordCategoryNameReactNo = js.native
}

object CustomIcons {
  @scala.inline
  def apply(categories: RecordCategoryNameReactNo): CustomIcons = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomIcons]
  }
  @scala.inline
  implicit class CustomIconsOps[Self <: CustomIcons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategories(value: RecordCategoryNameReactNo): Self = this.set("categories", value.asInstanceOf[js.Any])
  }
  
}

