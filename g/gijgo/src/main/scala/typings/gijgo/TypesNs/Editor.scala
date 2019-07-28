package typings.gijgo.TypesNs

import typings.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends JQuery {
  def content(): String | Editor = js.native
  def content(html: String): String | Editor = js.native
  def destroy(): Unit = js.native
}

