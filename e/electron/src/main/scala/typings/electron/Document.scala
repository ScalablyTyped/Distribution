package typings.electron

import typings.electron.Electron.WebviewTag
import typings.electron.electronStrings.webview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  @JSName("createElement")
  def createElement_webview(tagName: webview): WebviewTag = js.native
}

object Document {
  @scala.inline
  def apply(createElement: webview => WebviewTag): Document = {
    val __obj = js.Dynamic.literal(createElement = js.Any.fromFunction1(createElement))
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
    def setCreateElement(value: webview => WebviewTag): Self = this.set("createElement", js.Any.fromFunction1(value))
  }
  
}

