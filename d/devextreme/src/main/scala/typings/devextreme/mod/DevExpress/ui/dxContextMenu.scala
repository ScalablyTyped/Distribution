package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxContextMenu extends dxMenuBase {
  /** Hides the widget. */
  def hide(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Shows the widget. */
  def show(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Shows or hides the widget depending on the argument. */
  def toggle(showing: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

