package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFileManager extends Widget {
  /** @name dxFileManager.getCurrentDirectory() */
  def getCurrentDirectory(): js.Any = js.native
  /** @name dxFileManager.getSelectedItems() */
  def getSelectedItems(): js.Array[_] = js.native
  /** @name dxFileManager.refresh() */
  def refresh(): Promise[_] with JQueryPromise[_] = js.native
}

