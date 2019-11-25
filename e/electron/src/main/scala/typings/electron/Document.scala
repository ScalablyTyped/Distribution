package typings.electron

import typings.electron.Electron.WebviewTag
import typings.electron.electronStrings.webview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  @JSName("createElement")
  def createElement_webview(tagName: webview): WebviewTag
}

object Document {
  @scala.inline
  def apply(createElement: webview => WebviewTag): Document = {
    val __obj = js.Dynamic.literal(createElement = js.Any.fromFunction1(createElement))
  
    __obj.asInstanceOf[Document]
  }
}

