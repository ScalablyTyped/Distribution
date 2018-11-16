package typings
package formsLib.formsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WidgetParameters extends js.Object {
  /** Custom classes to add to the rendered widget. */
  var classes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
  var labelClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A string representing the widget type, e.g. 'text' or 'checkbox' */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

