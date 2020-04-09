package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxGallery extends CollectionWidget {
  /** @name dxGallery.goToItem(itemIndex, animation) */
  def goToItem(itemIndex: Double, animation: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxGallery.nextItem(animation) */
  def nextItem(animation: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxGallery.prevItem(animation) */
  def prevItem(animation: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

