package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDrawer extends Widget {
  /** @name dxDrawer.content() */
  def content(): dxElement = js.native
  /** @name dxDrawer.hide() */
  def hide(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxDrawer.show() */
  def show(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxDrawer.toggle() */
  def toggle(): Promise[Unit] with JQueryPromise[Unit] = js.native
}

