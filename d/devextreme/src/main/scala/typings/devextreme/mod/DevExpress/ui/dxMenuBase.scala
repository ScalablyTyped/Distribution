package typings.devextreme.mod.DevExpress.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxMenuBase extends CollectionWidget {
  /** Selects an item found using its DOM node. */
  def selectItem(itemElement: Element): Unit = js.native
  /** Cancels the selection of an item found using its DOM node. */
  def unselectItem(itemElement: Element): Unit = js.native
}

