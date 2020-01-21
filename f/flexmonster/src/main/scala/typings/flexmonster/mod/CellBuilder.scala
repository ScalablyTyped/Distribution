package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellBuilder extends js.Object {
  var attr: js.UndefOr[js.Object] = js.native
  var classes: js.UndefOr[js.Array[String]] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tag: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  def addClass(): Unit = js.native
  def addClass(value: String): Unit = js.native
  def toHtml(): String = js.native
}

