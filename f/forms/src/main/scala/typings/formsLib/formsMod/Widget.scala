package typings
package formsLib.formsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends WidgetParameters {
  def formatValue(value: js.Any): js.Any = js.native
  /** Returns a string containing a HTML representation of the widget for the given field. */
  def toHTML(name: java.lang.String): java.lang.String = js.native
  /** Returns a string containing a HTML representation of the widget for the given field. */
  def toHTML(name: java.lang.String, field: Field): java.lang.String = js.native
}

