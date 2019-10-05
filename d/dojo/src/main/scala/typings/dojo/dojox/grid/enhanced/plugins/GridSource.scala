package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojo.dnd.Source
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/GridSource.html
  *
  * A special source that can accept grid contents.
  * Only for non-grid widgets or domNodes.
  *
  * @param node node or node's id to build the source on
  * @param params       Optionalany property of this class may be configured via the paramsobject which is mixed-in to the dojo/dnd/Source instance
  */
@JSGlobal("dojox.grid.enhanced.plugins.GridSource")
@js.native
class GridSource protected () extends Source {
  def this(node: HTMLElement) = this()
  def this(node: HTMLElement, params: js.Object) = this()
  /**
    * If you'd like to insert some sort of nodes into your dnd source, turn this on,
    * and override getCellContent/getRowContent/getColumnContent
    * to populate the dnd data in your desired format.
    *
    */
  var insertNodesForGrid: Boolean = js.native
  /**
    *
    * @param source
    * @param nodes
    */
  def checkAcceptance(source: js.Any, nodes: js.Any): js.Any = js.native
  /**
    * Fill node innerHTML for dnd grid cells.
    *
    * @param grid
    * @param leftTopCell
    * @param rightBottomCell
    */
  def getCellContent(grid: js.Any, leftTopCell: js.Any, rightBottomCell: js.Any): Unit = js.native
  /**
    * Fill node innerHTML for dnd grid columns.
    *
    * @param grid
    * @param colIndexes
    */
  def getColumnContent(grid: js.Any, colIndexes: js.Any): Unit = js.native
  /**
    * Fill node innerHTML for dnd grid rows.
    *
    * @param grid
    * @param rowIndexes
    */
  def getRowContent(grid: js.Any, rowIndexes: js.Any): Unit = js.native
  /**
    * inserts an array of new nodes before/after an anchor node
    *
    * @param data Logical representation of the object being dragged.If the drag object's type is "text" then data is a String,if it's another type then data could be a different Object,perhaps a name/value hash.
    * @param before insert before the anchor, if true, and after the anchor otherwise
    * @param anchor the anchor node to be used as a point of insertion
    */
  def insertNodes(data: js.Object, before: Boolean, anchor: HTMLElement): js.Function = js.native
  /**
    *
    * @param params
    * @param node
    */
  def markupFactory(params: js.Any, node: js.Any): js.Any = js.native
  /**
    *
    * @param source
    * @param nodes
    * @param copy
    */
  def onDropExternal(source: js.Any, nodes: js.Any, copy: js.Any): Unit = js.native
  /**
    *
    * @param grid
    * @param leftTopCell
    * @param rightBottomCell
    */
  def onDropGridCells(grid: js.Any, leftTopCell: js.Any, rightBottomCell: js.Any): Unit = js.native
  /**
    *
    * @param grid
    * @param colIndexes
    */
  def onDropGridColumns(grid: js.Any, colIndexes: js.Any): Unit = js.native
  /**
    *
    * @param grid
    * @param rowIndexes
    */
  def onDropGridRows(grid: js.Any, rowIndexes: js.Any): Unit = js.native
}

