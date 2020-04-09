package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSlideOut extends CollectionWidget {
  /** @name dxSlideOut.hideMenu() */
  def hideMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxSlideOut.showMenu() */
  def showMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxSlideOut.toggleMenuVisibility(showing) */
  def toggleMenuVisibility(showing: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

