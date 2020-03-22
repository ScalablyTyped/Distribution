package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxGallery extends CollectionWidget {
  /** Shows a specific image. */
  def goToItem(itemIndex: Double, animation: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Shows the next image. */
  def nextItem(animation: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Shows the previous image. */
  def prevItem(animation: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

