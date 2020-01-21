package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/DnD.html
  *
  * Provide drag and drop for grid columns/rows/cells within grid and out of grid.
  * The store of grid must implement dojo.data.api.Write.
  *
  * DnD selected columns:
  * Support moving within grid, moving/copying out of grid to a non-grid DnD target.
  *
  * DnD selected rows:
  * Support moving within grid, moving/copying out of grid to any DnD target.
  *
  * DnD selected cells (in rectangle shape only):
  * Support moving/copying within grid, moving/copying out of grid to any DnD target.
  *
  * @param grid
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.DnD")
@js.native
class DnD protected () extends Plugin {
  def this(grid: js.Any, args: js.Any) = this()
  /**
    * Setter/getter of this._copyOnly.
    *
    * @param isCopyOnly
    */
  def copyOnly(isCopyOnly: js.Any): Boolean = js.native
  /**
    *
    * @param sourcePlugin
    * @param isCopy
    */
  def onDragIn(sourcePlugin: js.Any, isCopy: js.Any): Unit = js.native
  /**
    *
    * @param isMove
    */
  def onDragOut(isMove: js.Any): Unit = js.native
  /**
    *
    * @param sourcePlugin
    */
  def onDraggingOut(sourcePlugin: js.Any): Unit = js.native
  /**
    *
    * @param sourcePlugin
    */
  def onDraggingOver(sourcePlugin: js.Any): Unit = js.native
  /**
    * Configure which DnD functionalities are needed.
    * Combination of any item from type set ("row", "col", "cell")
    * and any item from mode set("within", "in", "out") is configurable.
    *
    * "row", "col", "cell" are straightforward, while the other 3 are explained below:
    *
    * "within": DnD within grid, that is, column/row reordering and cell moving/copying.
    * "in": Whether allowed to accept rows/cells (currently not support columns) from another grid.
    * "out": Whether allowed to drag out of grid, to another grid or even to any other DnD target.
    * If not provided in the config, will use the default.
    * When declared together, Mode set has higher priority than type set.
    *
    * @param config DnD configuration object.See the examples below.
    */
  def setupConfig(config: js.Object): Unit = js.native
}

