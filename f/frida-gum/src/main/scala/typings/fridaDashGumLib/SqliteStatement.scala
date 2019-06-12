package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pre-compiled SQL statement.
  */
@JSGlobal("SqliteStatement")
@js.native
class SqliteStatement () extends js.Object {
  def bindBlob(index: scala.Double, bytes: java.lang.String): scala.Unit = js.native
  def bindBlob(index: scala.Double, bytes: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Binds the blob `bytes` to `index`.
    *
    * @param index 1-based index.
    * @param bytes Blob value to bind.
    */
  def bindBlob(index: scala.Double, bytes: stdLib.ArrayBuffer): scala.Unit = js.native
  /**
    * Binds the floating point `value` to `index`.
    *
    * @param index 1-based index.
    * @param value Floating point value to bind.
    */
  def bindFloat(index: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
    * Binds the integer `value` to `index`.
    *
    * @param index 1-based index.
    * @param value Integer value to bind.
    */
  def bindInteger(index: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
    * Binds a `null` value to `index`.
    *
    * @param index 1-based index.
    */
  def bindNull(index: scala.Double): scala.Unit = js.native
  /**
    * Binds the text `value` to `index`.
    * @param index 1-based index.
    * @param value Text value to bind.
    */
  def bindText(index: scala.Double, value: java.lang.String): scala.Unit = js.native
  /**
    * Resets internal state to allow subsequent queries.
    */
  def reset(): scala.Unit = js.native
  /**
    * Either starts a new query and gets the first result, or moves to the
    * next one.
    *
    * Returns an array containing the values in the order specified by the
    * query, or `null` when the last result is reached. You should call
    * `reset()` at that point if you intend to use this object again.
    */
  def step(): js.Array[_] | scala.Null = js.native
}

