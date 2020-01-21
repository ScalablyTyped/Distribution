package typings.dojo.dojox.grid.enhanced.plugins.exporter

import typings.dojo.dojox.grid.EnhancedGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("dojox.grid.enhanced.plugins.exporter._ExportWriter")
@js.native
class ExportWriter () extends js.Object {
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

