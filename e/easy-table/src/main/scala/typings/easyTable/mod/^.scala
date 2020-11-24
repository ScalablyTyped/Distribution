package typings.easyTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("easy-table", JSImport.Namespace)
@js.native
class ^ () extends EasyTable
@JSImport("easy-table", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Predefined helpers for totals
    */
  var aggr: Aggregators = js.native
  
  /**
    * Create a printer which right aligns the content by padding with `ch` on the left
    *
    * @param {String} ch
    * @returns {Function}
    */
  def leftPadder[T](ch: String): CellPrinter[T] = js.native
  
  /**
    * Same as `Table.print()` but yields the result to `console.log()`
    */
  def log[T](obj: T): Unit = js.native
  def log[T](obj: T, format: js.UndefOr[scala.Nothing], cb: TablePostProcessing): Unit = js.native
  def log[T](obj: T, format: FormatFunction[T]): Unit = js.native
  def log[T](obj: T, format: FormatFunction[T], cb: TablePostProcessing): Unit = js.native
  def log[T](obj: T, format: FormatObject): Unit = js.native
  def log[T](obj: T, format: FormatObject, cb: TablePostProcessing): Unit = js.native
  def log[T](obj: js.Array[T]): Unit = js.native
  def log[T](obj: js.Array[T], format: js.UndefOr[scala.Nothing], cb: TablePostProcessing): Unit = js.native
  def log[T](obj: js.Array[T], format: FormatFunction[T]): Unit = js.native
  def log[T](obj: js.Array[T], format: FormatFunction[T], cb: TablePostProcessing): Unit = js.native
  def log[T](obj: js.Array[T], format: FormatObject): Unit = js.native
  def log[T](obj: js.Array[T], format: FormatObject, cb: TablePostProcessing): Unit = js.native
  
  // public static padRight: CellPrinter<string>;
  /**
    * Create a printer for numbers
    *
    * Will do right alignment and optionally fix the number of digits after decimal point
    *
    * @param {Number} [digits] - Number of digits for fixpoint notation
    * @returns {Function}
    */
  def number(): CellPrinter[Double] = js.native
  def number(digits: Double): CellPrinter[Double] = js.native
  
  def padLeft(`val`: String, width: Double): String = js.native
  @JSName("padLeft")
  var padLeft_Original: CellPrinter[String] = js.native
  
  /**
    * Print the array or object
    *
    * @param {Array|Object} obj - Object to print
    * @param {Function|Object} [format] - Format options
    * @param {Function} [cb] - Table post processing and formating
    * @returns {String}
    */
  def print[T](obj: T): String = js.native
  def print[T](obj: T, format: js.UndefOr[scala.Nothing], cb: TablePostProcessing): String = js.native
  def print[T](obj: T, format: FormatFunction[T]): String = js.native
  def print[T](obj: T, format: FormatFunction[T], cb: TablePostProcessing): String = js.native
  def print[T](obj: T, format: FormatObject): String = js.native
  def print[T](obj: T, format: FormatObject, cb: TablePostProcessing): String = js.native
  def print[T](obj: js.Array[T]): String = js.native
  def print[T](obj: js.Array[T], format: js.UndefOr[scala.Nothing], cb: TablePostProcessing): String = js.native
  def print[T](obj: js.Array[T], format: FormatFunction[T]): String = js.native
  def print[T](obj: js.Array[T], format: FormatFunction[T], cb: TablePostProcessing): String = js.native
  def print[T](obj: js.Array[T], format: FormatObject): String = js.native
  def print[T](obj: js.Array[T], format: FormatObject, cb: TablePostProcessing): String = js.native
  
  /**
    * Create a printer which pads with `ch` on the right
    *
    * @param {String} ch
    * @returns {Function}
    */
  def rightPadder[T](ch: String): CellPrinter[T] = js.native
  
  /**
    * Default printer
    */
  def string(value: js.Any): String = js.native
}
