package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxAccordion extends CollectionWidget {
  /** @name dxAccordion.collapseItem(index) */
  def collapseItem(index: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxAccordion.expandItem(index) */
  def expandItem(index: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxAccordion.updateDimensions() */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}

