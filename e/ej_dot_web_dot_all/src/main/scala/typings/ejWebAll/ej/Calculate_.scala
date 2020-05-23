package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calculate_ extends js.Object {
  var defaults: typings.ejWebAll.ej.Calculate.Model
  var model: typings.ejWebAll.ej.Calculate.Model
  /** Add the custom formulas with function in CalcEngine library
    * @param {string} pass the formula name
    * @param {string} pass the custom function name to call
    * @returns {void}
    */
  def addCustomFunction(FormulaName: String, FunctionName: String): Unit
  /** Adds a named range to the NamedRanges collection
    * @param {string} pass the namedRange's name
    * @param {string} pass the cell range of NamedRange
    * @returns {void}
    */
  def addNamedRange(Name: String, cellRange: String): Unit
  /** Accepts a possible parsed formula and returns the calculated value without quotes.
    * @param {string} pass the cell range to adjust its range
    * @returns {string}
    */
  def adjustRangeArg(Name: String): String
  /** When a formula cell changes, call this method to clear it from its dependent cells.
    * @param {string} pass the changed cell address
    * @returns {void}
    */
  def clearFormulaDependentCells(Cell: String): Unit
  /** Call this method to clear whether an exception was raised during the computation of a library function.
    * @returns {void}
    */
  def clearLibraryComputationException(): Unit
  /** Get the column index from a cell reference passed in.
    * @param {string} pass the cell address
    * @returns {void}
    */
  def colIndex(Cell: String): Unit
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computeFormula(Formula: String): String
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computedValue(Formula: String): String
}

object Calculate_ {
  @scala.inline
  def apply(
    addCustomFunction: (String, String) => Unit,
    addNamedRange: (String, String) => Unit,
    adjustRangeArg: String => String,
    clearFormulaDependentCells: String => Unit,
    clearLibraryComputationException: () => Unit,
    colIndex: String => Unit,
    computeFormula: String => String,
    computedValue: String => String,
    defaults: typings.ejWebAll.ej.Calculate.Model,
    model: typings.ejWebAll.ej.Calculate.Model
  ): Calculate_ = {
    val __obj = js.Dynamic.literal(addCustomFunction = js.Any.fromFunction2(addCustomFunction), addNamedRange = js.Any.fromFunction2(addNamedRange), adjustRangeArg = js.Any.fromFunction1(adjustRangeArg), clearFormulaDependentCells = js.Any.fromFunction1(clearFormulaDependentCells), clearLibraryComputationException = js.Any.fromFunction0(clearLibraryComputationException), colIndex = js.Any.fromFunction1(colIndex), computeFormula = js.Any.fromFunction1(computeFormula), computedValue = js.Any.fromFunction1(computedValue), defaults = defaults.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculate_]
  }
}

