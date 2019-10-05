package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Calculate")
@js.native
class Calculate_ protected () extends js.Object {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.Calculate.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.Calculate.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.Calculate.Model = js.native
  var model: typings.ejDotWebDotAll.ej.Calculate.Model = js.native
  /** Add the custom formulas with function in CalcEngine library
    * @param {string} pass the formula name
    * @param {string} pass the custom function name to call
    * @returns {void}
    */
  def addCustomFunction(FormulaName: String, FunctionName: String): Unit = js.native
  /** Adds a named range to the NamedRanges collection
    * @param {string} pass the namedRange's name
    * @param {string} pass the cell range of NamedRange
    * @returns {void}
    */
  def addNamedRange(Name: String, cellRange: String): Unit = js.native
  /** Accepts a possible parsed formula and returns the calculated value without quotes.
    * @param {string} pass the cell range to adjust its range
    * @returns {string}
    */
  def adjustRangeArg(Name: String): String = js.native
  /** When a formula cell changes, call this method to clear it from its dependent cells.
    * @param {string} pass the changed cell address
    * @returns {void}
    */
  def clearFormulaDependentCells(Cell: String): Unit = js.native
  /** Call this method to clear whether an exception was raised during the computation of a library function.
    * @returns {void}
    */
  def clearLibraryComputationException(): Unit = js.native
  /** Get the column index from a cell reference passed in.
    * @param {string} pass the cell address
    * @returns {void}
    */
  def colIndex(Cell: String): Unit = js.native
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computeFormula(Formula: String): String = js.native
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computedValue(Formula: String): String = js.native
}

