package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxContextMenu extends dxMenuBase {
  /** @name dxContextMenu.hide() */
  def hide(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxContextMenu.show() */
  def show(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxContextMenu.toggle(showing) */
  def toggle(showing: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

