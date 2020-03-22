package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseWidget extends DOMComponent {
  /** Exports the widget. */
  def exportTo(fileName: String, format: String): Unit = js.native
  /** Gets the current widget size. */
  def getSize(): BaseWidgetSize = js.native
  /** Hides the loading indicator. */
  def hideLoadingIndicator(): Unit = js.native
  /** Opens the browser's print window. */
  def print(): Unit = js.native
  /** Redraws the widget. */
  def render(): Unit = js.native
  /** Shows the loading indicator. */
  def showLoadingIndicator(): Unit = js.native
  /** Gets the widget's SVG markup. */
  def svg(): String = js.native
}

