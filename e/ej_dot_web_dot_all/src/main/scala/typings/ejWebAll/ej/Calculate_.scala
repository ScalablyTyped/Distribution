package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calculate_ extends js.Object {
  
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
  
  var defaults: typings.ejWebAll.ej.Calculate.Model = js.native
  
  var model: typings.ejWebAll.ej.Calculate.Model = js.native
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
  
  @scala.inline
  implicit class Calculate_Ops[Self <: Calculate_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCustomFunction(value: (String, String) => Unit): Self = this.set("addCustomFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddNamedRange(value: (String, String) => Unit): Self = this.set("addNamedRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAdjustRangeArg(value: String => String): Self = this.set("adjustRangeArg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearFormulaDependentCells(value: String => Unit): Self = this.set("clearFormulaDependentCells", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearLibraryComputationException(value: () => Unit): Self = this.set("clearLibraryComputationException", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColIndex(value: String => Unit): Self = this.set("colIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComputeFormula(value: String => String): Self = this.set("computeFormula", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComputedValue(value: String => String): Self = this.set("computedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaults(value: typings.ejWebAll.ej.Calculate.Model): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: typings.ejWebAll.ej.Calculate.Model): Self = this.set("model", value.asInstanceOf[js.Any])
  }
}
