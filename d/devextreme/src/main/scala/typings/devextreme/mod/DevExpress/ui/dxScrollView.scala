package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScrollView extends dxScrollable {
  /** @name dxScrollView.refresh() */
  def refresh(): Unit = js.native
  /** @name dxScrollView.release(preventScrollBottom) */
  def release(preventScrollBottom: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

