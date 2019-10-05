package typings.gijgo.Types

import typings.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends JQuery {
  def close(): Dialog = js.native
  def content(constent: String): String | Dialog = js.native
  def destroy(keepHtml: Boolean): Unit = js.native
  def isOpen(): Boolean = js.native
  def open(): Dialog = js.native
}

