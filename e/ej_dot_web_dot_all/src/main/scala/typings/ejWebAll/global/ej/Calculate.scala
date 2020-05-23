package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Calculate")
@js.native
class Calculate protected ()
  extends typings.ejWebAll.ej.Calculate {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Calculate.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Calculate.Model) = this()
  /* CompleteClass */
  override var defaults: typings.ejWebAll.ej.Calculate.Model = js.native
  /* CompleteClass */
  override var model: typings.ejWebAll.ej.Calculate.Model = js.native
  /** Add the custom formulas with function in CalcEngine library
    * @param {string} pass the formula name
    * @param {string} pass the custom function name to call
    * @returns {void}
    */
  /* CompleteClass */
  override def addCustomFunction(FormulaName: String, FunctionName: String): Unit = js.native
  /** Adds a named range to the NamedRanges collection
    * @param {string} pass the namedRange's name
    * @param {string} pass the cell range of NamedRange
    * @returns {void}
    */
  /* CompleteClass */
  override def addNamedRange(Name: String, cellRange: String): Unit = js.native
  /** Accepts a possible parsed formula and returns the calculated value without quotes.
    * @param {string} pass the cell range to adjust its range
    * @returns {string}
    */
  /* CompleteClass */
  override def adjustRangeArg(Name: String): String = js.native
  /** When a formula cell changes, call this method to clear it from its dependent cells.
    * @param {string} pass the changed cell address
    * @returns {void}
    */
  /* CompleteClass */
  override def clearFormulaDependentCells(Cell: String): Unit = js.native
  /** Call this method to clear whether an exception was raised during the computation of a library function.
    * @returns {void}
    */
  /* CompleteClass */
  override def clearLibraryComputationException(): Unit = js.native
  /** Get the column index from a cell reference passed in.
    * @param {string} pass the cell address
    * @returns {void}
    */
  /* CompleteClass */
  override def colIndex(Cell: String): Unit = js.native
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  /* CompleteClass */
  override def computeFormula(Formula: String): String = js.native
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  /* CompleteClass */
  override def computedValue(Formula: String): String = js.native
}

/* static members */
@JSGlobal("ej.Calculate")
@js.native
object Calculate extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.Calculate = js.native
}

