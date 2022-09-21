package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Calculate")
@js.native
open class Calculate protected ()
  extends StObject
     with typings.ejWebAll.ej.Calculate {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
  
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
  
  /* CompleteClass */
  var defaults: typings.ejWebAll.ej.Model = js.native
  
  /* CompleteClass */
  var model: typings.ejWebAll.ej.Model = js.native
}
object Calculate {
  
  @JSGlobal("ej.Calculate")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Calculate.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.Calculate.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Calculate = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Calculate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
