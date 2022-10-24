package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calculate extends StObject {
  
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
  
  var defaults: Model
  
  var model: Model
}
object Calculate {
  
  inline def apply(
    addCustomFunction: (String, String) => Unit,
    addNamedRange: (String, String) => Unit,
    adjustRangeArg: String => String,
    clearFormulaDependentCells: String => Unit,
    clearLibraryComputationException: () => Unit,
    colIndex: String => Unit,
    computeFormula: String => String,
    computedValue: String => String,
    defaults: typings.ejWebAll.ej.Model,
    model: typings.ejWebAll.ej.Model
  ): Calculate = {
    val __obj = js.Dynamic.literal(addCustomFunction = js.Any.fromFunction2(addCustomFunction), addNamedRange = js.Any.fromFunction2(addNamedRange), adjustRangeArg = js.Any.fromFunction1(adjustRangeArg), clearFormulaDependentCells = js.Any.fromFunction1(clearFormulaDependentCells), clearLibraryComputationException = js.Any.fromFunction0(clearLibraryComputationException), colIndex = js.Any.fromFunction1(colIndex), computeFormula = js.Any.fromFunction1(computeFormula), computedValue = js.Any.fromFunction1(computedValue), defaults = defaults.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculate]
  }
  
  trait Model extends StObject
  
  extension [Self <: Calculate](x: Self) {
    
    inline def setAddCustomFunction(value: (String, String) => Unit): Self = StObject.set(x, "addCustomFunction", js.Any.fromFunction2(value))
    
    inline def setAddNamedRange(value: (String, String) => Unit): Self = StObject.set(x, "addNamedRange", js.Any.fromFunction2(value))
    
    inline def setAdjustRangeArg(value: String => String): Self = StObject.set(x, "adjustRangeArg", js.Any.fromFunction1(value))
    
    inline def setClearFormulaDependentCells(value: String => Unit): Self = StObject.set(x, "clearFormulaDependentCells", js.Any.fromFunction1(value))
    
    inline def setClearLibraryComputationException(value: () => Unit): Self = StObject.set(x, "clearLibraryComputationException", js.Any.fromFunction0(value))
    
    inline def setColIndex(value: String => Unit): Self = StObject.set(x, "colIndex", js.Any.fromFunction1(value))
    
    inline def setComputeFormula(value: String => String): Self = StObject.set(x, "computeFormula", js.Any.fromFunction1(value))
    
    inline def setComputedValue(value: String => String): Self = StObject.set(x, "computedValue", js.Any.fromFunction1(value))
    
    inline def setDefaults(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
