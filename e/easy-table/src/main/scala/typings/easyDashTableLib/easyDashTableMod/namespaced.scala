package typings
package easyDashTableLib.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-table", JSImport.Namespace)
@js.native
class namespaced () extends EasyTable

@JSImport("easy-table", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * Predefined helpers for totals
    */
  var aggr: easyDashTableLib.easyDashTableMod.Aggregators = js.native
  @JSName("padLeft")
  var padLeft_Original: easyDashTableLib.CellPrinter[java.lang.String] = js.native
  /**
    * Create a printer which right aligns the content by padding with `ch` on the left
    *
    * @param {String} ch
    * @returns {Function}
    */
  def leftPadder[T](ch: java.lang.String): easyDashTableLib.CellPrinter[T] = js.native
  /**
    * Same as `Table.print()` but yields the result to `console.log()`
    */
  def log[T](obj: T): scala.Unit = js.native
  def log[T](obj: T, format: easyDashTableLib.FormatFunction[T]): scala.Unit = js.native
  def log[T](obj: T, format: easyDashTableLib.FormatFunction[T], cb: easyDashTableLib.TablePostProcessing): scala.Unit = js.native
  def log[T](obj: T, format: easyDashTableLib.easyDashTableMod.FormatObject): scala.Unit = js.native
  def log[T](
    obj: T,
    format: easyDashTableLib.easyDashTableMod.FormatObject,
    cb: easyDashTableLib.TablePostProcessing
  ): scala.Unit = js.native
  def log[T](obj: js.Array[T]): scala.Unit = js.native
  def log[T](obj: js.Array[T], format: easyDashTableLib.FormatFunction[T]): scala.Unit = js.native
  def log[T](
    obj: js.Array[T],
    format: easyDashTableLib.FormatFunction[T],
    cb: easyDashTableLib.TablePostProcessing
  ): scala.Unit = js.native
  def log[T](obj: js.Array[T], format: easyDashTableLib.easyDashTableMod.FormatObject): scala.Unit = js.native
  def log[T](
    obj: js.Array[T],
    format: easyDashTableLib.easyDashTableMod.FormatObject,
    cb: easyDashTableLib.TablePostProcessing
  ): scala.Unit = js.native
  // public static padRight: CellPrinter<string>;
  /**
    * Create a printer for numbers
    *
    * Will do right alignment and optionally fix the number of digits after decimal point
    *
    * @param {Number} [digits] - Number of digits for fixpoint notation
    * @returns {Function}
    */
  def number(): easyDashTableLib.CellPrinter[scala.Double] = js.native
  def number(digits: scala.Double): easyDashTableLib.CellPrinter[scala.Double] = js.native
  def padLeft(`val`: java.lang.String, width: scala.Double): java.lang.String = js.native
  /**
    * Print the array or object
    *
    * @param {Array|Object} obj - Object to print
    * @param {Function|Object} [format] - Format options
    * @param {Function} [cb] - Table post processing and formating
    * @returns {String}
    */
  def print[T](obj: T): java.lang.String = js.native
  def print[T](obj: T, format: easyDashTableLib.FormatFunction[T]): java.lang.String = js.native
  def print[T](obj: T, format: easyDashTableLib.FormatFunction[T], cb: easyDashTableLib.TablePostProcessing): java.lang.String = js.native
  def print[T](obj: T, format: easyDashTableLib.easyDashTableMod.FormatObject): java.lang.String = js.native
  def print[T](
    obj: T,
    format: easyDashTableLib.easyDashTableMod.FormatObject,
    cb: easyDashTableLib.TablePostProcessing
  ): java.lang.String = js.native
  def print[T](obj: js.Array[T]): java.lang.String = js.native
  def print[T](obj: js.Array[T], format: easyDashTableLib.FormatFunction[T]): java.lang.String = js.native
  def print[T](
    obj: js.Array[T],
    format: easyDashTableLib.FormatFunction[T],
    cb: easyDashTableLib.TablePostProcessing
  ): java.lang.String = js.native
  def print[T](obj: js.Array[T], format: easyDashTableLib.easyDashTableMod.FormatObject): java.lang.String = js.native
  def print[T](
    obj: js.Array[T],
    format: easyDashTableLib.easyDashTableMod.FormatObject,
    cb: easyDashTableLib.TablePostProcessing
  ): java.lang.String = js.native
  /**
    * Create a printer which pads with `ch` on the right
    *
    * @param {String} ch
    * @returns {Function}
    */
  def rightPadder[T](ch: java.lang.String): easyDashTableLib.CellPrinter[T] = js.native
  /**
    * Default printer
    */
  def string(value: js.Any): java.lang.String = js.native
}

