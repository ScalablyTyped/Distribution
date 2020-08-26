package typings.flowdoc.Flow

import typings.flowdoc.Node
import typings.flowdoc.flowdocStrings.PAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends Node {
  var backgroundColor: Color = js.native
  var children: js.Array[Screen | Image | Rectangle | Ellipse | Diamond] = js.native
  var startNodeID: js.UndefOr[String] = js.native
  @JSName("type")
  var type_Page: PAGE = js.native
}

object Page {
  @scala.inline
  def apply(
    backgroundColor: Color,
    children: js.Array[Screen | Image | Rectangle | Ellipse | Diamond],
    id: String,
    name: String,
    `type`: PAGE
  ): Page = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: (Screen | Image | Rectangle | Ellipse | Diamond)*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Screen | Image | Rectangle | Ellipse | Diamond]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PAGE): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartNodeID(value: String): Self = this.set("startNodeID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartNodeID: Self = this.set("startNodeID", js.undefined)
  }
  
}

