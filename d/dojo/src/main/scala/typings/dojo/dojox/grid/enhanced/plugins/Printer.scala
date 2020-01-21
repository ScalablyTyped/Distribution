package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Printer.html
  *
  * Provide printGrid function to the grid.
  *
  * @param grid
  */
@JSGlobal("dojox.grid.enhanced.plugins.Printer")
@js.native
class Printer protected () extends Plugin {
  def this(grid: js.Any) = this()
  /**
    * Export selected rows to HTML string, but do NOT print.
    * Users can use this to implement print preview.
    * For meaning of arguments see function printGrid
    *
    * @param args               OptionalArguments for print.
    * @param onExported
    */
  def exportSelectedToHTML(args: js.Object, onExported: js.Any): Unit = js.native
  /**
    * Export to HTML string, but do NOT print.
    * Users can use this to implement print preview.
    * For meaning of the 1st-3rd arguments see function printGrid.
    *
    * @param args               OptionalArguments for print.
    * @param onExported call back function
    */
  def exportToHTML(args: js.Object, onExported: js.Any): Unit = js.native
  /**
    *
    * @param doc
    */
  def normalizeRowHeight(doc: js.Any): Unit = js.native
  /**
    * Print all the data in the grid, using title as a title,
    * decorating generated html by cssFiles,
    * using tagName:"attrbuteList" pairs(writerArgs) to control html tags
    * in the generated html string.
    *
    * @param args               OptionalArguments for print.
    */
  def printGrid(args: js.Object): Unit = js.native
  /**
    * Print selected data. All other features are the same as printGrid.
    * For meaning of arguments see function printGrid
    *
    * @param args               OptionalArguments for print.
    */
  def printSelected(args: js.Object): Unit = js.native
}

