package typings.divaJs.anon

import typings.divaJs.interfacesMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  var document: Region = js.native
  var page: Region = js.native
}

object Document {
  @scala.inline
  def apply(document: Region, page: Region): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
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
    def setDocument(value: Region): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Region): Self = this.set("page", value.asInstanceOf[js.Any])
  }
  
}

