package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseWidget extends DOMComponent {
  /** @name BaseWidget.exportTo(fileName, format) */
  def exportTo(fileName: String, format: String): Unit = js.native
  /** @name BaseWidget.getSize() */
  def getSize(): BaseWidgetSize = js.native
  /** @name BaseWidget.hideLoadingIndicator() */
  def hideLoadingIndicator(): Unit = js.native
  /** @name BaseWidget.print() */
  def print(): Unit = js.native
  /** @name BaseWidget.render() */
  def render(): Unit = js.native
  /** @name BaseWidget.showLoadingIndicator() */
  def showLoadingIndicator(): Unit = js.native
  /** @name BaseWidget.svg() */
  def svg(): String = js.native
}

