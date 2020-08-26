package typings.fortawesomeFontawesomeSvgCore.mod

import typings.std.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontawesomeObject extends js.Object {
  val `abstract`: js.Array[AbstractElement] = js.native
  val html: js.Array[String] = js.native
  val node: HTMLCollection = js.native
}

object FontawesomeObject {
  @scala.inline
  def apply(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection): FontawesomeObject = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontawesomeObject]
  }
  @scala.inline
  implicit class FontawesomeObjectOps[Self <: FontawesomeObject] (val x: Self) extends AnyVal {
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
    def setAbstractVarargs(value: AbstractElement*): Self = this.set("abstract", js.Array(value :_*))
    @scala.inline
    def setAbstract(value: js.Array[AbstractElement]): Self = this.set("abstract", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlVarargs(value: String*): Self = this.set("html", js.Array(value :_*))
    @scala.inline
    def setHtml(value: js.Array[String]): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: HTMLCollection): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

