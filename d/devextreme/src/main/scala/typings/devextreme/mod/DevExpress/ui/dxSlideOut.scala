package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSlideOut extends CollectionWidget {
  /** Hides the widget's slide-out menu. */
  def hideMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Displays the widget's slide-out menu. */
  def showMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Shows or hides the slide-out menu depending on the argument. */
  def toggleMenuVisibility(showing: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

