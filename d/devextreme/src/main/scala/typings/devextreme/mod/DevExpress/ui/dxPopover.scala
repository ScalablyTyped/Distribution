package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQuery
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPopover extends dxOverlay {
  /** @name dxPopover.show(target) */
  def show(target: String): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  def show(target: JQuery): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  def show(target: Element): Promise[Boolean] with JQueryPromise[Boolean] = js.native
}

