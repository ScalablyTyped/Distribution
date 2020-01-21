package typings.dojo.dojox.grid.enhanced.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/_SelectionPreserver.html
  *
  * Preserve selections across various user actions.
  * Extends dojox.grid._SelectionPreserver adding a bit more support to make selection persistence working well
  * with various EnhancedGrid features, e.g. filtering, nested sorting, pagination, select all etc.
  *
  * Precondition - Identifier(id) is required for store, as id is used for differentiating row items.
  * Known issue - The preserved selections might be inaccurate if some unloaded rows are previously selected by range(e.g.SHIFT + click)
  *
  * @param selection
  */
@JSGlobal("dojox.grid.enhanced.plugins._SelectionPreserver")
@js.native
class SelectionPreserver protected ()
  extends typings.dojo.dojox.grid.SelectionPreserver {
  def this(selection: js.Any) = this()
  /**
    *
    * @param id
    * @param rowIndex
    * @param value
    */
  def onSelectedById(id: js.Any, rowIndex: js.Any, value: js.Any): Unit = js.native
}

