package typings.googleFonts.google.fonts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebfontList extends js.Object {
  var items: js.Array[WebfontFamily] = js.native
  var kind: String = js.native
}

object WebfontList {
  @scala.inline
  def apply(items: js.Array[WebfontFamily], kind: String): WebfontList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebfontList]
  }
  @scala.inline
  implicit class WebfontListOps[Self <: WebfontList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: WebfontFamily*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[WebfontFamily]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

