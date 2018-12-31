package typings
package easyDashTableLib.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EasyTable extends js.Object {
  /**
    * String to separate columns
    */
  var separator: java.lang.String = js.native
  /**
    * Write cell in the current row
    *
    * @param {String} col          - Column name
    * @param {Any} val             - Cell value
    * @param {Function} [printer]  - Printer function to format the value
    * @returns {Table} `this`
    */
  def cell[T](col: java.lang.String, `val`: T): this.type = js.native
  def cell[T](col: java.lang.String, `val`: T, printer: easyDashTableLib.CellPrinter[T]): this.type = js.native
  /**
    * Get list of columns in printing order
    *
    * @returns {string[]}
    */
  def columns(): js.Array[java.lang.String] = js.native
  /**
    * Compute all totals and yield the results to `cb`
    *
    * @param {Function} cb - Callback function with signature `(column, value, printer)`
    */
  def forEachTotal[T](
    cb: js.Function3[
      /* column */ java.lang.String, 
      /* value */ T, 
      /* printer */ easyDashTableLib.CellPrinter[T], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Same as `.toString()` but yields the result to `console.log()`
    */
  def log(): scala.Unit = js.native
  /**
    * Push the current row to the table and start a new one
    *
    * @returns {Table} `this`
    */
  def newRow(): this.type = js.native
  /**
    * Format just rows, i.e. print the table without headers and totals
    *
    * @returns {String} String representaion of the table
    */
  def print(): java.lang.String = js.native
  /**
    * Format the table so that each row represents column and each column represents row
    *
    * @param {IPrintColumnOptions} [opts]
    * @returns {String}
    */
  def printTransposed[T](): java.lang.String = js.native
  def printTransposed[T](opts: PrintColumnOptions[T]): java.lang.String = js.native
  /**
    * Push delimeter row to the table (with each cell filled with dashs during printing)
    *
    * @param {String[]} [cols]
    * @returns {Table} `this`
    */
  def pushDelimeter(): this.type = js.native
  def pushDelimeter(cols: js.Array[java.lang.String]): this.type = js.native
  /**
    * Sort the table
    *
    * @param {Function|string[]} [cmp] - Either compare function or a list of columns to sort on
    * @returns {Table} `this`
    */
  def sort(): this.type = js.native
  def sort(cmp: js.Array[java.lang.String]): this.type = js.native
  def sort[T](cmp: easyDashTableLib.CompareFunction[T]): this.type = js.native
  /**
    * Sort the table
    *
    * @param {Function|string[]} [cmp] - Either compare function or a list of columns to sort on
    * @returns {Table} `this`
    */
  @JSName("sort")
  def sort_T[T](): this.type = js.native
  /**
    * Add a total for the column
    *
    * @param {String} col - column name
    * @param {Object} [opts]
    * @returns {Table} `this`
    */
  def total[T](col: java.lang.String): this.type = js.native
  def total[T](col: java.lang.String, opts: TotalOptions[T]): this.type = js.native
}

