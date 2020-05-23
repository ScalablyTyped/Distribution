package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pre-compiled SQL statement.
  */
@js.native
trait SqliteStatement extends js.Object {
  def bindBlob(index: Double, bytes: String): Unit = js.native
  def bindBlob(index: Double, bytes: js.Array[Double]): Unit = js.native
  /**
    * Binds the blob `bytes` to `index`.
    *
    * @param index 1-based index.
    * @param bytes Blob value to bind.
    */
  def bindBlob(index: Double, bytes: ArrayBuffer): Unit = js.native
  /**
    * Binds the floating point `value` to `index`.
    *
    * @param index 1-based index.
    * @param value Floating point value to bind.
    */
  def bindFloat(index: Double, value: Double): Unit = js.native
  /**
    * Binds the integer `value` to `index`.
    *
    * @param index 1-based index.
    * @param value Integer value to bind.
    */
  def bindInteger(index: Double, value: Double): Unit = js.native
  /**
    * Binds a `null` value to `index`.
    *
    * @param index 1-based index.
    */
  def bindNull(index: Double): Unit = js.native
  /**
    * Binds the text `value` to `index`.
    * @param index 1-based index.
    * @param value Text value to bind.
    */
  def bindText(index: Double, value: String): Unit = js.native
  /**
    * Resets internal state to allow subsequent queries.
    */
  def reset(): Unit = js.native
  /**
    * Either starts a new query and gets the first result, or moves to the
    * next one.
    *
    * Returns an array containing the values in the order specified by the
    * query, or `null` when the last result is reached. You should call
    * `reset()` at that point if you intend to use this object again.
    */
  def step(): js.Array[_] | Null = js.native
}

