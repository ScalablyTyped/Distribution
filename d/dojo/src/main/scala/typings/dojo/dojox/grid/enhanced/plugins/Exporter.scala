package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.EnhancedGrid
import typings.dojo.dojox.grid.enhanced._Plugin
import typings.dojo.dojox.grid.enhanced.plugins.exporter._ExportWriter
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
class Exporter protected () extends _Plugin {
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

@JSGlobal("dojox.grid.enhanced.plugins.exporter")
@js.native
object exporter extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/exporter/CSVWriter.html
    *
    * Export grid to CSV format.
    *
    * @param writerArgs       Optional{separator:'...'}
    */
  @js.native
  class CSVWriter () extends _ExportWriter {
    def this(writerArgs: js.Object) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/exporter/TableWriter.html
    *
    * Export grid to HTML table format. Primarily used by Printer plugin.
    *
    * @param writerArgs       Optional
    */
  @js.native
  class TableWriter () extends _ExportWriter {
    def this(writerArgs: js.Object) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/exporter/_ExportWriter.html
    *
    * This is an abstract class for all kinds of writers used in the Exporter plugin.
    * It utilizes the strategy pattern to break the export work into several stages,
    * and provide interfaces for all of them.
    *
    * Implementations might choose some of the functions in this class to override,
    * thus providing their own functionalities.
    *
    * The Exporter will go through the grid line by line. So in every line, all the Views
    * will be reached, and the header line is only handled once.
    *
    * An argObj object is passed to most functions of this class.
    * It carries context arguments that make sense when they are called.
    *
    * @param writerArgs       OptionalAny implementation of this class might accept a writerArgs object (optional),which contains some writer-specific arguments given by the user.
    */
  @js.native
  class _ExportWriter () extends js.Object {
    def this(writerArgs: js.Object) = this()
    /**
      *
      */
    var argObj: js.Object = js.native
    /**
      * We have finished the entire grid travel.
      * Do some clean up work if you need to.
      *
      */
    def afterContent(): js.Any = js.native
    /**
      * After handling a line of data (not header).
      *
      * @param argObj An object with at least the following context properties available:{    grid,isHeader,    row,rowIdx,    spCols}
      */
    def afterContentRow(argObj: js.Object): js.Any = js.native
    /**
      * The header line has been handled.
      *
      */
    def afterHeader(): js.Any = js.native
    /**
      * Before handling a subrow in a line (defined in the grid structure).
      *
      * @param argObj An object with at least the following context properties available:{    grid,isHeader,    row,rowIdx,    view,viewIdx,    subrow,subrowIdx,    spCols(if isHeader==false)}
      */
    def afterSubrow(argObj: js.Object): js.Any = js.native
    /**
      * After handling a view.
      *
      * @param argObj An object with at least the following context properties available:{    grid,isHeader,    view,viewIdx,    spCols(if isHeader==false)}
      */
    def afterView(argObj: js.Object): js.Any = js.native
    /**
      * We are ready to go through all the contents(items).
      *
      * @param items All the items fetched from the store
      */
    def beforeContent(items: js.Array[_]): js.Any = js.native
    /**
      * Before handling a line of data (not header).
      *
      * @param argObj An object with at least the following context properties available:{    grid,isHeader,    row,rowIdx,    spCols}
      */
    def beforeContentRow(argObj: js.Object): js.Any = js.native
    /**
      * We are going to start the travel in the grid.
      * Is there anything we should do now?
      *
      * @param grid
      */
    def beforeHeader(grid: EnhancedGrid): js.Any = js.native
    /**
      * Before handling a subrow in a line (defined in the grid structure).
      *
      * @param argObj An object with at least the following context properties available:{    grid,isHeader,    row,rowIdx,    view,viewIdx,    subrow,subrowIdx,    spCols(if isHeader==false)}
      */
    def beforeSubrow(argObj: js.Object): js.Any = js.native
    /**
      * Before handling a view.
      *
      * @param argObj An object with at least the following context properties available:{    grid,isHeader,    view,viewIdx,    spCols(if isHeader==false)}
      */
    def beforeView(argObj: js.Object): js.Any = js.native
    /**
      * Handle a header cell or data cell.
      *
      * @param argObj An object with at least the following context properties available:{    grid,isHeader,    row,rowIdx,    view,viewIdx,    subrow,subrowIdx,    cell,cellIdx,    spCols(if isHeader==false)}
      */
    def handleCell(argObj: js.Object): js.Any = js.native
  }
  
}

