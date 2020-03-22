package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDropDownEditor extends dxTextEditor {
  /** Closes the drop-down editor. */
  def close(): Unit = js.native
  /** Gets the popup window's content. */
  def content(): dxElement = js.native
  /** Gets the widget's `` element. */
  def field(): dxElement = js.native
  /** Opens the drop-down editor. */
  def open(): Unit = js.native
}

