package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.EnhancedGrid
import typings.dojo.dojox.grid.enhanced.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Exporter.html
  *
  * Provide functions to export the grid data into a given format.
  *
  * Acceptable plugin parameters:
  *
  * exportFormatter: function(data, cell, rowIndex, item)
  *  Provide a way to customize how data should look in exported string.
  *  Note that usually the formatter of grid cell should not be used here (it can return HTML or even widget).
  *
  * @param grid The grid to plug in to.
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.Exporter")
@js.native
class Exporter_ protected () extends Plugin {
  def this(grid: EnhancedGrid, args: js.Any) = this()
  /**
    *
    */
  var writerNames: String = js.native
  /**
    * Export required rows(fetchArgs) to a kind of format(type)
    * using the corresponding writer with given arguments(writerArgs),
    * then pass the exported text to a given function(onExported).
    *
    * @param type A registered export format name
    * @param args               Optionalincludes:{    fetchArgs: object?        Any arguments for store.fetch    writerArgs: object?        Arguments for the given format writer}
    * @param onExported Call back function when export result is ready
    */
  def exportGrid(`type`: String, args: js.Object, onExported: js.Any): Unit = js.native
  /**
    * Only export selected rows.
    *
    * @param type A registered export format name
    * @param writerArgs               OptionalArguments for the given format writer
    * @param onExported
    */
  def exportSelected(`type`: String, writerArgs: js.Object, onExported: js.Any): js.Any = js.native
  /**
    * Register a writer(writerClsName) to a export format type(fileType).
    * This function separates the Exporter from all kinds of writers.
    *
    * @param fileType
    * @param writerClsName
    */
  def registerWriter(fileType: String, writerClsName: String): Unit = js.native
  /**
    *
    * @param formatter
    */
  def setExportFormatter(formatter: js.Any): Unit = js.native
}

