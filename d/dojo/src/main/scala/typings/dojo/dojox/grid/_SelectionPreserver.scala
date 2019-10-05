package typings.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_SelectionPreserver.html
  *
  * Preserve selections across various user actions.
  * When this feature is turned on, Grid will try to preserve selections across actions, e.g. sorting, filtering etc.
  *
  * Precondition - Identifier(id) is required for store since id is the only way for differentiating row items.
  * Known issue - The preserved selections might be inaccurate if some unloaded rows are previously selected by range(e.g.SHIFT + click)
  *
  * @param selection
  */
@JSGlobal("dojox.grid._SelectionPreserver")
@js.native
class _SelectionPreserver protected () extends js.Object {
  def this(selection: js.Any) = this()
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    */
  def reset(): Unit = js.native
}

