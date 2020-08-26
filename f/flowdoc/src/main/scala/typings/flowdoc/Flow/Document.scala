package typings.flowdoc.Flow

import typings.flowdoc.flowdocStrings.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  var children: js.Array[Page] = js.native
  var id: String = js.native
  var name: String = js.native
  var `type`: DOCUMENT = js.native
}

object Document {
  @scala.inline
  def apply(children: js.Array[Page], id: String, name: String, `type`: DOCUMENT): Document = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: Page*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Page]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DOCUMENT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

