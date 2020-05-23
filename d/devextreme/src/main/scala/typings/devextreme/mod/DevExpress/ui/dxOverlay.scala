package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxOverlay extends Widget {
  /** @name dxOverlay.content() */
  def content(): dxElement = js.native
  /** @name dxOverlay.hide() */
  def hide(): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  /** @name dxOverlay.show() */
  def show(): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  /** @name dxOverlay.toggle(showing) */
  def toggle(showing: Boolean): Promise[Boolean] with JQueryPromise[Boolean] = js.native
}

