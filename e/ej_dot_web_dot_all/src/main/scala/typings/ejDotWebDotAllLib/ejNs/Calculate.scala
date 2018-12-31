package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Calculate")
@js.native
class Calculate protected () extends js.Object {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.CalculateNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.CalculateNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.CalculateNs.Model = js.native
  var model: ejDotWebDotAllLib.ejNs.CalculateNs.Model = js.native
  /** Add the custom formulas with function in CalcEngine library
    * @param {string} pass the formula name
    * @param {string} pass the custom function name to call
    * @returns {void}
    */
  def addCustomFunction(FormulaName: java.lang.String, FunctionName: java.lang.String): scala.Unit = js.native
  /** Adds a named range to the NamedRanges collection
    * @param {string} pass the namedRange's name
    * @param {string} pass the cell range of NamedRange
    * @returns {void}
    */
  def addNamedRange(Name: java.lang.String, cellRange: java.lang.String): scala.Unit = js.native
  /** Accepts a possible parsed formula and returns the calculated value without quotes.
    * @param {string} pass the cell range to adjust its range
    * @returns {string}
    */
  def adjustRangeArg(Name: java.lang.String): java.lang.String = js.native
  /** When a formula cell changes, call this method to clear it from its dependent cells.
    * @param {string} pass the changed cell address
    * @returns {void}
    */
  def clearFormulaDependentCells(Cell: java.lang.String): scala.Unit = js.native
  /** Call this method to clear whether an exception was raised during the computation of a library function.
    * @returns {void}
    */
  def clearLibraryComputationException(): scala.Unit = js.native
  /** Get the column index from a cell reference passed in.
    * @param {string} pass the cell address
    * @returns {void}
    */
  def colIndex(Cell: java.lang.String): scala.Unit = js.native
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computeFormula(Formula: java.lang.String): java.lang.String = js.native
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computedValue(Formula: java.lang.String): java.lang.String = js.native
}

@JSGlobal("ej.Calculate")
@js.native
object Calculate extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Calculate = js.native
}

