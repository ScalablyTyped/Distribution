package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScrollView extends dxScrollable {
  /** Locks the widget until the release(preventScrollBottom) method is called and executes the function passed to the onPullDown option and the handler assigned to the pullDown event. */
  def refresh(): Unit = js.native
  /** Notifies the ScrollView that data loading is finished. */
  def release(preventScrollBottom: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

