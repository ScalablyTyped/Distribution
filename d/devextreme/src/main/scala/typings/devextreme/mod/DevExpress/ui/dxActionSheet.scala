package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxActionSheet extends CollectionWidget {
  /** @name dxActionSheet.hide() */
  def hide(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxActionSheet.show() */
  def show(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxActionSheet.toggle(showing) */
  def toggle(showing: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

