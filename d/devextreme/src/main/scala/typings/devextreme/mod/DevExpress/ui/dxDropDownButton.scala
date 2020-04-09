package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDropDownButton extends Widget {
  /** @name dxDropDownButton.close() */
  def close(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name DataHelperMixin.getDataSource() */
  def getDataSource(): DataSource = js.native
  /** @name dxDropDownButton.open() */
  def open(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxDropDownButton.toggle() */
  def toggle(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxDropDownButton.toggle(visibility) */
  def toggle(visibility: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

