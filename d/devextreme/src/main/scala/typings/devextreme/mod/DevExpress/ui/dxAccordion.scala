package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxAccordion extends CollectionWidget {
  /** Collapses an item with a specific index. */
  def collapseItem(index: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Expands an item with a specific index. */
  def expandItem(index: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Updates the dimensions of the widget contents. */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}

