package typings.forms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends WidgetParameters {
  def formatValue(value: js.Any): js.Any = js.native
  /** Returns a string containing a HTML representation of the widget for the given field. */
  def toHTML(name: String): String = js.native
  def toHTML(name: String, field: Field): String = js.native
}

